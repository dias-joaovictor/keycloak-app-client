package com.dias.clientapp.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MainClient {

    @Autowired
    private RestTemplate restTemplate;

    public String getGreetingWithoutAuth(){
        return this.restTemplate.getForEntity("http://localhost:8080/api/greet", String.class).getBody();
    }

}
