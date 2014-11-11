package fcm;

import fcm.model.TestModel;
import fcm.repositories.TestModelRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.IntStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class TestModelRepositoryTest extends AbstractBaseTest {

    @Autowired
    TestModelRepository repository;

    @Test
    public void testTestModel() {
        TestModel model = new TestModel();
        model.setLocalDate(LocalDate.now());
        model.setLocalDateTime(LocalDateTime.now());
        repository.save(model);
        assertThat(model.getId(), notNullValue());
        model = repository.findOne(model.getId());
        assertThat(model.getLocalDate(), notNullValue());
        assertThat(model.getLocalDateTime(), notNullValue());
    }

    @Test
    public void testTestModelSearch() {
        Random random = new Random();
        IntStream.generate(() -> random.nextInt(10)).limit(20).forEach(number -> {
            TestModel model = new TestModel();
            model.setLocalDate(LocalDate.now().minusDays(number));
            model.setLocalDateTime(LocalDateTime.now().minusHours(number).plusMinutes(random.nextInt(10)));
            repository.save(model);
        });
        final List<TestModel> models = repository.findAll(new Sort(new Sort.Order(Sort.Direction.ASC, "localDate")));
        final ArrayList<TestModel> sortedModels = new ArrayList<>(models);
        Collections.sort(sortedModels, Comparator.comparing(TestModel::getLocalDate));
        assertThat(models, equalTo(sortedModels));
    }


}
