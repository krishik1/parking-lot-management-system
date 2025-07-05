package com.management.system.parkinglot.repository;

import com.management.system.parkinglot.models.ParkingLot;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ParkingLotRepository implements ParkingLotRepositoryI {
    private List<ParkingLot> parkingLots = new ArrayList<>();
    @Override
    public ParkingLot save(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
        return parkingLot;
    }

    @Override
    public List<ParkingLot> findAll() {
        return parkingLots;
    }

    @Override
    public ParkingLot getParkingLotById(Long id) {
        return parkingLots.stream()
                .filter(pl -> pl.getId() != null && pl.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("ParkingLot with id " + id + " not found."));
    }
}
