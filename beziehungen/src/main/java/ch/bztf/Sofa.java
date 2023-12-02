package ch.bztf;

public class Sofa extends Moebel{
    private int plaetze = 2;
    private boolean ecksofa;

    public Sofa() {
        super("Sofa");
    }

    public int getPlaetze() {
        return plaetze;
    }

    public boolean isEcksofa() {
        return ecksofa;
    }

    public void setPlaetze(int plaetze) {
        this.plaetze = plaetze;
    }

    public void setEcksofa(boolean ecksofa) {
        this.ecksofa = ecksofa;
    }

    @Override
    public void ausgabe() {
        super.ausgabe();
        System.out.println("\tPlätze: " + getPlaetze());
        System.out.println("\tEcksofa: " + (isEcksofa() ? "Ja" : "Nein"));
        System.out.println();
    }
}
