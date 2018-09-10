package jack.springboot.webdemo.webdemo_20180901.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/docker-demo")
public class DemoController {

    @GetMapping
    public String docker() {
        return "demo";
    }
}
