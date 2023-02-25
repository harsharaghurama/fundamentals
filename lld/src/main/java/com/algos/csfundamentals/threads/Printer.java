package com.algos.csfundamentals.threads;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Printer implements Runnable{
    private String text;

    public void run() {
        System.out.println(text+" printed by "+Thread.currentThread().getName());
    }
}
