package com.management.system.parkinglot.service;

import com.management.system.parkinglot.dto.GenerateInvoiceRequest;
import com.management.system.parkinglot.models.Invoice;

public interface InvoiceServiceI {
    Invoice generateInvoice(GenerateInvoiceRequest request);
}
