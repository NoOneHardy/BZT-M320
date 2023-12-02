package ch.bztf;

public class Dusche extends Moebel {
    private String tuerTyp;
    private boolean transparent;

    public Dusche() {
        super("Dusche");
    }

    public String getTuerTyp() {
        return tuerTyp;
    }

    public boolean isTransparent() {
        return transparent;
    }

    public void setTuerTyp(String tuerTyp) {
        this.tuerTyp = tuerTyp;
    }

    public void setTransparent(boolean transparent) {
        this.transparent = transparent;
    }

    @Override
    public void ausgabe() {
        super.ausgabe();
        System.out.println("\tTürtyp: " + (getTuerTyp() == null ? "Unbekannt" : getTuerTyp()));
        System.out.println("\tTransparent: " + (isTransparent() ? "Ja" : "Nein"));
        System.out.println();
    }
}
