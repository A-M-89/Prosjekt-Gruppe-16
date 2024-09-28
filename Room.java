import java.util.ArrayList;
import java.util.List;

class Room {
    private String name;
    private List<SmartSocket> sockets; // Liste over stikkontakter

    public Room(String name) {
        this.name = name;
        this.sockets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Viser liste over stikkontakter knyttet til rommet
    public List<SmartSocket> getSockets() {
        return sockets;
    }

    // Metode for å legge stikkontakt i liste over stikkontakter for rommet
    public void addSocket(SmartSocket socket) {
        sockets.add(socket);
    }
}
