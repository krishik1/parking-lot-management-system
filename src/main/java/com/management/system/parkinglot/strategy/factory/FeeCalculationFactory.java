package com.management.system.parkinglot.strategy.factory;

import com.management.system.parkinglot.models.VehicleType;
import com.management.system.parkinglot.strategy.TicketFeeCalculationStrategy;

public interface FeeCalculationFactory {
    TicketFeeCalculationStrategy getStrategy(VehicleType vehicleType);
}
