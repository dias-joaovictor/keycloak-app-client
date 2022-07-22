package com.dias.clientapp.endpoint;

import com.dias.clientapp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientEndpoint {

    @Autowired
    private ClientService clientService;

    @GetMapping("/no-auth")
    public String tryWithoutAuth() {
        return clientService.getGreetWithoutAuth();
    }

    @GetMapping("/auth")
    public String tryWithAuth() {
        return null;
    }
}
