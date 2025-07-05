package com.management.system.parkinglot.contoller;

import com.management.system.parkinglot.dto.GenerateInvoiceRequest;
import com.management.system.parkinglot.models.Invoice;
import com.management.system.parkinglot.service.InvoiceService;
import com.management.system.parkinglot.service.InvoiceServiceI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("parking-lot/v1/invoice")
@AllArgsConstructor
public class InvoiceController {
    private final InvoiceServiceI invoiceService;
    @PostMapping
    public Invoice generateInvoice(@RequestBody GenerateInvoiceRequest generateInvoiceRequest) {
        return invoiceService.generateInvoice(generateInvoiceRequest);
    }
}
