package ch.bztf;

public class App {
    public static void main(String[] args) {
        Person noelia = new Person("Noelia Herzog");
        Angestellte dominik = new Angestellte("Dominik Schneider");
        Lehrer felix = new Lehrer("Felix Zuber", 2937, "Datensicherheit");

        felix.scheiden();
        noelia.heiraten(dominik);
        felix.heiraten(noelia);
        dominik.scheiden();
        noelia.heiraten(noelia);
    }
}