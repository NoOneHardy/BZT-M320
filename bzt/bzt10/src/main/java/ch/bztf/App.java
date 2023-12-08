package ch.bztf;

public class App {
    public static void main(String[] args) {
        Angestellter angestellter = new Angestellter("Bruce Wayne");
        Lehrer lehrer = new Lehrer("Lucifer Morningstar", 8273, "Serverinfrastruktur");
        Lernender lernender = new Lernender("Michael Scott");

        System.out.println(lernender.bewertung());
        System.out.println(lehrer.bewertung());
        System.out.println(angestellter.bewertung());
    }
}