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
    }

    private void setBenutzt(boolean benutzt) {
        this.benutzt = benutzt;
    }

    public void benutzen() {
        setBenutzt(true);
    }

    public void spuelen() {
        setBenutzt(false);
    }
}
