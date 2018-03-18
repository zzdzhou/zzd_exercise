package jack.springframework.orm.jpa;

import jack.springframework.orm.jpa.dao.UserDao;
import jack.springframework.orm.jpa.dao.UserDao2;
import jack.springframework.orm.jpa.service.UserService;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;

@Configuration
@ComponentScan("jack.springframework.orm.jpa")
public class AppConfig {

    // to use @PersistenceUnit and @PersistenceContext
    @Bean
    public PersistenceAnnotationBeanPostProcessor persistenceAnnotationBeanPostProcessor() {
        return new PersistenceAnnotationBeanPostProcessor();
    }

    // to use @Autowired
    @Bean
    public AutowiredAnnotationBeanPostProcessor autowiredAnnotationBeanPostProcessor() {
        return new AutowiredAnnotationBeanPostProcessor();
    }

    @Bean
    public LocalEntityManagerFactoryBean myEmf() {
        LocalEntityManagerFactoryBean localEntityManagerFactoryBean = new LocalEntityManagerFactoryBean();
        localEntityManagerFactoryBean.setPersistenceUnitName("hibernateUnit");
        return localEntityManagerFactoryBean;
    }

    @Bean
    public UserDao userDao() {
        return new UserDao();
    }

    @Bean
    public UserDao2 userDao2() {
        return new UserDao2();
    }

    @Bean
    public UserService userService() {
        return new UserService();
    }

}
