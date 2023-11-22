package ch.bztf;

public class Mieter {
    private String name;
    private int wohnungen = 0;

    public int getWohnungen() {
        return wohnungen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mieter(String name) {
        this.name = name;
    }

    public void wohnungMieten(Wohnung wohnung) {
        if (wohnung.istFrei()) {
            wohnung.mieten(this);
            wohnungen++;
        } else {
            System.out.println("Diese Wohnung wird bereits von " + wohnung);
        }
    }

    public void mietvertragKuenden(Wohnung wohnung) {
        if (wohnung.getMieter() == this) {
            wohnung.ausziehen();
            wohnungen--;
        } else {
            System.out.println("Dises Wohnung wird nicht von " + getName() + " gemietet.");
        }
    }
}
