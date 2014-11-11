package fcm;

import fcm.config.ApplicationConfig;
import fcm.model.FcmEntity;
import fcm.model.TestModel;
import fcm.repositories.FcmEntityRepository;
import fcm.repositories.TestModelRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        final TestModelRepository repository = context.getBean(TestModelRepository.class);
        do {
            final TestModel model = new TestModel();
            model.setLocalDate(LocalDate.now());
            model.setLocalDateTime(LocalDateTime.now());
            repository.saveAndFlush(model);
            Thread.sleep(20 * 1000);
        } while (true);
    }

}
