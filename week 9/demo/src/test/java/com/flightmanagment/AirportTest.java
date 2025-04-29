package com.flightmanagment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AirportTest {

    @DisplayName("Given there is an economy flight")
    @Nested
    class EconomyFlightTest {
        private Flight economyFlight;

        @BeforeEach
        void setUp() {
            economyFlight = new EconomyFlight("1");
        }

        // Tambahkan test methods di sini
        @Test
        public void testEconomyFlightRegularPassenger() {
            // Implementasi test case
            Passenger vip = new Passenger("John", true);
            economyFlight.addPassenger(vip);
            assertFalse(economyFlight.removePassenger(vip));
        }
    }

    @DisplayName("Given there is a business flight")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;

        @BeforeEach
        void setUp() {
            businessFlight = new BusinessFlight("2");
        }

        // Tambahkan test methods di sini
        @Test
        public void testBusinessFlightVipPassenger() {
            // Implementasi test case
            Passenger regular = new Passenger("Mike", false);
            assertFalse(businessFlight.addPassenger(regular));
        }
    }
}