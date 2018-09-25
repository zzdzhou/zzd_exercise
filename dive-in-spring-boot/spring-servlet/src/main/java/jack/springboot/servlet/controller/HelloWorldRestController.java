package jack.springboot.servlet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
public class HelloWorldRestController {

    @GetMapping("/hello-world")
    public DeferredResult<String> helloWorld() {
        DeferredResult<String> result = new DeferredResult<>();
        result.setResult("Hello, world!");
        result.onCompletion(() -> {
            System.out.println("HelloWorldRestController: 操作结束");
        });
        return result;
    }


    private static void pringln(String string) {
        String threadName = Thread.currentThread().getName();
        System.out.println("HelloWorldRestController: [" + threadName + "]" + string);


    }
}
