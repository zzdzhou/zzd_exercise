package jack.springframework.orm.jpa;

import jack.springframework.orm.jpa.Service.UserService;
import jack.springframework.orm.jpa.dao.UserDao;
import jack.springframework.orm.jpa.dao.UserDaoTx;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;

@Configuration
@ComponentScan("jack.springframework.orm.jpa")
public class AppConfig {

    // takes advantage of annotations to require the injection of the default EntityManagerFactory
    // it is managed by spring
    @Bean
    public PersistenceAnnotationBeanPostProcessor persistenceAnnotationBeanPostProcessor() {
        return new PersistenceAnnotationBeanPostProcessor();
    }

/*    @Bean
    public LocalEntityManagerFactoryBean myEmf() {
        LocalEntityManagerFactoryBean localEntityManagerFactoryBean = new LocalEntityManagerFactoryBean();
        localEntityManagerFactoryBean.setPersistenceUnitName("HibernateUnit");
        return localEntityManagerFactoryBean;
    }*/

/*    @Bean
    public UserDao userDao() {
        return new UserDao();
    }*/

    @Bean
    public UserDaoTx userDaoTx() {
        return new UserDaoTx();
    }

    @Bean
    public UserService userService() {
        return new UserService();
    }


}
