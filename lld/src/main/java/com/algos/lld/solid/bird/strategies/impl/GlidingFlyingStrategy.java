package com.algos.lld.solid.bird.strategies.impl;

import com.algos.lld.solid.bird.strategies.FlyingStrategy;

public class GlidingFlyingStrategy implements FlyingStrategy {
    @Override
    public void fly() {
        System.out.println("Gliding and flying");
    }
}
