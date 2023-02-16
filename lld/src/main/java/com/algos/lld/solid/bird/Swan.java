package com.algos.lld.solid.bird;

import com.algos.lld.solid.bird.strategies.FlyingStrategy;
import com.algos.lld.solid.bird.strategies.SwimmingStrategy;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Swan extends Bird implements Swimmable, Flyable{

    FlyingStrategy flyingStrategy;

    SwimmingStrategy swimmingStrategy;

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName());
        flyingStrategy.fly();
    }

    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName());
        swimmingStrategy.swim();
    }
}
