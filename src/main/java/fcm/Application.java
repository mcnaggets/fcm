package fcm;

import fcm.config.ApplicationConfig;
import fcm.model.FcmEntity;
import fcm.repositories.FcmEntityRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        final FcmEntityRepository repository = context.getBean(FcmEntityRepository.class);
        do {
            repository.saveAndFlush(new FcmEntity());
            Thread.sleep(20 * 1000);
        } while (true);
    }

}
