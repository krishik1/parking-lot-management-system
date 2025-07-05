package com.management.system.parkinglot.strategy.dynamic;

import com.management.system.parkinglot.models.Ticket;
import com.management.system.parkinglot.strategy.TicketFeeCalculationStrategy;

public class LargeVehicleTicketFeeCalculationStrategy implements TicketFeeCalculationStrategy {
    private final double basePrice=60;
    private final double perHourPrice=30;
    private final int noOfhours=2;
    @Override
    public double calculateTicketFee(Ticket ticket) {
        double hourWiseCost  = noOfhours*perHourPrice;
        return basePrice+hourWiseCost ;
    }
}
