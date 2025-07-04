package com.management.system.parkinglot.repository;

import com.management.system.parkinglot.models.ParkingLot;

import java.util.List;

public interface ParkingLotRepositoryI {
    ParkingLot save(ParkingLot parkingLot);
    List<ParkingLot> findAll();
    ParkingLot getParkingLotById(Long id);
}
