package me.sigh.springboot.controller;

import me.sigh.springboot.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired private GreetingService greetingService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(String name){
        return greetingService.sayHello(name);
    }
}
