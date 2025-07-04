package com.management.system.parkinglot.models;


import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Payment extends BaseModel{
    private String paymentRefNumber;
    private String ticketId;
    private Integer amount;
    private PaymentType mode;
    private PaymentStatus status;
}

