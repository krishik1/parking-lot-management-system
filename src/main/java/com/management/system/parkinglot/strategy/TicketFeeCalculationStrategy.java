package com.management.system.parkinglot.strategy;

import com.management.system.parkinglot.models.Ticket;

public interface TicketFeeCalculationStrategy {
    double calculateTicketFee(Ticket ticket);
}
