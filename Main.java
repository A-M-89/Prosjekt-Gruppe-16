import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String FILE_PATH = "rooms/rooms.json";

    public static void main(String[] args) {
        List<Room> rooms = loadExistingRooms();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter new room name (or type exit to quit): ");
            String roomName = scanner.nextLine();

            // Avslutter program ved "exit"
            if (roomName.equalsIgnoreCase("exit")) {
                break;
            }

            // Sjekker om navnet er tomt
            if (roomName.isEmpty()) {
                System.out.println("Room name cannot be empty.");
                continue;
            }

            // Sjekker om navnet allerede eksisterer
            if (roomExists(rooms, roomName)) {
                System.out.println("\"" + roomName + "\" already exists. Please choose another name. ");
                continue;
            }

            // Lagrer nytt rom
            rooms.add(new Room(roomName));
            System.out.println("\"" + roomName + "\" was added to the room list.");
            saveRoomToFile(rooms);
        }

        // Skriver ut romliste
        System.out.println("List of rooms: ");
        for (Room room : rooms) {
            System.out.println(room.getName());
        }
    }

    // Metode som sjekker om et romnavn allerede eksisterer i listen
    private static boolean roomExists(List<Room> rooms, String roomName) {
        for (Room room : rooms) {
            if (room.getName().equalsIgnoreCase(roomName)) {
                return true;
            }
        }
        return false;
    }

    // Lagrer rom i JSON-fil.
    private static void saveRoomToFile(List<Room> rooms) {
        Gson gson = new Gson();
        File file = new File(FILE_PATH);

        try (FileWriter writer = new FileWriter(file)) {
            gson.toJson(rooms, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Henter rom fra JSON-fil
    private static List<Room> loadExistingRooms() {
        Gson gson = new Gson();
        File file = new File(FILE_PATH);
        List<Room> rooms = new ArrayList<>();

        try (FileReader reader = new FileReader(file)) {
            Type roomListType = new TypeToken<ArrayList<Room>>() {}.getType();
            rooms = gson.fromJson(reader, roomListType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rooms;
    }
}
