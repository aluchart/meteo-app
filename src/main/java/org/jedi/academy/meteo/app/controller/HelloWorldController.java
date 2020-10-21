package org.jedi.academy.meteo.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloWorldController {

    @GetMapping
    public String hello(@RequestParam(name="name", defaultValue = "World!") String name) {
        return "Hello " + name;
    }

    @GetMapping("/{name}")
    public String helloPath(@PathVariable String name) {
        return "Hello " + name;
    }
}
