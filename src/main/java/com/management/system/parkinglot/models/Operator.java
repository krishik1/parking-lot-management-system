package com.management.system.parkinglot.models;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Operator extends PersonInfo {
    private Integer operatorId;
    private Gate gate;
}
