package ch.bztf;

public class Main {
    public static void main(String[] args) {
        Bankkunde b0 = new Bankkunde();
        b0.setNachname("Krehl");
        b0.ausgabe();

        b0.neuesKonto();
        b0.ausgabe();
    }
}