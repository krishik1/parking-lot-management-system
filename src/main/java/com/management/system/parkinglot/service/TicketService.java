package com.management.system.parkinglot.service;

import com.management.system.parkinglot.dto.CreateTicketRequest;
import com.management.system.parkinglot.models.ParkingLot;
import com.management.system.parkinglot.models.ParkingSpot;
import com.management.system.parkinglot.models.SpotStaus;
import com.management.system.parkinglot.models.Ticket;
import com.management.system.parkinglot.repository.TicketRepositoryI;
import com.management.system.parkinglot.util.ParkingLotUtility;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class TicketService implements TicketServiceI {
    private final TicketRepositoryI ticketRepository;
    private final ParkingSpotServiceI parkingSpotService;
    private final VehicleServiceI vehicleService;

    @Override
    public Ticket generateTicket(CreateTicketRequest request) {
        //assign-spot and update the status
        ParkingSpot spot = parkingSpotService.allocateSlot(request.getParkingLotId(), request.getVehicleType());
        if (spot == null) {
            throw new RuntimeException("Slot not available!");
        }
        spot.setSpotStaus(SpotStaus.OCCUPIED);
        parkingSpotService.updateParkingSpot(spot);
        Ticket ticket = Ticket.builder()
                .ticketNumber(ParkingLotUtility.generateTicketNumber())
                .spotId(spot.getSpotId())
                .entryTime(LocalDateTime.now())
                .vehicle(vehicleService.createVehicle(request.getVehicleNumber(), request.getVehicleType()))
                .entryGateId(request.getGateId())
                .build();

        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket retrieveTicketById(Long id) {
        return ticketRepository.getTicketByTicketNumber(id);
    }
}
