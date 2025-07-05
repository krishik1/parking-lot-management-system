package com.management.system.parkinglot.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;


@Getter
@SuperBuilder
public class Ticket extends BaseModel{
    private Long ticketNumber;
    private Long vehicleId;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private Long spotId;
    private Long entryGateId;
}
