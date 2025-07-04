package com.management.system.parkinglot.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;
@Data
@SuperBuilder
public abstract class BaseModel {
    private Long Id;
    private Date createdAt;
    private Date updatedAt;
}
