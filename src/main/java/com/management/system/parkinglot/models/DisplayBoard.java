package com.management.system.parkinglot.models;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@SuperBuilder
public class DisplayBoard {
    private LocalDateTime date;
    private List<ParkingSpot> parkingSpots=new ArrayList<>();
}
