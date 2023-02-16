package com.algos.lld.solid.bird;

import com.algos.lld.solid.bird.strategies.FlyingStrategy;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Sparrow extends Bird implements Flyable{

    FlyingStrategy flyingStrategy;

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName());
        flyingStrategy.fly();
    }
}
