package com.management.system.parkinglot.service;

import com.management.system.parkinglot.models.Vehicle;
import com.management.system.parkinglot.models.VehicleType;

public interface VehicleServiceI {
    Vehicle createVehicle(String vehicleNumber, VehicleType vehicleType);
}
