package fcm;

import org.junit.Test;
import org.springframework.orm.jpa.JpaSystemException;

public class FcmEntityRepositoryTest extends FcmEntityRepositoryTestSupport {

    @Test
    public void testRepo() {
        givenEntity();

        whenFindFindThisEntityInRepository();
        thanRepositoryEntityEqualsToGiven();

        whenDeleteThisEntity();
        thanItNotFoundInRepository();
    }

    @Test(expected = JpaSystemException.class)
    public void testIllegalIak() {
        givenEntityWithIllegalIak();
        whenSaveEntityThrowsException();
    }

    @Test(expected = JpaSystemException.class)
    public void testIllegalKln() {
        givenEntityWithIllegalKln();
        whenSaveEntityThrowsException();
    }

}
