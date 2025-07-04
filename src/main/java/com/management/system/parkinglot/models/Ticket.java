package com.management.system.parkinglot.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;


@Getter
@SuperBuilder
public class Ticket extends BaseModel{
    private Integer ticketNumber;
    private Long vehicleId;
    private LocalDateTime entryTime;
    private Long spotId;
}
