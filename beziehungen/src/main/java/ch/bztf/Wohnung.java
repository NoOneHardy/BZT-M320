package ch.bztf;

import java.util.ArrayList;

/**
 * Eine Wohnung besteht aus mehreren Zimmern.
 * Wird die Wohnung zerstoert, werden auch alle Zimmer zerstoert.
 * Wohnungen koennen vermietet werden.
 */
public class Wohnung {
    /**
     * Die Adresse der Wohnung
     */
    private String adresse;
    /**
     * Der Mieter der Wohnung
     */
    private Mieter mieter;
    /**
     * Die Anzahl Stockwerke der Wohnung
     */
    private int anzahlStockwerke = 1;
    /**
     * Die Anzahl Zimmer der Wohnung
     */
    private int anzahlZimmer;
    /**
     * Die Miete der Wohnung
     */
    private double miete;
    /**
     * Ist die Wohnung frei?
     */
    private boolean frei = true;
    /**
     * Die Zimmer der Wohnung
     */
    private final ArrayList<Zimmer> zimmerListe = new ArrayList<>();

    /**
     * Erstellt eine Wohnung mit einer Adresse und deren Zimmer.
     * @param anzahlZimmer Die Anzahl Zimmer der Wohnung
     * @param adresse Die Adresse der Wohnung
     */
    public Wohnung(int anzahlZimmer, String adresse) {
        setAdresse(adresse);
        setAnzahlZimmer(anzahlZimmer);
        for (int iZimmer = 0; iZimmer < getAnzahlZimmer(); iZimmer++) {
            zimmerListe.add(new Zimmer());
        }
    }

    /**
     * Erstellt eine Wohnung mit einer Adresse, deren Zimmer und der Anzahl Stockwerke.
     * @param anzahlZimmer Die Anzahl Zimmer der Wohnung
     * @param adresse Die Adresse der Wohnung
     * @param anzahlStockwerke Die Anzahl Stockwerke der Wohnung
     */
    public Wohnung(int anzahlZimmer, String adresse, int anzahlStockwerke) {
        this(anzahlZimmer, adresse);
        setAnzahlStockwerke(anzahlStockwerke);
    }

    /**
     * Ein Getter fuer die Adresse der Wohnung.
     * @return Die Adresse der Wohnungh
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Ein Getter fuer den Mieter der Wohnung.
     * @return Der Mieter der Wohnung
     */
    public Mieter getMieter() {
        return mieter;
    }

    /**
     * Ein Getter fuer die Anzahl Stockwerke der Wohnung.
     * @return Die Anzahl Stockwerke der Wohnung
     */
    public int getAnzahlStockwerke() {
        return anzahlStockwerke;
    }

    /**
     * Ein Getter fuer die Anzahl Zimmer der Wohnung.
     * @return Die Anzahl Zimmer der Wohnung
     */
    public int getAnzahlZimmer() {
        return anzahlZimmer;
    }

    /**
     * Ein Getter fuer die Miete der Wohnung.
     * @return Die Miete der Wohnung
     */
    public double getMiete() {
        return miete;
    }

    /**
     * Ein Getter fuer das Property, ob die Wohnung frei ist.
     * @return Das Property, ob die Wohnung frei ist
     */
    public boolean isFrei() {
        return frei;
    }

    /**
     * Ein Getter fuer die Zimmer der Wohnung.
     * @return Die Zimmer der Wohnung
     */
    public ArrayList<Zimmer> getZimmerListe() {
        return zimmerListe;
    }

    /**
     * Ein Getter fuer ein bestimmtes Zimmer der Wohnung.
     * @param index Der Index des Zimmers
     * @return Das Zimmer der Wohnung
     */
    public Zimmer getZimmer(int index) {
        if (index < 0) index *= -1;
        if (index >= getAnzahlZimmer()) {
            System.out.println("Diese Wohnung hat nicht so viele Zimmer.");
            System.out.println("Das Zimmer mit dem Index 0 wird zurueckgegeben.");
            index = 0;
        }
        return getZimmerListe().get(index);
    }

    /**
     * Ein Getter fuer die Schlafzimmer der Wohnung.
     * @return Die Schlafzimmer der Wohnung
     */
    public ArrayList<Schlafzimmer> getSchlafzimmerListe() {
        ArrayList<Schlafzimmer> schlafzimmerListe = new ArrayList<>();
        for (Zimmer zimmer : zimmerListe) {
            if (zimmer.getClass().equals(Schlafzimmer.class)) schlafzimmerListe.add((Schlafzimmer) zimmer);
        }
        return schlafzimmerListe;
    }

    /**
     * Ein Getter fuer die Badezimmer der Wohnung.
     * @return Die Badezimmer der Wohnung
     */
    public ArrayList<Badezimmer> getBadezimmerListe() {
        ArrayList<Badezimmer> badezimmerListe = new ArrayList<>();
        for (Zimmer zimmer : zimmerListe) {
            if (zimmer.getClass().equals(Badezimmer.class)) badezimmerListe.add((Badezimmer) zimmer);
        }
        return badezimmerListe;
    }

    /**
     * Ein Getter fuer die Wohnzimmer der Wohnung.
     * @return Die Wohnzimmer der Wohnung
     */
    public ArrayList<Wohnzimmer> getWohnzimmerListe() {
        ArrayList<Wohnzimmer> wohnzimmerListe = new ArrayList<>();
        for (Zimmer zimmer : zimmerListe) {
            if (zimmer.getClass().equals(Wohnzimmer.class)) wohnzimmerListe.add((Wohnzimmer) zimmer);
        }
        return wohnzimmerListe;
    }

    /**
     * Ein Setter fuer die Miete der Wohnung.
     * @param miete Die Miete der Wohnung
     */
    public void setMiete(double miete) {
        if (miete < 0) miete *= -1;
        this.miete = miete;
    }

    /**
     * Ein Setter fuer den Mieter der Wohnung.
     * @param mieter Der Mieter der Wohnung
     */
    public void setMieter(Mieter mieter) {
        this.mieter = mieter;
        frei = mieter == null;
    }

    /**
     * Ein Setter fuer die Adresse der Wohnung.
     * @param adresse Die Adresse der Wohnung
     */
    private void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Ein Setter fuer die Anzahl Zimmer der Wohnung.
     * @param anzahlZimmer Die Anzahl Zimmer der Wohnung
     */
    private void setAnzahlZimmer(int anzahlZimmer) {
        if (anzahlZimmer < 1) {
            System.out.println("Eine Wohnung benoetigt mindestens ein Zimmer.");
            System.out.println("Die Anzahl Zimmer wird auf eins gesetzt");
            anzahlZimmer = 1;
        }
        this.anzahlZimmer = anzahlZimmer;
    }

    /**
     * Ein Setter fuer die Anzahl Stockwerke der Wohnung.
     * @param anzahlStockwerke Die Anzahl Stockwerke der Wohnung
     */
    private void setAnzahlStockwerke(int anzahlStockwerke) {
        if (anzahlStockwerke < 1) {
            System.out.println("Eine Wohnung benoetigt mindestens ein Stockwerk");
            System.out.println("Die Anzahl Stockwerke wird auf eins gesetzt");
            anzahlStockwerke = 1;
        }
        this.anzahlStockwerke = anzahlStockwerke;
    }

    /**
     * aendert den Typ eines Zimmers, raeumt die alten Moebel aus und fuegt neue Moebel hinzu.
     * @param index Der Index des Zimmers
     * @param typ Der neue Typ des Zimmers
     * @param moebelListe Die Liste der Moebel, die in das Zimmer hinzugefuegt werden sollen
     * @return Die Moebel, die aus dem Zimmer entfernt wurden
     */
    public ArrayList<Moebel> zimmerUmbauen(int index, String typ, ArrayList<Moebel> moebelListe) {
        // Wert wenn negativ invertieren
        if (index < 0) index *= -1;
        // Prüfen ob das Zimmer existiert
        if (index > getAnzahlZimmer()) {
            System.out.println("Die Wohnung " + getAdresse() + " hat nur " + getAnzahlZimmer() + " Zimmer.");
            System.out.println("Der angegebene Index " + index + " ist zu hoch.");
            System.out.println("Der Umbau wird nicht durchgefuehrt.");
            return new ArrayList<>();
        }
        // Typ formatieren
        typ = typ.substring(0, 1).toUpperCase() + typ.substring(1);
        // Altes Zimmer abrufen
        Zimmer altesZimmer = getZimmerListe().get(index);
        // Prüfen ob das Zimmer bereits von diesem Typ ist
        if (altesZimmer.getTyp().equals(typ)) {
            System.out.println("Dieses Zimmer ist bereits ein " + typ);
            return new ArrayList<>();
        }

        // Neues Zimmer initialisieren
        Zimmer neuesZimmer;
        // ArrayList mit den neuen Möbeln erstellen
        ArrayList<Moebel> sonstigeMoebel = new ArrayList<>(moebelListe);
        // ArrayList mit den alten Möbeln erstellen
        final ArrayList<Moebel> alteMoebel = altesZimmer.leeren();
        switch (typ) {
            // Das Zimmer wird ein Schlafzimmer
            case "Schlafzimmer":
                // ArrayList für Betten erstellen
                ArrayList<Bett> betten = new ArrayList<>();
                // Alle Möbel ins Zimmer stellen
                for (Moebel moebel : moebelListe) {
                    // Das Möbel ist ein Bett
                    if (moebel.getClass().equals(Bett.class)) {
                        // Bett ins Betten Array hinzufügen
                        betten.add((Bett) moebel);
                        sonstigeMoebel.remove(moebel);
                    }
                }
                // Zimmer zu einem Schlafzimmer machen
                neuesZimmer = new Schlafzimmer(betten);
                break;
            case "Badezimmer":
                WC wc = null;
                Lavabo lavabo = null;
                Dusche dusche = null;
                for (Moebel moebel : moebelListe) {
                    if (moebel.getClass().equals(WC.class)) {
                        if (wc == null) {
                            wc = (WC) moebel;
                            sonstigeMoebel.remove(moebel);
                        } else {
                            System.out.println("Ein Badezimmer kann nur ein WC haben.");
                            System.out.println("Alle anderen WCs werden zu den sonstigen Moebeln hinzugefuegt");
                        }
                    } else if (moebel.getClass().equals(Lavabo.class)) {
                        if (lavabo == null) {
                            lavabo = (Lavabo) moebel;
                            sonstigeMoebel.remove(moebel);
                        } else {
                            System.out.println("Ein Badezimmer kann nur ein Lavabo haben.");
                            System.out.println("Alle anderen Lavabos werden zu den sonstigen Moebeln hinzugefuegt");
                        }
                    } else if (moebel.getClass().equals(Dusche.class)) {
                        if (dusche == null) {
                            dusche = (Dusche) moebel;
                            sonstigeMoebel.remove(moebel);
                        } else {
                            System.out.println("Ein Badezimmer kann nur eine Dusche haben.");
                            System.out.println("Alle anderen Duschen werden zu den sonstigen Moebeln hinzugefuegt");
                        }
                    }
                }
                neuesZimmer = new Badezimmer(wc, lavabo, dusche);
                break;
            case "Wohnzimmer":
                ArrayList<Sofa> sofas = new ArrayList<>();
                ArrayList<Couchtisch> couchtische = new ArrayList<>();
                for (Moebel moebel : moebelListe) {
                    if (moebel.getClass().equals(Sofa.class)) {
                        sofas.add((Sofa) moebel);
                        sonstigeMoebel.remove(moebel);
                    }
                    if (moebel.getClass().equals(Couchtisch.class)) {
                        couchtische.add((Couchtisch) moebel);
                        sonstigeMoebel.remove(moebel);
                    }
                }
                neuesZimmer = new Wohnzimmer(couchtische, sofas);
                break;
            default:
                neuesZimmer = new Zimmer();
                neuesZimmer.setTyp(typ);
        }

        for (Moebel moebel : sonstigeMoebel) {
            neuesZimmer.moebelHinzufuegen(moebel);
        }

        neuesZimmer.setAnzahlLampen(altesZimmer.getAnzahlLampen());
        neuesZimmer.setLichtAn(false);
        neuesZimmer.setAnzahlFenster(altesZimmer.getAnzahlFenster());

        zimmerListe.set(index, neuesZimmer);
        return alteMoebel;
    }

    /**
     * Gibt die Informationen der Wohnung in der Konsole aus.
     */
    public void ausgabe() {
        System.out.println(getAdresse());
        System.out.println("\tAnzahl Stockwerke: " + getAnzahlStockwerke());
        System.out.println("\tAnzahl Zimmer: " + getAnzahlZimmer());
        for (Zimmer zimmer : getZimmerListe()) {
            System.out.println("\t\t" + zimmer.getTyp());
        }
        System.out.println("\tAnzahl Schlafzimmer: " + getSchlafzimmerListe().size());
        System.out.println("\tAnzahl Wohnzimmer: " + getWohnzimmerListe().size());
        System.out.println("\tAnzahl Badezimmer: " + getBadezimmerListe().size());
        System.out.println("\tMiete: CHF " + getMiete());
        System.out.println("\tFrei: " + (isFrei() ? "Ja" : "Nein"));
        if (!isFrei()) System.out.println("\tMieter: " + getMieter().getName());
        System.out.println();
    }
}
