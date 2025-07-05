package com.management.system.parkinglot.repository;

import com.management.system.parkinglot.models.Invoice;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepository implements InvoiceRepositoryI {
    private List<Invoice> invoices = new ArrayList<>();
    @Override
    public Invoice save(Invoice invoice) {
        invoices.add(invoice);
        return invoice;
    }
}
