package com.management.system.parkinglot.repository;

import com.management.system.parkinglot.models.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleRepository implements VehicleRepositoryI {
    private List<Vehicle> vehicles = new ArrayList<>();
    @Override
    public Vehicle save(Vehicle vehicle) {
        vehicles.add(vehicle);
        return vehicle;
    }
}
