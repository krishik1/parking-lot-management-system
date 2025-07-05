package com.management.system.parkinglot.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
@Builder
public class GenerateInvoiceRequest {
    private Long ticketNumber;
    private LocalDateTime exitTime;
}
