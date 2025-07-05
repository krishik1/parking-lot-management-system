package com.management.system.parkinglot.dto;

import com.management.system.parkinglot.generators.ParkingFloorId;
import com.management.system.parkinglot.generators.ParkingLotId;
import com.management.system.parkinglot.generators.ParkingSpotId;
import com.management.system.parkinglot.models.*;
import lombok.Builder;
import lombok.Getter;

import java.util.Collections;
import java.util.List;

@Getter
@Builder
public class ParkingLotRequest {

    private String name;
    private String address;
    private Integer numberOfFloors;
    private Integer numberOfSpotsPerFloor;
    private Integer noOfEntryGates;
    private Integer noOfExitGates;

    public ParkingLot toParkingLot() {
        List<ParkingSpot> parkingSpots = Collections.nCopies(numberOfSpotsPerFloor,ParkingSpot.createSpot());
        parkingSpots.forEach(parkingSpot -> parkingSpot.setSpotId(ParkingSpotId.nextId()));
        List<ParkingFloor> parkingFloors = Collections.nCopies(numberOfFloors,ParkingFloor.builder().spots(parkingSpots).paymentCounter(PaymentCounter.builder().build()).build());
        parkingFloors.forEach(parkingFloor -> parkingFloor.setId(ParkingFloorId.nextId()));
        System.out.println(parkingFloors.stream().map(floor ->floor.getSpots().size()));
        return ParkingLot.builder().Id(ParkingLotId.nextId()).floors(parkingFloors).
                entryGates(Collections.nCopies(noOfEntryGates, EntryGate.builder().build()))
                .name(name)
                .address(address)
                .displayBoard(DisplayBoard.builder().build())
                        .exitGates(Collections.nCopies(noOfExitGates,ExitGate.builder().build())).build();

    }
}
