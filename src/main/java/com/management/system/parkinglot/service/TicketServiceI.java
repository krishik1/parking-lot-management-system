package com.management.system.parkinglot.service;

import com.management.system.parkinglot.dto.CreateTicketRequest;
import com.management.system.parkinglot.models.Ticket;

public interface TicketServiceI {
    Ticket generateTicket(CreateTicketRequest request);
}
