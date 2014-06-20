package fcm;

import fcm.config.ApplicationConfig;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(classes = { ApplicationConfig.class })
@ActiveProfiles(profiles = "test")
public abstract class AbstractBaseTest extends AbstractTransactionalJUnit4SpringContextTests {
}
