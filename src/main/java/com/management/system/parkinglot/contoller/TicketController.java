package com.management.system.parkinglot.contoller;

import com.management.system.parkinglot.dto.CreateTicketRequest;
import com.management.system.parkinglot.models.Ticket;
import com.management.system.parkinglot.service.TicketServiceI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ticket")
@AllArgsConstructor
public class TicketController {
    private final TicketServiceI ticketService;

    @PostMapping
    public Ticket createTicket(@RequestBody CreateTicketRequest createTicketRequest) {
        return ticketService.generateTicket(createTicketRequest);
    }
}
