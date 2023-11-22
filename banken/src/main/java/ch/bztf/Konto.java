package ch.bztf;

public class Konto {
    private int kontoNummer;

    public Konto() {
        kontoNummer = -1;
    }

    public void setKontoNummer(int nummer) {
        if (String.valueOf(nummer).length() == 4) {
            this.kontoNummer = nummer;
        } else {
            System.out.println("Ungültige Kontonummer");
        }
    }

    public int getKontoNummer() {
        return kontoNummer;
    }
}
