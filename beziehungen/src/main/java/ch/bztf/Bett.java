package ch.bztf;

public class Bett extends Moebel {
    private int plaetze = 1;
    private boolean gemacht;

    public Bett() {
        super("Bett");
    }

    public int getPlaetze() {
        return plaetze;
    }

    public boolean isGemacht() {
        return gemacht;
    }

    public void setPlaetze(int plaetze) {
        this.plaetze = plaetze;
    }

    public void setGemacht(boolean gemacht) {
        this.gemacht = gemacht;
    }

    public void machen() {
        setGemacht(true);
    }

    @Override
    public void ausgabe() {
        super.ausgabe();
        System.out.println("\tGemacht: " + (isGemacht() ? "Ja" : "Nein"));
        System.out.println("\tPlätze: " + getPlaetze());
        System.out.println();
    }
}
