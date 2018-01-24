package jack.spring.mvc.controller;

import org.springframework.cache.interceptor.CacheInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {

    @GetMapping("/")
    public String getIndex() {
        new CacheInterceptor();
        return "index";
    }
}
