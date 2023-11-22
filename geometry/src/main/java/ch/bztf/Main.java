package ch.bztf;

public class Main {
    public static void main(String[] args) {
        // Vier Punkte erstellen
        Point a = new Point(1, 2);
        Point b = new Point(3, 0);
        Point c = new Point(3, 3);
        Point d = new Point(0, 3);

        // Ein Viereck und ein Dreieck erstellen
        Square square = new Square(a, b, c, d);
        Triangle triangle = new Triangle(a, b, c);

        triangle.setPoint(2, d);
        square.setPoint(2, d);

        // Die Punkte des Dreiecks ausgeben
        System.out.println(triangle.getFormattedPoints());

        // Ausgabe ob die drei Punkte ein valides Dreieck bilden
        System.out.println(triangle.verifyTriangle());

        // Die Punkte des Vierecks ausgeben
        System.out.println(square.getFormattedPoints());

        // Ausgabe ob die vier Punkte ein valides Viereck bilden
        System.out.println(square.verifySquare());
    }
}
