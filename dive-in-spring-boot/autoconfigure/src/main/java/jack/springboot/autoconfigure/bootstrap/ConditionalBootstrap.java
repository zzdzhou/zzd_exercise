package jack.springboot.autoconfigure.bootstrap;

import jack.springboot.autoconfigure.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

public class ConditionalBootstrap {

    @Bean
    @ConditionalOnSystemProperty(key = "user.name", value = "Zhengde.ZHOU")
    public String helloWorld() {
        return "hello world";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(ConditionalBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = applicationContext.getBean("helloWorld", String.class);
        System.out.println(helloWorld);
        applicationContext.close();

    }
}
