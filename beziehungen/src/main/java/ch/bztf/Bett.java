package ch.bztf;

public class Bett extends Moebel {
    private int plaetze;
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
}
