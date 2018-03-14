package jack.springframework.orm.jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan("jack.springframework.orm.jpa")
public class AppConfig {

    @Bean
    public LocalEntityManagerFactoryBean myEmf() {
        LocalEntityManagerFactoryBean localEntityManagerFactoryBean = new LocalEntityManagerFactoryBean();
        localEntityManagerFactoryBean.setPersistenceUnitName("");
        return localEntityManagerFactoryBean;
    }

}
