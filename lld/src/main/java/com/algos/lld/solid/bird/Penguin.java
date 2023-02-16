package com.algos.lld.solid.bird;

import com.algos.lld.solid.bird.strategies.SwimmingStrategy;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Penguin extends Bird implements Swimmable{

    SwimmingStrategy swimmingStrategy;

    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName());
        swimmingStrategy.swim();
    }
}
