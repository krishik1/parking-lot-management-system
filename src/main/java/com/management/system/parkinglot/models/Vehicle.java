package com.management.system.parkinglot.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Vehicle extends BaseModel {
    private String vehicleNumber;
    private VehicleType vehicleType;
}
