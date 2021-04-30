package com.fabsantini.java.kubernetes.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();            // Cria e instancia InetAddres, pegando o local host;
        System.out.println("Seu endereço de IP é  : " + ip);
        return "Hello " + ip;
    }

}
