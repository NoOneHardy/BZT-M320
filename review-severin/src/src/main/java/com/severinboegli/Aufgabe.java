package com.severinboegli;

/**
 * Definiert die Eigenschaften von einer Aufgabe. Dies sind unter anderem Name, Beschreibung, Priorität und Status.
 * @version 1.0
 * @since 2023-11-20
 * @author Severin Bögli
 */
public class Aufgabe {
    /**
     * Nummerierung der Aufgaben. Durch dies soll jede Aufgabe eine eindeutige ID erhalten.
     */
    private static int taskCounter = 10000;
    private int id;
    private String name;
    private String beschreibung;
    /**
     * Priorität der Aufgabe. Die Skala ist zwischen 1 & 5.
     * 1 => sehr wichtig
     * 5 => nicht wichtig
     */
    private int prioritaet;

    /**
     * Status der Aufgabe. Es gibt drei verschiedene Status: OPEN, ONGOING oder DONE.
     */
    public static enum Status {
        /**
         * Status der Aufgabe, wenn diese noch nicht begonnen wurde.
         */
        OPEN,
        /**
         * Status der Aufgabe, wenn diese begonnen wurde, aber noch nicht abgeschlossen ist.
         */
        ONGOING,
        /**
         * Status der Aufgabe, wenn diese abgeschlossen wurde.
         */
        DONE
    }
    private Status status;
    private Bild bild = null;

    /**
     * Konstruktor, der eine Aufgabe mit Standardwerten erstellt. Diese sind:
     * - Name: Aufgabe + ID
     * - Beschreibung: ""
     * - Priorität: 3
     * - Status: OPEN
     * - Bild: null
     */
    public Aufgabe() {
        setId();
        setName("Aufgabe" + id);
        setBeschreibung("");
        setPrioritaet(3);
        setStatus(Status.OPEN);
    }

    /**
     * Konstruktor, der eine Aufgabe mit den übergebenen Werten erstellt. --> beinhaltet kein Bild.
     * @param name Name der Aufgabe als String.
     * @param beschreibung Beschreibung der Aufgabe als String.
     * @param prioritaet Priorität der Aufgabe als int.
     * @param status Status der Aufgabe als enum, der die Werte OPEN, ONGOING oder DONE annehmen kann.
     */
    public Aufgabe(String name, String beschreibung, int prioritaet, Status status) {
        setId();
        setName(name);
        setBeschreibung(beschreibung);
        setPrioritaet(prioritaet);
        setStatus(status);
    }

    /**
     * Konstruktor, der eine Aufgabe mit den übergebenen Werten erstellt. --> beinhaltet auch ein Bild.
     * @param name Name der Aufgabe als String.
     * @param beschreibung Beschreibung der Aufgabe als String.
     * @param prioritaet Priorität der Aufgabe als int.
     * @param status Status der Aufgabe als enum, der die Werte OPEN, ONGOING oder DONE annehmen kann.
     * @param bild Bild der Aufgabe, die als Anhang hinzugefügt wird. Es ist ein Objekt der Klasse Bild.
     */
    public Aufgabe(String name, String beschreibung, int prioritaet, Status status, Bild bild) {
        setId();
        setName(name);
        setBeschreibung(beschreibung);
        setPrioritaet(prioritaet);
        setStatus(status);
        setBild(bild);
    }

    

    /**
     * Setter für die ID
     * @param id ID der Aufgabe als int.
     */
    private void setId() {
        this.id = taskCounter;
        taskCounter++;
    }

    /**
     * Getter für die ID
     * @return ID der Aufgabe als int.
     */
    public int getId() {
        return id;
    }

    /**
     * Setter für den Namen
     * @param name Name der Aufgabe als String.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter für den Namen
     * @return Name der Aufgabe als String.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter für die Beschreibung
     * @param beschreibung Beschreibung der Aufgabe als String.
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * Getter für die Beschreibung
     * @return Beschreibung der Aufgabe als String.
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Setter für die Priorität der Aufgabe. Die Skala liegt zwischen 1 und 5.
     * @param prioritaet Priorität der Aufgabe als int.
     * 1 => sehr wichtig
     * 5 => nicht wichtig
     *
     */
    public void setPrioritaet(int prioritaet) {
        this.prioritaet = prioritaet;
    }

    /**
     * Getter, der die Priorität der Aufgabe setzt. Die Skala ist zwischen 1 und 5.
     * @return gib die Priorität der Aufgabe als int zurück.
     */
    public int getPrioritaet() {
        return prioritaet;
    }

    /**
     * Setzt den Status der Aufgabe. Der Status kann OPEN, ONGOING oder DONE sein.
     * @param status Status der Aufgabe als enum, der die Werte OPEN, ONGOING oder DONE annehmen kann.
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Getter, der den Status der Aufgabe zurückgibt. Es gibt drei verschiedene Status: OPEN, ONGOING oder DONE.
     * @return Status der Aufgabe als enum, der die Werte OPEN, ONGOING oder DONE übergeben kann.
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Setter, der das hinzugefügt Bild erstllt und den Pfad angibt.
     * @param bild Bild der Aufgabe als Anhang. Es wird ein Objekt von der Klasse Bild übergeben.
     */
    public void setBild(Bild bild) {
        this.bild = bild;
    }

    /**
     * Getter, der das Bild der Aufgabe zurückgibt.
     * @return Bild der Aufgabe als Objekt von der Klasse Bild.
     */
    public Bild getBild() {
        return bild;
    }

    /**
     * Entfernt das hinterlegte Bild der Aufgabe.
     */
    public void removeBild() {
        this.bild = null;
    }

    /**
     * Listet alle Eigenschaften der Aufgabe auf.
     * @since 2023-11-20
     */
    public void printOutAufgabe() {
        System.out.println("---------- TASK ----------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Beschreibung: " + beschreibung);
        System.out.println("Priorität: " + prioritaet);
        System.out.println("Status: " + status);
        if (bild != null) {
            System.out.println("     ----- BILD -----     ");
            System.out.println("Pfad: " + bild.getPfad());
            System.out.println("Beschreibung: " + bild.getBeschreibung());
            System.out.println("Höhe: " + bild.getHoehe());
            System.out.println("Breite: " + bild.getBreite());
        }
        System.out.println("--------------------------\n");
    }
}
