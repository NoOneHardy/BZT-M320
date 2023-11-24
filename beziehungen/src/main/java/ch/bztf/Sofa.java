package ch.bztf;

public class Sofa extends Moebel{
    private int plaetze;
    private boolean ecksofa;

    public Sofa() {
        super();
        setTyp("Sofa");
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
}
