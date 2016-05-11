package com.springboot.application.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class SampleController {

    @RequestMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "Hi its working!";
    }

    @RequestMapping("/home")
    @ResponseBody
    public String rest() {
        return "Accessing Home and Java directory: " + System.getenv("JAVA_HOME");
    }

}
