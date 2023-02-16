package com.algos.lld.solid.bird.strategies.impl;

import com.algos.lld.solid.bird.strategies.FlyingStrategy;

public class FlappingFlyingStrategy implements FlyingStrategy {
    @Override
    public void fly() {
        System.out.println("Flapping and flying");
    }
}
