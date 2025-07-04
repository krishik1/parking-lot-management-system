package com.management.system.parkinglot.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@SuperBuilder
public class Invoice extends BaseModel{
    private String invoiceId;
    private LocalDateTime exitTime;
    //private String ticketId;
    private Ticket ticket;
    private double amount;
    private Payment payment;
    //private String paymentId;
}
