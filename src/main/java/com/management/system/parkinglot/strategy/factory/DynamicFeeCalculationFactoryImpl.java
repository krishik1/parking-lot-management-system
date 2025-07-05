package com.management.system.parkinglot.strategy.factory;

import com.management.system.parkinglot.models.VehicleType;
import com.management.system.parkinglot.strategy.TicketFeeCalculationStrategy;
import com.management.system.parkinglot.strategy.dynamic.LargeVehicleTicketFeeCalculationStrategy;
import com.management.system.parkinglot.strategy.dynamic.MediumVehicleTicketFeeCalculationStrategy;
import com.management.system.parkinglot.strategy.dynamic.SmallVehicleTicketFeeCalculationStrategy;
import org.springframework.stereotype.Component;

@Component
public class DynamicFeeCalculationFactoryImpl implements  FeeCalculationFactory {
    @Override
    public TicketFeeCalculationStrategy getStrategy(VehicleType vehicleType) {
        return switch (vehicleType) {
            case SMALL -> new SmallVehicleTicketFeeCalculationStrategy();
            case MEDIUM -> new MediumVehicleTicketFeeCalculationStrategy();
            case LARGE -> new LargeVehicleTicketFeeCalculationStrategy();
            default -> throw new IllegalArgumentException("Unknown VehicleType: " + vehicleType);
        };
    }
}
