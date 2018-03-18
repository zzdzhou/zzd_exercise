package jack.springframework.orm.jpa.main;

import jack.springframework.orm.jpa.AppConfig;
import jack.springframework.orm.jpa.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
/*        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();*/
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        userService.createUser("Jack", "jack.zhou@d1m.cn");
    }
}
