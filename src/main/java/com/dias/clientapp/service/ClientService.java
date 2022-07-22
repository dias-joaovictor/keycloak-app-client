package com.dias.clientapp.service;

import com.dias.clientapp.client.MainClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private MainClient mainClient;

    public String getGreetWithoutAuth(){
        return mainClient.getGreetingWithoutAuth();
    }


}
