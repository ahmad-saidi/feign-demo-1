package com.training.feign.demo1.service;

import com.training.feign.demo1.service.client.GreetingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    private GreetingClient greetingClient;

    public String formatGreeting(String name){
        return greetingClient.greeting(name);
    }
}
