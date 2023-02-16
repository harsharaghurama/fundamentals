package com.algos.lld.solid.bird.strategies.impl;

import com.algos.lld.solid.bird.strategies.SwimmingStrategy;

public class SmoothSwimmingStrategy implements SwimmingStrategy {
    @Override
    public void swim() {
        System.out.println("Smooth swimming");
    }
}
