package com.fabsantini.java.kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cpu")
public class CpuController {

    @GetMapping
    public String stressCpu() throws InterruptedException {
        final int NUM_TESTS = 200;
        long start = System.nanoTime();

        // Para i < 200, somar 1 a i;
        for (int i = 0; i < NUM_TESTS; i++) {
            Thread.sleep(100);              // Coloca a thread para dormir a cada 100ms;
            System.out.println("cont = " + i);
            spin(500);                  // Espera de 500ms;
        }
        // Tempo atual - tempo no momento start/1000
        System.out.println("Took " + (System.nanoTime() - start) / 1000000 +
                "ms (expected " + (NUM_TESTS * 200) + ")");

        return "OK";
    }

    private static void spin(int milliseconds) {
        long sleepTime = milliseconds * 1000000L;               //vai converter para nanossegundos;
        long startTime = System.nanoTime();                     //Starta o tempo em nanossegundos;
        while ((System.nanoTime() - startTime) < sleepTime) {
        }
    }
}
