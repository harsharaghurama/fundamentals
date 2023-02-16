package com.algos.lld.solid.bird;

import com.algos.lld.solid.bird.strategies.impl.FlappingFlyingStrategy;
import com.algos.lld.solid.bird.strategies.impl.GlidingFlyingStrategy;
import com.algos.lld.solid.bird.strategies.impl.SmoothSwimmingStrategy;
import com.algos.lld.solid.bird.strategies.impl.SplashingSwimmingStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BirdTest {

    @Test
    public void testBirdRelease() {
        List<Flyable> birds = new ArrayList<>();
        Flyable swan = new Swan(new FlappingFlyingStrategy(), new SmoothSwimmingStrategy());
        Flyable pigeon = new Pigeon(new GlidingFlyingStrategy());
        Assert.assertNotNull("The instance of bird created should not be null", swan);
        Assert.assertNotNull("The instance of bird created should not be null", pigeon);
        birds.add(swan);
        birds.add(pigeon);
        releaseAllFromCage(birds);
    }

    @Test
    public void testBirdReleaseToWater() {
        List<Swimmable> birds = new ArrayList<>();
        Swimmable swan = new Swan(new FlappingFlyingStrategy(), new SmoothSwimmingStrategy());
        Swimmable penguin = new Penguin(new SplashingSwimmingStrategy());
        Assert.assertNotNull("The instance of bird created should not be null", swan);
        Assert.assertNotNull("The instance of bird created should not be null", penguin);
        birds.add(swan);
        birds.add(penguin);
        releaseAllToWater(birds);
    }

    private void releaseAllToWater(List<Swimmable> birds) {
        birds.forEach(Swimmable::swim);
    }

    private void releaseAllFromCage(List<Flyable> birds) {
        birds.forEach(Flyable::fly);
    }
}
