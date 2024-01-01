package com.severinboegli;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Definiert die Eigenschaften des Benutzers. Der Benutzer speichert alle Personenbezüglichen Daten. Er speichert ausserdem, welche To-Do-Listen im Freigegeben sind.
 * @version 1.0
 * @since 2023-11-20
 * @author Severin Bögli
 */
public class Benutzer {
    private int id;
    private String vorname;
    private String nachname;
    private String email;
    private String passwort;
    private HashMap<Integer, SharedList> sharedToDoLists = new HashMap<Integer, SharedList>();
    /**
     * Nummerierung der Benutzer, damit jeder Benutzer eine eindeutige ID hat.
     */
    private static int userCounter = 100;
    private Scanner scanner = new Scanner(System.in);

    /**
     * Konstruktor für den Benutzer. Erstellt den Benutzer anhand der Übergabewerten.
     * @param vorname Vorname des Benutzers als String
     * @param nachname Nachname des Benutzers als String
     * @param email Email des Benutzers als String
     */
    public Benutzer(String vorname, String nachname, String email) {
        setId();
        setVorname(vorname);
        setNachname(nachname);
        setEmail(email);
        setPasswort("1234");
    }

    /**
     * Konstruktor für den Benutzer. Erstellt den Benutzer anhand einer Benutzerabfrage mit Scanner.
     * Die Werte werden in dem Konstruktor definiert.
     */
    public Benutzer(){
        setId();
        System.out.println("----------- Erstellen eines Benutzers ------------------");
        System.out.println("Was ist ihr Vorname?");
        setVorname(scanner.nextLine());
        System.out.println("Was ist ihr Nachname?");
        setNachname(scanner.nextLine());
        System.out.println("Geben sie ihre Email ein.");
        setEmail(scanner.nextLine());
        enterPasswort();
        System.out.println("----------- Erstellvorgang abgeschlossen ----------------");
    }

    /**
     * Setter für die ID des Benutzers.
     * @param id setzte die ID des Benutzers als int.
     */
    private void setId() {
        this.id = userCounter;
        userCounter++;
    }

    /**
     * Getter für die ID des Benutzers.
     * @return gibt die ID des Benutzers als int zurück.
     */
    public int getId() {
        return id;
    }

    /**
     * Setter für den Vornamen des Benutzers.
     * @param vorname setzte den Vorname des Benutzers als String.
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * Getter für den Vornamen des Benutzers.
     * @return gibt den Vorname des Benutzers als String zurück.
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Setter für den Nachnamen des Benutzers.
     * @param nachname setzte den Nachnamen des Benutzers als String.
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     * Getter für den Nachnamen des Benutzers.
     * @return gibt den Nachnamen des Benutzers als String zurück.
     */
    public String getNachname() {
        return nachname;
    }


    /**
     * Setter für die Mailadresse des Benutzers.
     * @param email setzte die Mailadresse des Benutzers als String.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter für die Mailadresse des Benutzers.
     * @return gibt die Mailadresse des Benutzers als String zurück.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter für das Passwort des Benutzers.
     * @param passwort setzte das Passwort des Benutzers als String.
     */
    private void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    /**
     * Setzt das Passwort des Benutzers. Das Passwort muss zweimal richtig eingegeben werden.
     * Falls das Password nicht übereinstimmt, muss dies wiederholt werden.
     */
    public void enterPasswort() {
        System.out.println("Bitte geben Sie ein Passwort ein für den Benutzer " + vorname + " " + nachname + ":");
        String passwort = scanner.nextLine();
        System.out.println("Bitte wiederholen Sie das Passwort:");
        String passwort2 = scanner.nextLine();
        
        while (!passwort.equals(passwort2)) {
            System.out.println("Passwörter stimmen nicht überein, bitte wiederholen Sie das Passwort:");

            System.out.println("Bitte geben Sie ein Passwort ein:");
            passwort = scanner.nextLine();
            System.out.println("Bitte wiederholen Sie das Passwort:");
            passwort2 = scanner.nextLine();
        }

        System.out.println("Passwort erfolgreich gesetzt!");
        setPasswort(passwort);
    }

    /**
     * Prüft, ob das Passwort des Benutzers korrekt ist.
     * @param password Passwort, welches geprüft werden soll.
     * @return gibt true zurück, falls das Passwort korrekt ist, ansonsten false.
     */
    public boolean isPasswordCorrect(String password) {
        return this.passwort.equals(password);
    }

    /**
     * Fügt eine neue SharedListe dem Benutzer hinzu. Dies wird gemacht, indem man das Objekt übergibt.
     * @param sharedList gibt an, welche SharedListe hinzugefügt werden soll.
     */
    protected void addSharedList(SharedList sharedList) {
        sharedToDoLists.put(sharedList.getId() , sharedList);
    }

    /**
     * Fügt eine neue SharedListe dem Benutzer hinzu. Dies wird anhand der ID und der gesamten Liste gemacht.
     * @param id die ID der SharedListe, die hinzugefügt werden soll an.
     * @param allLists übergibt die gesamte Liste, die gespeichert ist.
     
    public void addSharedList(int id, HashMap<Integer, SharedList> allLists) {
        sharedToDoLists.put(id, allLists.get(id));
    }
     */


    /**
     * Entfernt eine To-Do-Liste aus der Liste des Benutzers.
     * @param id ID der To-Do-Liste, die entfernt werden soll.
     */
    public void unlinkSharedList(int id) {
        sharedToDoLists.remove(id);
    }

    /**
     * Gibt die Attribute des Benutzers aus. Dies sind die ID, der Vorname, der Nachname, die Email und der Passwort Hash.
     * Es wird alles in der Konsole ausgegeben.
     */
    public void printOutBenutzer() {
        System.out.println("---------- USER ----------");
        System.out.println("ID: " + id);
        System.out.println("Vorname: " + vorname);
        System.out.println("Nachname: " + nachname);
        System.out.println("Email: " + email);
        System.out.println("Passwort Hash: " + passwort.hashCode());
        System.out.println("--------------------------\n");
    }

    /**
     * Gibt alle SharedLists des Benutzers aus. Es werden die ID und der Name der Liste ausgegeben.
     * Es wird alles in der Konsole ausgegeben.
     */
    public void printOutSharedLists() {
        System.out.println("-- ACCESSABLE LISTS --");
        for (SharedList accessList : sharedToDoLists.values()) {
            System.out.println("ID: " + accessList.getId() + " | Name: " + accessList.getName());
        }
        System.out.println("----------------------\n");
    }

    /**
     * Gibt alle Details des Benutzers aus. Dies sind die Attribute des Benutzers und die SharedLists.
     */
    public void printOutSharedListsDetails() {
        System.out.println("All Details of the User " + vorname + " " + nachname + ":");
        printOutBenutzer();
        printOutSharedLists();
    }
    
}
