package com.management.system.parkinglot.service;

import com.management.system.parkinglot.dto.GenerateInvoiceRequest;
import com.management.system.parkinglot.models.*;
import com.management.system.parkinglot.repository.InvoiceRepositoryI;
import com.management.system.parkinglot.strategy.factory.FeeCalculationFactory;
import com.management.system.parkinglot.util.ParkingLotUtility;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InvoiceService implements InvoiceServiceI {
    private final InvoiceRepositoryI invoiceRepository;
    private final TicketServiceI ticketService;
    private final FeeCalculationFactory feeCalculationFactory;
    @Override
    public Invoice generateInvoice(GenerateInvoiceRequest request) {
        Ticket ticket = ticketService.retrieveTicketById(request.getTicketNumber());
        double parkingFee = feeCalculationFactory.getStrategy(ticket.getVehicle().getVehicleType()).calculateTicketFee(ticket);
        Invoice invoice = Invoice.builder().invoiceId(ParkingLotUtility.generateInvoiceNumber())
                .amount(parkingFee)
                .exitTime(request.getExitTime())
                .ticket(ticket)
                .payment(Payment.builder().amount(parkingFee).mode(PaymentType.UPI).status(PaymentStatus.SUCCESS).build())
                .build();
        return invoiceRepository.save(invoice);
    }
}
