package com.management.system.parkinglot.repository;

import com.management.system.parkinglot.models.ParkingSpot;
import com.management.system.parkinglot.models.SpotStaus;
import com.management.system.parkinglot.models.VehicleType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ParkingSpotRepository implements ParkingSpotRepositoryI {
    private List<ParkingSpot> parkingSpots=new ArrayList<>();
    @Override
    public ParkingSpot save(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
        return parkingSpot;
    }

    @Override
    public ParkingSpot findSpotByVehicleTypeAndAvailableStatus(VehicleType vehicleType) {
        return parkingSpots.stream().
                filter(ps->(ps.getVehicleType() == vehicleType && ps.getSpotStaus()==SpotStaus.AVAILABLE))
                .findFirst().orElse(null);
    }

    @Override
    public void saveAll(List<ParkingSpot> spots) {
        System.out.println("Parking Spots: " + spots);
        parkingSpots.addAll(spots);
        System.out.println("Parking Spots: " + parkingSpots);
    }

    @Override
    public ParkingSpot update(ParkingSpot updatedSpot) {
        ParkingSpot currSpot = parkingSpots.stream()
                .filter(ps->ps.getSpotId().equals(updatedSpot.getSpotId()))
                .findFirst().orElseThrow(() -> new RuntimeException("ParkingSpot with ID " + updatedSpot.getSpotId() + " not found"));
        parkingSpots.remove(currSpot);
        parkingSpots.add(updatedSpot);
        return updatedSpot;
    }

    @Override
    public ParkingSpot findSpotById(Long id) {
        return parkingSpots.stream().filter(ps->ps.getSpotId()==id).findFirst().get();
    }
}
