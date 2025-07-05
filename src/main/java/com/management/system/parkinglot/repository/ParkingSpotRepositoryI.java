package com.management.system.parkinglot.repository;

import com.management.system.parkinglot.models.ParkingSpot;
import com.management.system.parkinglot.models.VehicleType;

import java.util.List;

public interface ParkingSpotRepositoryI {
    ParkingSpot save(ParkingSpot parkingSpot);
    ParkingSpot findSpotByVehicleTypeAndAvailableStatus(VehicleType vehicleType);
    void saveAll(List<ParkingSpot> parkingSpots);
    ParkingSpot update(ParkingSpot parkingSpot);
    ParkingSpot findSpotById(Long id);


}
