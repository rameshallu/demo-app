package com.nipunya.demo.interfaces.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @Value("${greet.name}")
    private String name;

    @Autowired
    private MessageSource messageSource;

    @GetMapping
    public String get(Locale locale) {
        return messageSource.getMessage("greeting", null, Locale.US) + " "  + name;
    }
}
