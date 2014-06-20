package fcm;

import fcm.model.FcmEntity;
import fcm.repositories.FcmEntityRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.util.ReflectionTestUtils;

import java.beans.PropertyDescriptor;
import java.util.Date;
import java.util.Random;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public abstract class FcmEntityRepositoryTestSupport extends AbstractBaseTest {

    @Autowired
    protected FcmEntityRepository repository;
    private FcmEntity givenEntity;
    private FcmEntity repositoryOne;

    protected void givenEntity() {
        givenEntity = new FcmEntity();
        populateEntityFields();
        repository.saveAndFlush(givenEntity);
        assertThat(givenEntity.getId(), notNullValue());
    }

    protected void givenEntityWithIllegalIak() {
        givenEntity = new FcmEntity();
        // case Iak field type is VARCHAR2(1 CHAR) '11' is illegal
        givenEntity.setIak("11");
    }

    protected void givenEntityWithIllegalKln() {
        givenEntity = new FcmEntity();
        // case Kln field type is NUMBER(2,0) Byte.MAX_VALUE is illegal
        givenEntity.setKln(Byte.MAX_VALUE);
    }

    private void populateEntityFields() {
        final PropertyDescriptor[] descriptors = BeanUtils.getPropertyDescriptors(FcmEntity.class);
        final Random random = new Random();
        for (PropertyDescriptor descriptor : descriptors) {
            if (descriptor.getPropertyType() == Integer.TYPE) {
                ReflectionTestUtils.setField(givenEntity, descriptor.getName(), random.nextInt(10));
            } else if (descriptor.getPropertyType() == Byte.TYPE) {
                ReflectionTestUtils.setField(givenEntity, descriptor.getName(), (byte) random.nextInt(5));
            } else if (descriptor.getPropertyType() == String.class) {
                ReflectionTestUtils.setField(givenEntity, descriptor.getName(), generateString(random, "qwertyuiopasdfghjklzxcvbnm", 1));
            } else if (descriptor.getPropertyType() == Date.class) {
                ReflectionTestUtils.setField(givenEntity, descriptor.getName(), new Date());
            }
        }
    }

    protected void thanItNotFoundInRepository() {
        assertThat(repository.findOne(givenEntity.getId()), nullValue());
    }

    protected void thanRepositoryEntityEqualsToGiven() {
        assertEquals(givenEntity, repositoryOne);
    }

    protected void whenDeleteThisEntity() {
        repository.delete(givenEntity);
    }

    protected void whenFindFindThisEntityInRepository() {
        repositoryOne = repository.findOne(givenEntity.getId());
    }

    private String generateString(Random random, String characters, int length) {
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }
        return new String(text);
    }

    protected void whenSaveEntityThrowsException() {
        repository.saveAndFlush(givenEntity);
    }
}
