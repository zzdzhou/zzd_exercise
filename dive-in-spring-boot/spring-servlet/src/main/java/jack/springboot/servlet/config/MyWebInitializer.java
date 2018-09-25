package jack.springboot.servlet.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@ComponentScan(basePackages = "jack.springboot.servlet.controller")
@Configuration // 起表示作用，可删除此注解
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {getClass()};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
