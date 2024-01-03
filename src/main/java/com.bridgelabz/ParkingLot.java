package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParkingLot {

    private final List<Car> parkedCars = new ArrayList<>();;
    int capacity;
    int currCapacity;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public List<Car> getParkedCars() {
        return parkedCars;
    }

    public void parkCar(Car car) {
        parkedCars.add(car);
        currCapacity++;
        System.out.println(car.getLicenseNumber() + " is parked.");
    }

    public void unparkCar(String licenseNumber) {
        Iterator<Car> iterator = parkedCars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getLicenseNumber().equals(licenseNumber)) {
                iterator.remove();
                currCapacity--;
                System.out.println(car.getLicenseNumber() + " has been unparked.");
                return;
            }
        }
        System.out.println("Car " + licenseNumber + " not found.");
    }

    public int getCapacity(){
        return capacity;
    }

    public int getCurrCapacity(){
        return currCapacity;
    }

    public void printParkedCars() {
        System.out.println("Parked cars: ");
        for (Car car : parkedCars) {
            System.out.println(car.getLicenseNumber());
        }
    }
}
