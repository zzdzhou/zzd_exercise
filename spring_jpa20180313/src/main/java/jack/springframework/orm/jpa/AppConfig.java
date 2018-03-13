package jack.springframework.orm.jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class AppConfig {

    @Bean
    public LocalEntityManagerFactoryBean myEmf() {
        return new LocalEntityManagerFactoryBean();
    }

}
