package com.springboot.application.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

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
        ProcessBuilder processBuilder = new ProcessBuilder();
        Map<String, String> variables = processBuilder.environment();
        return "Accessing Home and Environment directories: " + variables;
    }

}
