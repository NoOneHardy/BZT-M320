package ch.bztf;

public class Drucker {
    private static Drucker drucker;
    private int anzahlSeiten = 0;

    private Drucker() {
    }

    public static Drucker getInstance() {
        if (drucker == null) {
            drucker = new Drucker();
        }
        return drucker;
    }

    public void print(String test) {
        System.out.println(test);
        System.out.println();
        System.out.println("Heute gedruckte Seiten: " + ++anzahlSeiten);
        System.out.println();
    }
}
