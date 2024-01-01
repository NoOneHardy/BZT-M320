package ch.bztf;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class WohnungTest {
    private Mieter mieter;
    private Wohnung wohnung;

    @BeforeEach
    public void setup() {
        wohnung = new Wohnung(8, "Bsetziweg 10a");
        mieter = new Mieter("Silas Hardegger");
    }

    @Test
    @DisplayName("Should have 8 Zimmer")
    public void shouldHave8Zimmer() {
        // Prüfen ob die Anzahl Zimmer übernommen wurde
        assertEquals(wohnung.getAnzahlZimmer(), 8);
        assertEquals(wohnung.getZimmerListe().size(), 8);
    }

    @Test
    @DisplayName("Should be at Bsetziweg 10a")
    public void shouldBeAtBsetziweg10a() {
        // Prüfen ob die Adresse übernommen wurde
        assertEquals(wohnung.getAdresse(), "Bsetziweg 10a");
    }

    @Test
    @DisplayName("Should have 1 floor")
    public void shouldHave1Floor() {
        // Prüfen ob die Anzahl Stockwerke auf den Standardwert gesetzt wurde
        assertEquals(wohnung.getAnzahlStockwerke(), 1);
    }

    @Test
    @DisplayName("Should be available")
    public void shouldBeAvailable() {
        // Prüfen ob der Status auf den Standardwert gesetzt wurde
        assertTrue(wohnung.isFrei());
    }

    @Test
    @DisplayName("Should be rentable")
    public void shouldBeRentable() {
        // Prüfen ob die Wohnung keinen Mieter hat
        assertNull(wohnung.getMieter());
        // Mieter mietet die Wohnung
        mieter.wohnungMieten(wohnung);
        // Die Wohnung soll nicht mehr verfügbar sein
        assertFalse(wohnung.isFrei());
        // Der Mieter der Wohnung soll unser Mieter sein
        assertEquals(wohnung.getMieter(), mieter);
    }

    @Test
    @DisplayName("Should rebuild a Zimmer to a Schlafzimmer")
    public void shouldRebuildZimmerToSchlafzimmer() {
        // Möbel für das Schlafzimmer vorbereiten
        Bett bett = new Bett();
        ArrayList<Moebel> moebel = new ArrayList<>();
        moebel.add(bett);

        // Zimmer 0 soll ein normales Zimmer sein
        assertNotEquals(wohnung.getZimmer(0).getTyp(), "Schlafzimmer");
        // Wohnung soll keine Schlafzimmer haben
        assertEquals(wohnung.getSchlafzimmerListe().size(), 0);
        // Zimmer umbauen
        wohnung.zimmerUmbauen(0, "Schlafzimmer", moebel);
        // Zimmer soll ein Schlafzimmer sein
        assertEquals(wohnung.getZimmer(0).getTyp(), "Schlafzimmer");
        // Wohnung soll ein Schlafzimmer haben
        assertEquals(wohnung.getSchlafzimmerListe().size(), 1);
    }
}
