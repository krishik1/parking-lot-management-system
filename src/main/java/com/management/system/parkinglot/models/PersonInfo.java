package com.management.system.parkinglot.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public abstract class PersonInfo extends BaseModel {
    private String name;
    private String email;
    private String contact;
}
