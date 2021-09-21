package io.github.gbalanyi.java.oop.solid.isegregation.good;

public class Ship implements Vehicle {

    private int maxSpeed;

    public Ship(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
