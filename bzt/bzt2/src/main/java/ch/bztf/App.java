package ch.bztf;

public class App {
    public static void main(String[] args) {
        Person p = new Person();
        p.setNachname("Hardegger");

        Lehrer mt = new Lehrer();
        mt.setNachname("Inauen");
        mt.setFachbereich("Informatik");

        Lernende mus = new Lernende();
        mus.setNachname("Muster");
        mus.setNummer(1001);

        System.out.println("Nachname der Person: " + p.getNachname());

        System.out.println("Nachname des Lehrers: " + mt.getNachname());
        System.out.println("Fachbereich des Lehrers: " + mt.getFachbereich());

        System.out.println("Nachname des Lernenden: " + mus.getNachname());
        System.out.println("Nummer des Lernenden: " + mus.getNummer());
    }
}