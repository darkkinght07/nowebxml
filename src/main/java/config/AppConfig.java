package config;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@CommonsLog
@EnableWebMvc
@Configuration
@ComponentScan({
        "controller"
})
public class AppConfig {

    public AppConfig() {
        log.info("app config initialized");
    }
}
