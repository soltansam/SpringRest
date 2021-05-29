package net.javaheap.springApp.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Controller
public class HelloController {


    @ResponseBody
    @RequestMapping("/")
    String home() {
        return "Hello World";
    }

}
