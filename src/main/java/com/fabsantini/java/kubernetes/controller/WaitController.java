package com.fabsantini.java.kubernetes.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wait")
public class WaitController {

    @GetMapping
    public String waitingFor() throws InterruptedException, UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();                       // Instanciando e pegando o IP;
        System.out.println("*** Seu endereço de IP é  : " + ip);           // Mostrando o IP;
        System.out.println("*** start waiting for 10 seconds...");          // Loading
        Thread.sleep(10000);                                           // Dormindo a thread por 10000ms;
        System.out.println("*** end of waiting... ");                       // Encerrando o loading;
        return "Sorry for being late...";                                    // retorna a String waitingFor;
    }

}
