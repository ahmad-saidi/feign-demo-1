package com.training.feign.demo1.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "greeting-client", url = "http://localhost:8888/feign/demo")
public interface GreetingClient {

    @GetMapping("/greeting")
    public String greeting(@RequestParam String name);
}
