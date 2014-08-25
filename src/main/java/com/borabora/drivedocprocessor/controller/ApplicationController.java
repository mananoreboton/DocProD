package com.borabora.drivedocprocessor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Borabora Systems
 * Created by mananoreboton on 17/08/14.
 */
@Controller
public class ApplicationController {

    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        //model.put("message", "Start processing!");
        model.put("title", "Process docs from Drive.");
        model.put("date", new Date());
        return "home";
    }

    @RequestMapping("/foo")
    public String foo() {
        throw new RuntimeException("Expected exception in controller");
    }
}
