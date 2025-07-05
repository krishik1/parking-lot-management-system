package com.management.system.parkinglot.service;

import com.management.system.parkinglot.models.ParkingLot;

public interface ParkingLotServiceI {
    ParkingLot creaParkingLot(ParkingLot parkingLot);
    ParkingLot retrieveParkingLotById(Long id);
}
