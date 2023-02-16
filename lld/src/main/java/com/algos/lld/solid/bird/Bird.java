package com.algos.lld.solid.bird;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public abstract class Bird {
    private double weight;
    String colour;
    BeakType beakType;
}
