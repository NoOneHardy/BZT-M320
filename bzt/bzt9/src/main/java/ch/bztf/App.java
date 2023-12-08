package ch.bztf;

public class App {
    public static void main(String[] args) {
        Angestellter angestellter = new Angestellter("Bruce Wayne");
        Lehrer lehrer = new Lehrer("Lucifer Morningstar", 8273, "Serverinfrastruktur");
        Lernender lernender = new Lernender("Michael Scott");
        System.out.println("Bitte als Angestellter CHF " + angestellter.kantineKonsum(3) + " bezahlen");
        System.out.println("Bitte als Lehrer CHF " + lehrer.kantineKonsum(5) + " bezahlen");
        System.out.println("Bitte als Lernender CHF " + lernender.kantineKonsum(7) + " bezahlen");
    }
}