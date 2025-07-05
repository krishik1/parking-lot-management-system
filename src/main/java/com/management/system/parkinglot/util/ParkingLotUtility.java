package com.management.system.parkinglot.util;

import java.util.Random;

public class ParkingLotUtility {
    private static final Random random = new Random();
    public static Long generateTicketNumber() {
        return random.nextLong(1000000);
    }
    public static String generateInvoiceNumber() {
        Long dig = Math.abs(random.nextLong() % 100000);
        return String.format("CMR%05d",dig);
    }
}
