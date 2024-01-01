package com.severinboegli;

import java.util.HashMap;

import com.severinboegli.Aufgabe.Status;

/**
 * Definiert die Eigenschaften einer SharedList. Eine SharedList speicher alle
 * Tasks und welche Benutzer Zugriff darauf haben.
 * 
 * @version 1.0
 * @since 2023-11-24
 * @author Severin Bögli
 */
public class SharedList {
    /**
     * Nummerierung der SharedList. Durch dies soll jede SharedList eine eindeutige
     * ID erhalten.
     */
    private static int listCounter = 1000;
    private int id;
    private String name;
    private String beschreibung;
    /**
     * HashMap, die alle Tasks der SharedList speichert. Die ID des Tasks wird als
     * Key verwendet.
     */
    private HashMap<Integer, Aufgabe> tasks = new HashMap<Integer, Aufgabe>();
    /**
     * HashMap, die alle Benutzer der SharedList speichert. Die ID des Benutzers
     * wird als Key verwendet.
     */
    private HashMap<Integer, Benutzer> users = new HashMap<Integer, Benutzer>();

    /**
     * Konstruktor, der eine geteilte Liste mit Standartwerten erstellt. Diese sind:
     * - name: SharedList + id
     * - beschreibung: ""
     */
    public SharedList() {
        setId();
        setName("SharedList" + id);
        setBeschreibung("");
    }

    /**
     * Konstruktor, der eine geteilte Liste erstellt mit den übergebenen Werten.
     * 
     * @param name         Name der geteilten Liste, als String
     * @param beschreibung Beschreibung der geteilten Liste, als String
     */
    public SharedList(String name, String beschreibung) {
        setId();
        setName(name);
        setBeschreibung(beschreibung);
    }

    /**
     * Setter für die ID der SharedList.
     */
    private void setId() {
        this.id = listCounter;
        listCounter++;
    }

    /**
     * Getter für die ID der SharedList.
     * 
     * @return gibt die ID der SharedList als int zurück.
     */
    public int getId() {
        return id;
    }

    /**
     * Setter für den Namen der SharedList.
     * 
     * @param name Name der SharedList als String.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter für den Namen der SharedList.
     * 
     * @return gibt den Namen der SharedList als String zurück.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter für die Beschreibung der SharedList.
     * 
     * @param beschreibung Beschreibung der SharedList als String.
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * Getter für die Beschreibung der SharedList.
     * 
     * @return gibt die Beschreibung der SharedList als String zurück.
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Fügt eine Aufgabe der To-Do-Liste hinzu. Die Aufgabe bekommt eine eindeutige
     * ID, die danach benutzt werden kann um in der HashMap darauf zuzugreifen.
     * Der Counter wird automatisch erhöht in der Klasse counter.
     * Der Aufgabe werden die Standartwerte zugewiesen.
     */
    public void addAufgabe() {
        Aufgabe task = new Aufgabe();
        tasks.put(task.getId(), task);
    }

    /**
     * Fügt eine Aufgabe der To-Do-Liste hinzu. Die Aufgabe bekommt eine eindeutige
     * ID, die danach benutzt werden kann um in der HashMap darauf zuzugreifen.
     * Der Counter wird automatisch erhöht in der Klasse counter. Es werden folgende
     * Parameter übergeben:
     * 
     * @param name         Name der Aufgabe als String.
     * @param beschreibung Beschreibung der Aufgabe als String.
     * @param prioritaet   Priorität der Aufgabe als int.
     * @param status       Status der Aufgabe als enum, der die Werte OPEN, ONGOING
     *                     oder DONE annehmen kann.
     */
    public void addAufgabe(String name, String beschreibung, int prioritaet, Status status) {
        Aufgabe task = new Aufgabe(name, beschreibung, prioritaet, status);
        tasks.put(task.getId(), task);

    }

    /**
     * Fügt eine Aufgabe der To-Do-Liste hinzu. Die Aufgabe bekommt eine eindeutige
     * ID, die danach benutzt werden kann um in der HashMap darauf zuzugreifen.
     * Der Counter wird automatisch erhöht in der Klasse counter. Es werden folgende
     * Parameter übergeben:
     * 
     * @param name         Name der Aufgabe als String.
     * @param beschreibung Beschreibung der Aufgabe als String.
     * @param prioritaet   Priorität der Aufgabe als int.
     * @param status       Status der Aufgabe als enum, der die Werte OPEN, ONGOING
     *                     oder DONE annehmen kann.
     * @param bild         Bild der Aufgabe, die als Anhang hinzugefügt wird. Es ist
     *                     ein Objekt der Klasse Bild.
     */
    public void addAufgabe(String name, String beschreibung, int prioritaet, Status status, Bild bild) {
        Aufgabe task = new Aufgabe(name, beschreibung, prioritaet, status, bild);
        tasks.put(task.getId(), task);

    }

    /**
     * Entfernt Aufgaben von der aktuellen Liste.
     * 
     * @param id ID der Aufgabe als int
     */
    public void removeAufgabe(int id) {
        tasks.remove(id);
    }

    /**
     * Fügt ein Benutzer der SharedList hinzu. Dies soll eine Freigabe darstellen.
     * 
     * @param benutzer Benutzer, der der Liste übergeben werden soll als Benutzer
     *                 Objekt.
     */
    public void addBenutzer(Benutzer benutzer) {
        try {
            users.put(benutzer.getId(), benutzer);
        benutzer.addSharedList(this);
        } catch (Exception e) {
            System.out.println("Benutzer konnte nicht hinzugefügt werden.");
        }
        
    }

    /**
     * Entfernt einen Benutzer der SharedList. Dies soll den Zugriff wieder
     * wegnehmen.
     * 
     * @param id ID der Benutzers als int.
     */
    public void removeBenutzer(int id) {
        users.get(id).unlinkSharedList(this.getId());
        users.remove(id);

    }

    /**
     * Gibt alle Aufgaben der Liste aus mit allen Eigenschaften.
     */
    public void printAllTasks() {
        if (!tasks.isEmpty()) {
            System.out.println("Alle Aufgaben der Liste " + name + ":");
            for (Aufgabe task : tasks.values()) {
                task.printOutAufgabe();
            }
        }

    }

    /**
     * Gibt alle Benutzer mit Zugriff auf die Liste aus. Es werden Vorname, Nachname
     * und ID ausgegeben.
     */
    public void printAllUsers() {
        if (!users.isEmpty()) {
            System.out.println("Folgende Benutzer haben Zugriff auf die Liste " + name + ":");
            for (Benutzer user : users.values()) {
                System.out.println("- " + user.getVorname() + " " + user.getNachname() + " (" + user.getId() + ")");
            }
        }

    }

    /**
     * Gibt alle Eigenschaften der Liste aus inkl Tasks und Users.
     * Listet neben allen Eigenschaften der Liste, alle Aufgaben und Benutzer auf.
     */
    public void printOutSharedListFull() {
        System.out.println("\n---------- SHARED LIST ----------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Beschreibung: " + beschreibung);
        printAllTasks();
        printAllUsers();
        System.out.println("---------------------------------");
    }

    /**
     * Gibt alle Eigenschaften der Liste aus, ohne die Tasks.
     * Listet Eigenschaften und Benutzer auf.
     */
    public void printOutSharedListUsers() {
        System.out.println("\n---------- SHARED LIST ----------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Beschreibung: " + beschreibung);
        printAllUsers();
        System.out.println("---------------------------------");
    }

}
