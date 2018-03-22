package jack.ws.jaxrs;

import jack.ws.jaxrs.config.BeanDefinition;
import jack.ws.jaxrs.service.HelloWorld;
import org.apache.cxf.binding.BindingFactoryManager;
import org.apache.cxf.jaxrs.JAXRSBindingFactory;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

//@ApplicationPath("/myapp")
public class MyApp /*extends Application*/ {

/*    private void init() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanDefinition.class);
        JAXRSServerFactoryBean sfb = (JAXRSServerFactoryBean) ctx.getBean("simple");
        sfb.create();
    }*/

    public static void main(String[] args) {
        JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
        sf.setResourceClasses(HelloWorld.class);
//        sf.setResourceProvider(HelloWorld.class, new SingletonResourceProvider(new HelloWorld()));
        sf.setAddress("http://localhost:8080/");
/*        BindingFactoryManager manager = sf.getBus().getExtension(BindingFactoryManager.class);
        JAXRSBindingFactory factory = new JAXRSBindingFactory();
        factory.setBus(sf.getBus());
        manager.registerBindingFactory(JAXRSBindingFactory.JAXRS_BINDING_ID, factory);*/
        sf.create();
    }
}
