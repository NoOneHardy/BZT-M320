package ch.bztf;

public class WC extends Moebel {
    private boolean elektrisch;
    private boolean benutzt;

    public WC() {
        super("WC");
    }

    public boolean isElektrisch() {
        return elektrisch;
    }

    public boolean isBenutzt() {
        return benutzt;
    }

    public void setElektrisch(boolean elektrisch) {
        this.elektrisch = elektrisch;
        if (isBenutzt()) spuelen();
    }

    private void setBenutzt(boolean benutzt) {
        this.benutzt = benutzt;
    }

    public void benutzen() {
        setBenutzt(true);
        if (isElektrisch()) spuelen();
    }

    public void spuelen() {
        setBenutzt(false);
    }

    @Override
    public void ausgabe() {
        super.ausgabe();
        System.out.println("\tElektrisch: " + (isElektrisch() ? "Ja" : "Nein"));
        System.out.println("\tBenutzt: " + (isBenutzt() ? "Ja" : "Nein"));
        System.out.println();
    }
}
