package com.bridgelabz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    ParkingLot parkingLot = new ParkingLot(3);
    Car car1 = new Car("UP53-1234");
    Car car2 = new Car("UP27-1235");
    Car car3 = new Car("UP32-1275");

    @Test
    void givenACar_RemoveFromParkingLot_ReturnBoolean() {
        parkingLot.parkCar(car1);
        parkingLot.parkCar(car2);
        parkingLot.unparkCar("UP53-1234");
        assertFalse(parkingLot.getParkedCars().contains(car1));
        assertTrue(parkingLot.getParkedCars().contains(car2));
    }

    @Test
    void givenACar_AddToParkingLot_ReturnBoolean() {
        parkingLot.parkCar(car1);
        parkingLot.parkCar(car2);
        assertEquals(2, parkingLot.getCurrCapacity());
    }

    @Test
    void givenALot_CheckIfLotIsFull_ReturnBoolean() {
        System.out.println("Test Notify Observers");
        parkingLot.parkCar(car1);
        parkingLot.parkCar(car2);
        parkingLot.parkCar(car3);
//        parkingLot.parkCar(car4);

        assertTrue(parkingLot.isFull());
        System.out.println();

    }

}