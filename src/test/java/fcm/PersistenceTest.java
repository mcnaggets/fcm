package fcm;

import fcm.model.FcmEntity;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class PersistenceTest extends AbstractBaseTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void testEntityManager() {
        final FcmEntity entity = new FcmEntity();
        entity.setIak("1");
        entityManager.persist(entity);
        entityManager.flush();
        assertThat(entity.getId(), notNullValue());
    }

}
