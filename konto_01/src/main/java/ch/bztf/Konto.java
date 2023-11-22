package ch.bztf;

public class Konto {
    private static int anzahlInstanzen = 0;
    private String kontoInhaber = "";
    private String nameKonto = "";
    private int nummerKonto = -1;
    private double saldoKonto = -1;

    public Konto() {
        anzahlInstanzen++;
    }

    public Konto(String pKontoInhaber, String pNameKonto, int pNummerKonto, double pSaldoKonto) {
        anzahlInstanzen++;
        setKontoInhaber(pKontoInhaber);
        setNameKonto(pNameKonto);
        setNummerKonto(pNummerKonto);
        setSaldoKonto(pSaldoKonto);
    }

    public Konto(String pKontoInhaber) {
        anzahlInstanzen++;
        setKontoInhaber(pKontoInhaber);
    }

    public Konto(String pKontoInhaber, String pNameKonto) {
        anzahlInstanzen++;
        setKontoInhaber(pKontoInhaber);
        setNameKonto(pNameKonto);
    }

    public Konto(int pNummerKonto) {
        anzahlInstanzen++;
        setNummerKonto(pNummerKonto);
    }

    public Konto(double pSaldoKonto) {
        anzahlInstanzen++;
        setSaldoKonto(pSaldoKonto);
    }

    public Konto(double pSaldoKonto, String pKontoInhaber) {
        anzahlInstanzen++;
        setSaldoKonto(pSaldoKonto);
        setKontoInhaber(pKontoInhaber);
    }

    public Konto(String pNameKonto, double pSaldoKonto) {
        anzahlInstanzen++;
        setNameKonto(pNameKonto);
        setSaldoKonto(pSaldoKonto);
    }

    public Konto(String pNameKonto, int pNummerKonto) {
        anzahlInstanzen++;
        setNameKonto(pNameKonto);
        setNummerKonto(pNummerKonto);
    }

    public Konto(int pNummerKonto, String pKontoInhaber) {
        anzahlInstanzen++;
        setNummerKonto(pNummerKonto);
        setKontoInhaber(pKontoInhaber);
    }

    public void setKontoInhaber(String pKontoInhaber) {
        kontoInhaber = pKontoInhaber;
    }

    public void setNameKonto(String pNameKonto) {
        nameKonto = pNameKonto;
    }

    public void setNummerKonto(int pNummerKonto) {
        if (pNummerKonto >= 0) {
            nummerKonto = pNummerKonto;
        } else {
            System.out.println("Kontonummer ist zu klein. Neuer Wert: 0");
            nummerKonto = 0;
        }
    }

    public void setSaldoKonto(double pSaldoKonto) {
        if (pSaldoKonto >= 0) {
            saldoKonto = pSaldoKonto;
        } else {
            System.out.println("Saldo ist zu klein. Neuer Wert: 0.0");
            saldoKonto = 0.0;
        }
    }

    public String getKontoInhaber() {
        return kontoInhaber;
    }

    public String getNameKonto() {
        return nameKonto;
    }

    public int getNummerKonto() {
        return nummerKonto;
    }

    public double getSaldoKonto() {
        return saldoKonto;
    }

    public String getKontoInhaberOut() {
        if (!kontoInhaber.equals("")) {
            String ausgabe = "Kontoinhaber: " + kontoInhaber;
            ausgabe(ausgabe);
        }
        return kontoInhaber;
    }

    public String getNameKontoOut() {
        if (!nameKonto.equals("")) {
            String ausgabe = "Kontoname: " + nameKonto;
            ausgabe(ausgabe);
        }
        return nameKonto;
    }

    public int getNummerKontoOut() {
        if (nummerKonto >= 0) {
            String ausgabe = "Kontonummer: " + nummerKonto;
            ausgabe(ausgabe);
        }
        return nummerKonto;
    }

    public double getSaldoKontoOut() {
        if (saldoKonto >= 0) {
            String ausgabe = "Saldo: CHF " + saldoKonto;
            ausgabe(ausgabe);
        }
        return saldoKonto;
    }

    private void ausgabe(String stringAusgabe) {
        System.out.println(stringAusgabe);
    }

    public static int ausgabeAnzahlInstanzen() {
        System.out.println(anzahlInstanzen);
        return anzahlInstanzen;
    }

    public static void greeting() {
        System.out.println("Guten Tag");
    }

    public static void greeting(int times) {
        for (int i = 0; i < times; i++) {
            greeting();
        }
    }
}
