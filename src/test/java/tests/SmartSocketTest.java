package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rooms.SmartSocket;

class SmartSocketTest {
    private SmartSocket socket;

    @BeforeEach
    void setUp() {
        socket = new SmartSocket(1, "Heater");
    }

    @Test
    void testToggleState() {
        assertFalse(socket.isStatusOn(), "Initial state should be off");
        socket.toggleSmartSocketState();
        assertTrue(socket.isStatusOn(), "State should be on after toggling");
        socket.toggleSmartSocketState();
        assertFalse(socket.isStatusOn(), "State should be off after toggling again");
    }

    @Test
    void testRenameSocket() {
        socket.setName("Fan");
        assertEquals("Fan", socket.getName(), "Socket name should be updated to 'Fan'");
    }

    @Test
    void testRenameSocketEmpty() {
        assertThrows(IllegalArgumentException.class, () -> socket.setName(""), "Name cannot be empty");
    }
}
