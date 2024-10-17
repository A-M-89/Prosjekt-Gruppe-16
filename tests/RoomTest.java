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

    /*@Test
    void testSaveAndLoadEmptyRoomList() throws Exception{
        saveRoomsToFile(rooms);
        List<Room> loadedRooms = loadRoomsFromFile();
        assertEquals(0, loadedRooms.size(), "Rooms list should be empty");
    }*/

    /*@Test
    void testSaveAndLoadEmptyRoom() throws Exception {
        Room emptyRoom = new Room("Empty Room");
        room.add(emptyRoom);

        saveRoomsToFile(room);
        List<Room> loadRooms = loadRoomsFromFile();

        assertEquals(1, loadRooms.size(), "Should have one room");
        Room loadedRoom = loadRooms.get(0);
        assertEquals("Empty Room", loadedRoom.getName(), "Room name should match");
        assertEquals(0, loadedRoom.getSockets().size(), "Should have no sockets");
    }*/
}
