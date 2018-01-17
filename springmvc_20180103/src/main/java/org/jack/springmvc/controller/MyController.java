package org.jack.springmvc.controller;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.cache.interceptor.CacheInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import java.io.Serializable;

@Controller
public class MyController implements Serializable {

    @GetMapping("/")
    public String index() {
        new CacheInterceptor();
        return "index";
    }

}
