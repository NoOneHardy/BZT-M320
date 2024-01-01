package ch.bztf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BadezimmerTest {
    private Badezimmer badezimmer;
    private WC wc;
    private Lavabo lavabo;
    private Dusche dusche;

    @BeforeEach
    public void setup() {
        wc = new WC();
        lavabo = new Lavabo();
        dusche = new Dusche();
        badezimmer = new Badezimmer(wc, lavabo, dusche);
    }

    @Test
    @DisplayName("Should contain a WC")
    public void shouldContainWc() {
        // Prüfen ob das WC nicht null ist
        assertNotNull(badezimmer.getWc());
    }

    @Test
    @DisplayName("Should contain a Lavabo")
    public void shouldContainLavabo() {
        // Prüfen ob das Lavabo nicht null ist
        assertNotNull(badezimmer.getLavabo());
    }

    @Test
    @DisplayName("Should contain a Dusche")
    public void shouldContainDusche() {
        // Prüfen ob die Dusche nicht null ist
        assertNotNull(badezimmer.getDusche());
    }

    @Test
    @DisplayName("Should exchange the Wc")
    public void shouldExchangeWC() {
        // Prüfen ob noch das alte WC installiert ist
        assertEquals(badezimmer.getWc(), wc);
        // Neues WC installieren
        badezimmer.setWc(new WC());
        // Prüfen ob das alte WC nicht mehr installiert ist
        assertNotEquals(badezimmer.getWc(), wc);
        // Prüfen ob das alte WC vollständig aus dem Badezimmer entfernt wurde
        assertFalse(badezimmer.getMoebelListe().contains(wc));
    }

    @Test
    @DisplayName("Should exchange the Lavabo")
    public void shouldExchangeLavabo() {
        // Prüfen ob noch das alte Lavabo installiert ist
        assertEquals(badezimmer.getLavabo(), lavabo);
        // Neues Lavabo installieren
        badezimmer.setLavabo(new Lavabo());
        // Prüfen ob das alte Lavabo nicht mehr installiert ist
        assertNotEquals(badezimmer.getLavabo(), lavabo);
        // Prüfen ob das alte Lavabo vollständig aus dem Badezimmer entfernt wurde
        assertFalse(badezimmer.getMoebelListe().contains(lavabo));
    }
    @Test
    @DisplayName("Should exchange the Dusche")
    public void shouldExchangeDusche() {
        // Prüfen ob noch die alte Dusche installiert ist
        assertEquals(badezimmer.getDusche(), dusche);
        // Neue Dusche installieren
        badezimmer.setDusche(new Dusche());
        // Prüfen ob die alte Dusche nicht mehr installiert ist
        assertNotEquals(badezimmer.getDusche(), dusche);
        // Prüfen ob die alte Dusche vollständig aus dem Badezimmer entfernt wurde
        assertFalse(badezimmer.getMoebelListe().contains(dusche));
    }
}
