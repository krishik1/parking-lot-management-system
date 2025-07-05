package com.management.system.parkinglot.strategy.dynamic;

import com.management.system.parkinglot.models.Ticket;
import com.management.system.parkinglot.strategy.TicketFeeCalculationStrategy;

import java.sql.Time;
import java.time.LocalDateTime;

public class SmallVehicleTicketFeeCalculationStrategy implements TicketFeeCalculationStrategy {
    private final double basePrice=20;
    private final double perHourPrice=10;
    private final int noOfhours=2;
    @Override
    public double calculateTicketFee(Ticket ticket) {
        /*Time is just hard coded
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = entryTime.plusHours(2);
        /ChronoUnit.HOURS.between(entryTime, exitTime);*/
        double hourWiseCost  = noOfhours*perHourPrice;
        return basePrice+hourWiseCost ;
    }
}
