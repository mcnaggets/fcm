package fcm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("fcm")
@Import({
        PropertyConfig.class, // do leave this in first place!!!
        JpaConfig.class
})
public class ApplicationConfig {

}