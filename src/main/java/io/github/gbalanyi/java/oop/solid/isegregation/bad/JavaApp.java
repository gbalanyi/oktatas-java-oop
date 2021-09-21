package io.github.gbalanyi.java.oop.solid.isegregation.bad;

import java.util.ArrayList;
import java.util.List;

public class JavaApp {

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp() {

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car(180, 4));
        vehicleList.add(new Ship(30));

        this.printVehicleSpeeds(vehicleList);
    }

    private void printVehicleSpeeds(List<Vehicle> vehicleList) {
        for (Vehicle vehicle : vehicleList) {
            System.out.println(String.format("Type of vehicle: %s, max.speed: %d km/h",
                    vehicle.getClass().getSimpleName(),
                    vehicle.getMaxSpeed()));
        }
    }
}
