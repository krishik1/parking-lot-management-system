package com.management.system.parkinglot.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class EntryGate extends Gate {
    private DisplayBoard displayBoard;
}
