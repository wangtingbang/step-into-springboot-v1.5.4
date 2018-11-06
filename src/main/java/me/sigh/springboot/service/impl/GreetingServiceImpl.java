package me.sigh.springboot.service.impl;

import me.sigh.springboot.service.GreetingService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello(String name) {
        return "Hello " + (StringUtils.isEmpty(name) ? "anonymous" : name);
    }
}
