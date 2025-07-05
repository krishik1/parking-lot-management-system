package com.management.system.parkinglot.strategy.dynamic;

import com.management.system.parkinglot.models.Ticket;
import com.management.system.parkinglot.strategy.TicketFeeCalculationStrategy;

public class MediumVehicleTicketFeeCalculationStrategy implements TicketFeeCalculationStrategy {
    private final double basePrice=40;
    private final double perHourPrice=20;
    private final int noOfhours=2;
    @Override
    public double calculateTicketFee(Ticket ticket) {
        double hourWiseCost  = noOfhours*perHourPrice;
        return basePrice+hourWiseCost ;
    }
}
