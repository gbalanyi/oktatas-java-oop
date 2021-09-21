package io.github.gbalanyi.java.oop.solid.isegregation.bad;

public class Car implements Vehicle {

    private int maxSpeed;
    private int numberOfWheels;

    public Car(int maxSpeed, int numberOfWheels) {
        this.maxSpeed = maxSpeed;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
