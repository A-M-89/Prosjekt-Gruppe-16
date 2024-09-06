import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String roomName;

        while(true) {
            System.out.print("Enter the name of the room: ");
            roomName = scanner.nextLine();

            if (roomName.isEmpty()) {
                System.out.println("Room name cannot be empty.");
            } else {
                break;
            }
        }

        rooms.add(new Room(roomName));
        System.out.println("You have added room: " + roomName + " to your list.");

        Gson gson = new Gson();

        // lager rom i json fil.
        File file = new File("rooms/rooms.json");

        try (FileWriter writer = new FileWriter(file)) {
            gson.toJson(rooms, writer);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Skriv ut rom list
        System.out.println("List of rooms: ");
        for (Room room : rooms) {
            System.out.println(room.getName());
        }
    }
}
