package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rooms.*;

import java.util.List;


class RoomTest {
    private Room room;
    private SmartSocket socket;

    @BeforeEach
    void setUp() {
        room = new Room("Living rooms.Room");
        socket = new SmartSocket(1, "Lamp");
    }

    @Test
    void testAddSocket() {
        room.addSocket(socket);
        assertTrue(room.getSockets().contains(socket), "Socket should be added to the room");
    }

    @Test
    void testRemoveSocket() {
        room.addSocket(socket);
        room.removeSocket(socket);
        assertFalse(room.getSockets().contains(socket), "Socket should be removed from the room");
    }

    @Test
    void testRoomNameNotEmpty() {
        assertThrows(IllegalArgumentException.class, () -> new Room(""), "rooms.Room name cannot be empty");
    }
}
