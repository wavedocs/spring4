package com.spring.mvc;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ApiController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/api")
    public @ResponseBody Api api(@RequestParam(value = "name", required = false, defaultValue = "!!!") String name){
        return new Api(counter.incrementAndGet(), String.format(template, name));
    }

}