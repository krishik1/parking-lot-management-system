package com.management.system.parkinglot.service;

import com.management.system.parkinglot.models.ParkingLot;
import com.management.system.parkinglot.models.ParkingSpot;
import com.management.system.parkinglot.models.VehicleType;

public interface ParkingSpotServiceI {
    void createParkingSpot(ParkingLot parkingLot);
    ParkingSpot updateParkingSpot(ParkingSpot updatedSpot);
    ParkingSpot getParkingSpot(Long id);
    ParkingSpot allocateSlot(Long parkingLotId, VehicleType vehicleType);

}
