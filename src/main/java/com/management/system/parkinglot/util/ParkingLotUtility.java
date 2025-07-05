package com.management.system.parkinglot.util;

import java.util.Random;

public class ParkingLotUtility {
    private static final Random random = new Random();
    public static Long generateTicketNumber() {
        return random.nextLong(1000000);
    }
}
