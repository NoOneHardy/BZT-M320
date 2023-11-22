package ch.bztf;

public class Triangle {
    // Property definieren; Ein Array für drei Punkte
    private Point[] _points = new Point[3];

    // Konstruktor für ein Dreieck mit den angegebene Punkten als Eckpunkte
    // Die angegebenen Werte werden nur gesetzt, falls das Dreieck valide ist
    // Ansonsten werden Standardwerte gesetzt
    public Triangle(Point a, Point b, Point c) {
        // Dreieck validieren
        if (verifyTriangle(a, b, c)) {
            // Werte ins Property schreiben
            _points[0] = a;
            _points[1] = b;
            _points[2] = c;
        } else {
            // Standardwerte ins Property schreiben
            _points[0] = new Point(0, 0);
            _points[1] = new Point(5, 0);
            _points[2] = new Point(2.5, 5);
        }
    }

    // Methode um einen bestimmten Punkt im Dreieck zu erhalten.
    public Point getPoint(int pointIndex) {
        if (pointIndex < 3 && pointIndex >= 0) {
            return _points[pointIndex];
        }
        return null;
    }

    // Methode um einen bestimmten Punkt zu setzen
    public void setPoint(int pointIndex, Point point) {
        // Alle anderen Punkte speichern, die nicht geändert werden
        Point[] oldPoints = new Point[2];
        int index = 0;
        for (int i = 0; i < _points.length; i++) {
            if (i != pointIndex) {
                oldPoints[index] = _points[i];
                index++;
            }
        }
        // Prüfen ob der angegebene Index kleiner als 2 ist und das Dreieck nach der Änderung valide ist
        if (pointIndex < 3 && pointIndex >= 0 && verifyTriangle(oldPoints[0], oldPoints[1], point)) {
            _points[pointIndex] = point;
        } else {
            System.out.println("Dieser Punkt bildet kein Dreieck.");
        }
    }

    // Methode um alle Punkte in einem Array zu erhalten
    public Point[] getPoints() {
        return _points;
    }

    // Methode um ein bereits bestehendes Dreieck zu validieren
    public boolean verifyTriangle() {
        return verifyTriangle(_points[0], _points[1], _points[2]);
    }

    // Methode um ein neues Dreieck zu validieren
    public boolean verifyTriangle(Point a, Point b, Point c) {
        Point[] points = new Point[] {a, b, c};
        double m = 0;
        Point testPoint;

        // Prüfen ob 2 Punkte auf einer anderen X-Position sind und dann die Steigung berechnen
        // Den anderen Punkt speichern
        // Ansonsten sind alle Punkte übereinander und es wird false returned
        if (points[0].getX() != points[1].getX()) {
            m = (points[0].getY() - points[1].getY())/(points[0].getX() - points[1].getX());
            testPoint = points[2];
        } else if (points[0].getX() != points[2].getX()) {
            m = (points[0].getY() - points[2].getY())/(points[0].getX() - points[2].getX());
            testPoint = points[1];
        } else {
            return false;
        }
        
        // Den Offset vom 0-Punkt berechnen
        double q = points[0].getY() - points[0].getX() * m;
        
        // Prüfen ob der dritte Punkt auf der selben Geraden liegt
        boolean onSameFunction = false;
        if (linearFunctionY(testPoint.getX(), m, q) == testPoint.getY()) {
            onSameFunction = true;
        }

        // Zurück geben ob das Dreieck valide ist
        return !onSameFunction;
    }

    // Y mit einer linearen Funktion aus X berechnen
    private double linearFunctionY(double x, double m, double q) {
        return m * x + q;
    }

    // Die Punkte des Dreiecks in einem lesbaren Format ausgeben
    // Beispiel: Dreieck: (0 / 0), (1 / 1), (0 / 2)
    public String getFormattedPoints() {
        StringBuilder formattedPoints = new StringBuilder("Dreieck: ");
        for (Point point : _points) {
            formattedPoints.append(point.getFormattedPoint());
            if (point != _points[_points.length - 1]) {
                formattedPoints.append(", ");
            }
        }
        return formattedPoints.toString();
    }
}
