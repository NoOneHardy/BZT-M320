package ch.bztf;

public class Square {
    // Property definieren: Ein Array für vier Punkte
    private Point[] _points = new Point[4];
    
    // Konstruktor
    public Square(Point a, Point b, Point c, Point d) {
        if (verifySquare(a, b, c, d)) {
            _points[0] = a;
            _points[1] = b;
            _points[2] = c;
            _points[3] = d;
        } else {
            _points[0] = new Point(0, 0);
            _points[1] = new Point(5, 0);
            _points[2] = new Point(5, 5);
            _points[3] = new Point(0, 5);
        }
    }

    // Methode um einen bestimmten Punkt im Viereck zu erhalten
    public Point getPoint(int pointIndex) {
        if (pointIndex < 4 && pointIndex >= 0) {
            return _points[pointIndex];
        }
        return null;
    }

    // Methode um einen bestimmten Punkt zu setzen
    public void setPoint(int pointIndex, Point point) {
        // Alle anderen Punkte speichern, die nicht geändert werden
        Point[] oldPoints = new Point[3];
        int index = 0;
        for (int i = 0; i < _points.length; i++) {
            if (i != pointIndex) {
                oldPoints[index] = _points[i];
                index++;
            }
        }
        // Prüfen ob der angegebene Index kleiner als 3 ist und das Viereck nach der Änderung valide ist.
        if (pointIndex < 4 && pointIndex >= 0 && verifySquare(oldPoints[0], oldPoints[1], oldPoints[2], point)) {
            _points[pointIndex] = point;
        } else {
            System.out.println("Dieser Punkt bildet kein Viereck.");
        }
    }

    // Methode um alle Punkte in einem Array zu erhalten
    public Point[] get_points() {
        return _points;
    }

    // Methode um ein bereits bestehendes Viereck zu validieren
    public boolean verifySquare() {
        return verifySquare(_points[0], _points[1], _points[2], _points[3]);
    }

    // Methode um ein neues Viereck zu validieren (Diese Funktion hat noch einen kleinen Fehler, funktioniert aber in den meisten Fällen)
    public boolean verifySquare(Point a, Point b, Point c, Point d) {
        Point[] points = new Point[] {a, b, c, d};
        double m = 0;
        Point[] testPoints = new Point[2];

        // Prüfen ob 2 Punkte auf einer anderen X-Position sind und dann die Steigung berechnenf
        // Die anderen beiden Punkte speichern
        // Man müsste zuerst noch prüfen, ob 3 Punkte auf derselben X-Koordinaten sind und dann false returnen
        if (points[0].getX() != points[1].getX()) {
            m = (points[0].getY() - points[1].getY())/(points[0].getX() - points[1].getX());
            testPoints[0] = points[2];
            testPoints[1] = points[3];
        } else if (points[0].getX() != points[2].getX()) {
            m = (points[0].getY() - points[2].getY())/(points[0].getX() - points[2].getX());
            testPoints[0] = points[1];
            testPoints[1] = points[3];
        } else if (points[0].getX() != points[3].getX()) {
            m = (points[0].getY() - points[3].getY())/(points[0].getX() - points[3].getX());
            testPoints[0] = points[1];
            testPoints[1] = points[3];
        } else {
            return false;
        }

        // Den Offset vom 0-Punkt berechnen
        double q = points[0].getY() - points[0].getX() * m;
        
        // Prüfen ob ein dritter Punkt auf derselben Geraden liegt
        boolean onSameFunction = false;
        for (Point testPoint : testPoints) {
            if (linearFunctionY(testPoint.getX(), m, q) == testPoint.getY()) {
                onSameFunction = true;
            }
        }

        // Falls das Viereck bisher valide ist, muss man das Viereck noch auf eine zweite Seite prüfen
        if (!onSameFunction) {
            // Prüfen ob 2 Punkte auf einer anderen X-Position sind und es nicht wieder dieselben zwei Punkte sind.
            // Dann die Steigung berechnenf
            // Die anderen beiden Punkte speichern
            if (points[0].getX() != points[1].getX() && !(testPoints[0] == points[2] && testPoints[1] == points[3])) {
                m = (points[0].getY() - points[1].getY())/(points[0].getX() - points[1].getX());
                testPoints[0] = points[2];
                testPoints[1] = points[3];
            } else if (points[0].getX() != points[2].getX() && !(testPoints[0] == points[1] && testPoints[1] == points[3])) {
                m = (points[0].getY() - points[2].getY())/(points[0].getX() - points[2].getX());
                testPoints[0] = points[1];
                testPoints[1] = points[3];
            } else if (points[0].getX() != points[3].getX() && !(testPoints[0] == points[1] && testPoints[1] == points[2])) {
                m = (points[0].getY() - points[3].getY())/(points[0].getX() - points[3].getX());
                testPoints[0] = points[1];
                testPoints[1] = points[2];
            } else {
                return false;
            }
            
            // Den Offset vom 0-Punkt berechnen
            q = points[0].getY() - points[0].getX() * m;
        
            // Prüfen ob der dritte Punkt auf derselben Geraden liegt
            for (Point testPoint : testPoints) {
                if (linearFunctionY(testPoint.getX(), m, q) == testPoint.getY()) {
                    onSameFunction = true;
                }
            }
        }

        // Zurück geben ob das Viereck valide ist
        return !onSameFunction;
    }

    // Y mit einer linearen Funktion aus X berechnen
    private double linearFunctionY(double x, double m, double q) {
        return m * x + q;
    }

    // Die Punkte des Viereck in einem lesbaren Format ausgeben
    // Beispiel: Viereck: (0 / 0), (1 / 0), (1 / 2), (0 / 2)
    public String getFormattedPoints() {
        StringBuilder formattedPoints = new StringBuilder("Viereck: ");
        for (Point point : _points) {
            formattedPoints.append(point.getFormattedPoint());
            if (point != _points[_points.length - 1]) {
                formattedPoints.append(", ");
            }
        }
        return formattedPoints.toString();
    }
}
