package com.management.system.parkinglot.dto;

import com.management.system.parkinglot.models.VehicleType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateTicketRequest {
    private Long parkingLotId;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private Long gateId;
    private Long issuerId;
}
