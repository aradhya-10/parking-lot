package com.bridgelabz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    ParkingLot parkingLot = new ParkingLot(3);
    Car car1;
    Car car2;

    @BeforeEach
    void initialSetUp   () throws Exception {
        parkingLot = new ParkingLot(3);

        // Create two cars
        System.out.println();
        Car car1 = new Car("UP53-1234");
        Car car2 = new Car("UP27-1235");

        // Park the cars
        parkingLot.parkCar(car1);
        parkingLot.parkCar(car2);
    }

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
        assertEquals(2, parkingLot.getCurrCapacity());
    }

    @Test
    void givenALot_CheckIfLotIsFullForOwner_ReturnBoolean() {
        Car car3 = new Car("UP32-1275");
        parkingLot.parkCar(car3);

        LotOwner lotOwner = new LotOwner();
        assertTrue(lotOwner.getFullStatus(parkingLot.isFull()));
    }

    @Test
    void givenALot_CheckIfLotIsFullForSecurity_ReturnBoolean() {
        Car car3 = new Car("UP32-1275");
        parkingLot.parkCar(car3);

        AirportSecurity airportSecurity = new AirportSecurity();
        assertTrue(airportSecurity.getFullStatus(parkingLot.isFull()));
    }

    @Test
    void givenALot_CheckIfItHasSpace_ReturnIfOwnerStatusUpdated() {
        Car car3 = new Car("UP32-1275");
        Car car4 = new Car("UP32-1285");

        LotOwner lotOwner = new LotOwner();
        parkingLot.parkCar(car3);
        assertTrue(lotOwner.getFullStatus(parkingLot.isFull()));
        parkingLot.unparkCar(car3.getLicenseNumber());
        assertFalse(lotOwner.getFullStatus(parkingLot.isFull()));
        parkingLot.parkCar(car4);
        assertTrue(lotOwner.getFullStatus(parkingLot.isFull()));
    }
}