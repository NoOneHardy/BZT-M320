package ch.bztf;

public class Point {
    // Properties definieren; Eines für jede Achse
    private double _x = 0;
    private double _y = 0;

    // Konstruktor für benutzerdefinierte Werte, welche vor der Erstellung validiert werden
    public Point(double x, double y) {
        _x = validate(x);
        _y = validate(y);
    }

    // Konstruktor für Standardwerte (0, 0)
    public Point() {}

    // Methode um die X-Koordinate zu erhalten
    public double getX() {
        return _x;
    }

    // Methode um die Y-Koordinate zu erhalten
    public double getY() {
        return _y;
    }

    // Methode um die X-Koordinate auf einem validierten Wert zu setzen
    public void setX(double x) {
        _x = validate(x);
    }

    // Methode um die X-Koordinate auf einem validierten Wert zu setzen
    public void setY(double y) {
        _y = validate(y);
    }

    // Methode um Werte zu validieren
    // Werte grösser als hundert werden auf hundert gesetzt
    // Werte kleiner als hundert werden auf minus hundert gesetzt
    private double validate(double value) {
        if (value <= 100 && value >= -100) {
            return value;
        } else if (value > 100) {
            System.out.println("Der angegebene Wert ist zu gross und wird auf 100 gesetzt");
            return 100;
        } else {
            System.out.println("Der angegebene Wert ist zu klein und wird auf -100 gesetzt");
            return-100;
        }
    }

    // Methode um die Koordinaten des Punkts formatiert auszugeben
    // Beispiel: (0 / 0)
    public String getFormattedPoint() {
        return "(" + _x + " / " + _y + ")";
    }
}
