package com.management.system.parkinglot.service;

import com.management.system.parkinglot.models.ParkingLot;
import com.management.system.parkinglot.repository.ParkingLotRepositoryI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ParkingLotService implements ParkingLotServiceI{
    private final ParkingLotRepositoryI parkingLotRepository;
    @Override
    public ParkingLot creaParkingLot(ParkingLot parkingLot) {
        return parkingLotRepository.save(parkingLot);
    }
}
