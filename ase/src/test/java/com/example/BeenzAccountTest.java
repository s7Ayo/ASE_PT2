package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import com.worksonproject.*;

class BeenzAccountTest {

    private BeenzAccount beenzAccount;

    @BeforeEach
    void setUp() {
        beenzAccount = new BeenzAccount();
    }

    @Test
    void testInitialBalance() {
        assertEquals(0, beenzAccount.getBeenzPoints(), "Initial balance should be zero");
    }

    @Test
    void testAddBeenz() {
        beenzAccount.addBeenz(10);
        assertEquals(10, beenzAccount.getBeenzPoints(), "Balance should be increased by the added amount");
    }

    @Test
    void testRedeemBeenzSuccess() {
        beenzAccount.addBeenz(20);
        assertTrue(beenzAccount.redeemBeenz(10), "Redeem should succeed when enough points are available");
        assertEquals(10, beenzAccount.getBeenzPoints(), "Balance should be decreased by the redeemed amount");
    }

    @Test
    void testRedeemBeenzFailure() {
        beenzAccount.addBeenz(5);
        assertFalse(beenzAccount.redeemBeenz(10), "Redeem should fail when not enough points are available");
        assertEquals(5, beenzAccount.getBeenzPoints(), "Balance should remain unchanged");
    }

    @Test
    void testSetBeenzPoints() {
        beenzAccount.setBeenzPoints(15);
        assertEquals(15, beenzAccount.getBeenzPoints(), "Balance should match the set amount");
    }

    @Test
    void testSetNegativeBeenzPoints() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            beenzAccount.setBeenzPoints(-1);
        });
        assertEquals("Beenz points cannot be negative.", exception.getMessage(),
                "Setting negative points should throw IllegalArgumentException");
    }

    @Test
    void testAddNegativeBeenz() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            beenzAccount.addBeenz(-1);
        });
        assertEquals("Cannot add negative points.", exception.getMessage(),
                "Adding negative points should throw IllegalArgumentException");
    }

    @Test
    void testRedeemNegativeBeenz() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            beenzAccount.redeemBeenz(-1);
        });
        assertEquals("Points to redeem must be positive.", exception.getMessage(),
                "Trying to redeem negative points should throw IllegalArgumentException");
    }

    // Additional tests can be written if there are more methods or complex logic to
    // be tested
}