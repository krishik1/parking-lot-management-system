package com.management.system.parkinglot.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ExitGate extends Gate {
    private PaymentCounter paymentCounter;
}
