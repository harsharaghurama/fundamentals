package com.algos.lld.solid.bird.strategies.impl;

import com.algos.lld.solid.bird.strategies.SwimmingStrategy;

public class SplashingSwimmingStrategy implements SwimmingStrategy {
    @Override
    public void swim() {
        System.out.println("Splashing and swimming");
    }
}
