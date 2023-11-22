package ch.bztf;

import java.util.ArrayList;

public class Kunde {
    private String name;
    private ArrayList<Buch> buecher = new ArrayList<Buch>();

    public void buchLeihen(Buch buch) {
        if (buch.ausleihen()) {
            buecher.add(buch);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void listeAusgeben() {
        for (Buch buch : buecher) {
            System.out.println(buch.getTitel());
        }
    }

    public void buchZurueckgeben(Buch buch) {
        if (buecher.remove(buch)) {
            buch.zurueck();
        }
    }

    public boolean buecherAusgehliehen() {
        return buecher.size() > 0;
    }
}
