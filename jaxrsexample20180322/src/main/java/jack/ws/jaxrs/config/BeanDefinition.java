package jack.ws.jaxrs.config;

import jack.ws.jaxrs.service.HelloWorld;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDefinition {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

    @Bean(initMethod = "init")
    public JAXRSServerFactoryBean jaxrsServerFactoryBean() {
        JAXRSServerFactoryBean jaxrsFB = new JAXRSServerFactoryBean();
//        jaxrsFB.init();
        jaxrsFB.setAddress("/myapp");
        jaxrsFB.setServiceBean(helloWorld());  // how to ref
        return jaxrsFB;
    }
}
