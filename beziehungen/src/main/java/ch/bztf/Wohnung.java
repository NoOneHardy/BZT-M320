package ch.bztf;

import java.util.ArrayList;

public class Wohnung {
    private boolean frei = true;
    private Mieter mieter = null;
    private String adresse;
    private ArrayList<Zimmer> zimmer = new ArrayList<Zimmer>();

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Wohnung(int anzahlZimmer, String addresse) {
        for (int i = 0; i < anzahlZimmer; i++) {
            zimmer.add(new Zimmer());
        }
        this.adresse = addresse;
    }

    public boolean istFrei() {
        return frei;
    }

    public void mieten(Mieter mieter) {
        if (frei) {
            this.mieter = mieter;
            frei = false;
        } else {
            System.out.println("Diese Wohnung ist schon an " + mieter.getName() + " vermietet.");
        }
    }

    public void ausziehen() {
        if (!frei) {
            frei = true;
            mieter = null;
        } else {
            System.out.println("Diese Wohnung ist bereits frei.");
        }
    }

    public Mieter getMieter() {
        return mieter;
    }

    public Mieter mieterWechseln(Mieter mieterNeu) {
        Mieter mieterAlt = mieter;
        ausziehen();
        mieten(mieterNeu);
        return mieterAlt;
    }

    public Zimmer getZimmer(int i) {
        return zimmer.get(i);
    }

    public void setZimmerTyp(String typ, int anzahlZimmer) {
        if (anzahlZimmer > zimmer.size()) {
            System.out.println("Diese Wohnung hat nicht so viele Zimmer");
            return;
        }

        int geaenderteZimmer = 0;
        int[] zimmerIndexe = new int[anzahlZimmer];
        for (Zimmer zimmerEinzel : zimmer) {
            if (zimmerEinzel.getTyp() == null) {
                
            }
        }
    }
}
