package jack.springboot.springapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

@SpringBootApplication
public class SpringApplicationBootstrap {

    public static void main(String[] args) {
//        SpringApplication.run(SpringApplicationBootstrap.class, args);

        HashSet<String> sourceSet = new HashSet<>();
        sourceSet.add(SpringApplicationBootstrap.class.getName());

        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(sourceSet);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context = springApplication.run(args);
        System.out.println("bean: " + context.getBean(SpringApplicationBootstrap.class));


    }




}
