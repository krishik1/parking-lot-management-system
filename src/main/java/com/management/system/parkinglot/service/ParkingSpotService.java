package com.management.system.parkinglot.service;

import com.management.system.parkinglot.models.ParkingLot;
import com.management.system.parkinglot.models.ParkingSpot;
import com.management.system.parkinglot.models.VehicleType;
import com.management.system.parkinglot.repository.ParkingLotRepository;
import com.management.system.parkinglot.repository.ParkingLotRepositoryI;
import com.management.system.parkinglot.repository.ParkingSpotRepositoryI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ParkingSpotService implements ParkingSpotServiceI {
    private final ParkingSpotRepositoryI parkingSpotRepository;
    @Override
    public void createParkingSpot(ParkingLot parkingLot) {
        List<ParkingSpot> parkingSpots = parkingLot.getFloors().stream().
                flatMap(floor -> floor.getSpots().stream())
                .collect(Collectors.toList());
        parkingSpotRepository.saveAll(parkingSpots);
    }

    @Override
    public ParkingSpot updateParkingSpot(ParkingSpot updatedSpot) {
        return parkingSpotRepository.update(updatedSpot);
    }

    @Override
    public ParkingSpot getParkingSpot(Long id) {
        return parkingSpotRepository.findSpotById(id);
    }

    //is it required to add id here?
    @Override
    public ParkingSpot allocateSlot(Long parkingLotId, VehicleType vehicleType) {
        return parkingSpotRepository.findSpotByVehicleTypeAndAvailableStatus(vehicleType);
    }
}
