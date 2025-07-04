package com.management.system.parkinglot.contoller;

import com.management.system.parkinglot.dto.ParkingLotRequest;
import com.management.system.parkinglot.models.ParkingLot;
import com.management.system.parkinglot.service.ParkingLotServiceI;
import com.management.system.parkinglot.service.ParkingSpotServiceI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/parking-lot")
public class ParkingLotController {

    private final ParkingLotServiceI parkingLotService;

    @PostMapping
    public ParkingLot createParkingLot(@RequestBody ParkingLotRequest parkingLotRequest) {
        validateRequest(parkingLotRequest);
        ParkingLot parkingLot = transform(parkingLotRequest);
        return parkingLotService.creaParkingLot(parkingLot);
    }
    @GetMapping("/{id}")
    public ParkingLot getParkingLot(@PathVariable("id") Long id) {
        return ParkingLot.builder().Id(id).build();
    }

    private void validateRequest(ParkingLotRequest parkingLotRequest) {
        if(parkingLotRequest.getNumberOfFloors()==null) {
            throw new RuntimeException("Invalid Number Of Floors.");
        }
    }

    private ParkingLot transform(ParkingLotRequest parkingLotRequest) {
        return parkingLotRequest.toParkingLot();
    }
}
