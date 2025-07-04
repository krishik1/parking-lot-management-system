package com.management.system.parkinglot.service;

import com.management.system.parkinglot.models.ParkingSpot;
import com.management.system.parkinglot.repository.ParkingLotRepository;
import com.management.system.parkinglot.repository.ParkingLotRepositoryI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ParkingSpotService implements ParkingSpotServiceI {



    @Override
    public ParkingSpot createParkingSpot(ParkingSpot parkingSpot) {
        return null;
    }
}
