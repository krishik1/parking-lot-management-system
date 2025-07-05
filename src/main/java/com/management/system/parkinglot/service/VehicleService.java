package com.management.system.parkinglot.service;

import com.management.system.parkinglot.models.Vehicle;
import com.management.system.parkinglot.models.VehicleType;
import com.management.system.parkinglot.repository.VehicleRepositoryI;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VehicleService implements VehicleServiceI {

    private final VehicleRepositoryI vehicleRepository;

    @Override
    public Vehicle createVehicle(String vehicleNumber, VehicleType vehicleType) {
        return vehicleRepository.save(Vehicle.builder().vehicleNumber(vehicleNumber)
                .vehicleType(vehicleType).build());
    }
}
