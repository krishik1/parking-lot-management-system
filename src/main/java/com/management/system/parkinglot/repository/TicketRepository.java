package com.management.system.parkinglot.repository;

import com.management.system.parkinglot.models.Ticket;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketRepository implements TicketRepositoryI{
    private List<Ticket> tickets=new ArrayList<>();
    @Override
    public Ticket save(Ticket ticket) {
        tickets.add(ticket);
        return ticket;
    }
}
