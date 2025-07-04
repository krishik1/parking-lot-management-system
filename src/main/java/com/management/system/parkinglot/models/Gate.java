package com.management.system.parkinglot.models;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public abstract class Gate {
    private Integer gateNumber;
    private Operator operator;
}
