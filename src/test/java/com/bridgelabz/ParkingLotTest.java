package com.bridgelabz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    ParkingLot parkingLot = new ParkingLot(100);
    Car car1 = new Car("UP53-1234");
    Car car2 = new Car("UP27-1235");

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

}