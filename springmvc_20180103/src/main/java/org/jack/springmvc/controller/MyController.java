package org.jack.springmvc.controller;

import org.springframework.cache.interceptor.CacheInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Serializable;

@Controller
public class MyController implements Serializable {

    @GetMapping("/")
    public String index() {
        new CacheInterceptor();
        return "index";
    }

}
