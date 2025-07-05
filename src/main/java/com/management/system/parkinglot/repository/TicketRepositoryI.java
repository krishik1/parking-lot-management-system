package com.management.system.parkinglot.repository;

import com.management.system.parkinglot.models.Ticket;

public interface TicketRepositoryI {
    Ticket save(Ticket ticket);
    Ticket getTicketByTicketNumber(Long number);
}
