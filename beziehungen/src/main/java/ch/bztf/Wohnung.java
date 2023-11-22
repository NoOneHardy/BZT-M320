package ch.bztf;

import java.util.ArrayList;

public class Wohnung {
    private boolean frei = true;
    private Mieter mieter = null;
    private String adresse;
    private final ArrayList<Zimmer> zimmerList = new ArrayList<>();

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Wohnung(int anzahlZimmer, String addresse) {
        for (int i = 0; i < anzahlZimmer; i++) {
            zimmerList.add(new Zimmer());
        }
        setAdresse(addresse);
    }

    public boolean istFrei() {
        return frei;
    }

    public void mieten(Mieter mieter) {
        if (frei) {
            this.mieter = mieter;
            frei = false;
        } else {
            System.out.println("Diese Wohnung ist schon an " + this.mieter.getName() + " vermietet.");
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
        return zimmerList.get(i);
    }

    public void setZimmerTyp(String typ, int anzahlZimmer) {
        if (anzahlZimmer > zimmerList.size()) {
            System.out.println("Die Wohnung " + getAdresse() + "hat nicht so viele Zimmer");
            return;
        }

        int ungenutzteZimmer = getAnzahlUngenutzteZimmer();

        if (ungenutzteZimmer < anzahlZimmer) {
            if (ungenutzteZimmer == 0) {
                System.out.println("Die Wohnung " + getAdresse() + " hat keine ungenutzten Zimmer mehr.");
            } else if (ungenutzteZimmer == 1) {
                System.out.println("Die Wohnung " + getAdresse() + " hat nur noch 1 ungenutztes Zimmer.");
            } else {
                System.out.println("Die Wohnung " + getAdresse() + " hat nur noch " + ungenutzteZimmer + " ungenutzte Zimmer.");
            }
            return;
        }

        int geaenderteZimmer = 0;
        for (Zimmer zimmer : zimmerList) {
            if (geaenderteZimmer < anzahlZimmer) {
                if (zimmer.getTyp() == null) {

                    zimmer.setTyp(typ);
                    geaenderteZimmer++;
                }
            } else {
                break;
            }
        }
    }

    public int getAnzahlZimmer() {
        return zimmerList.size();
    }

    public int getAnzahlUngenutzteZimmer() {
        int ungenutzteZimmer = 0;
        for (Zimmer zimmer : zimmerList) {
            if (zimmer.getTyp() == null) {
                ungenutzteZimmer++;
            }
        }
        return ungenutzteZimmer;
    }
}
