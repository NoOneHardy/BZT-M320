package ch.bztf;

public class Mitarbeiter {
    private String name;
    private String position;
    private String taetigkeit;

    public Mitarbeiter(String name, String position, String taetigkeit) {
        this.name = name;
        this.position = position;
        this.taetigkeit = taetigkeit;
    }

    public void printMitarbeiter() {
        StringBuilder string = new StringBuilder("Name: ").append(name).append("\n");
        string.append("Position: ").append(position).append("\n");
        string.append("Taetigkeit: ").append(taetigkeit);
        Drucker.getInstance().print(string.toString());
    }
}
