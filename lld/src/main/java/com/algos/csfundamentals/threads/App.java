package com.algos.csfundamentals.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World printed by "+Thread.currentThread().getName());
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i=0; i<100; i++) {
            Printer printer = new Printer(String.valueOf(i));
            executor.execute(printer);
        }
        executor.shutdown();
    }
}
