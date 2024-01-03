package com.bridgelabz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingLotTest {
    ParkingLot parkingLot;

    @BeforeEach
    void setUp() throws Exception {
        parkingLot = new ParkingLot(100);
    }

    @Test
    void givenACar_AddToParkingLot_ReturnBoolean() {
        Car car1 = new Car("UP53-1234");
        Car car2 = new Car("UP27-1235");

        parkingLot.parkCar(car1);
        parkingLot.parkCar(car2);
        assertEquals(2, parkingLot.getCurrCapacity());
    }

}