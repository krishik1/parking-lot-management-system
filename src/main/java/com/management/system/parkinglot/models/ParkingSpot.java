package com.management.system.parkinglot.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class ParkingSpot {
    private Long spotId;
    private Long floorId;
    private VehicleType vehicleType;
    private SpotStaus spotStaus;

    public static ParkingSpot createSpot() {
        return ParkingSpot.builder().vehicleType(VehicleType.MEDIUM)
                .spotStaus(SpotStaus.AVAILABLE).build();
    }
}
