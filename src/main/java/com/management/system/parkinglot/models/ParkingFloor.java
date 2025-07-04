package com.management.system.parkinglot.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@SuperBuilder
public class ParkingFloor extends BaseModel{
    private int floorNumber;
    private List<ParkingSpot> spots = new ArrayList<>();
    private DisplayBoard displayBoard;
    private PaymentCounter paymentCounter;
}
