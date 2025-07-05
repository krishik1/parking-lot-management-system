package com.management.system.parkinglot.service;

import com.management.system.parkinglot.models.ParkingLot;
import com.management.system.parkinglot.repository.ParkingLotRepositoryI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ParkingLotService implements ParkingLotServiceI{
    private final ParkingLotRepositoryI parkingLotRepository;
    private final ParkingSpotServiceI parkingSpotService;
    @Override
    public ParkingLot creaParkingLot(ParkingLot parkingLot) {
        parkingSpotService.createParkingSpot(parkingLot);
        return parkingLotRepository.save(parkingLot);
    }

    @Override
    public ParkingLot retrieveParkingLotById(Long id) {
        return parkingLotRepository.getParkingLotById(id);
    }
}
