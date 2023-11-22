package ch.bztf;

public class App {
    public static void main(String[] args) {
        Person p = new Person("Muster");

        Lehrer mt = new Lehrer("Lempel", 12345, "RitschRatschMühle");

        Lernende mus = new Lernende("Moritz");
        mus.setNummer(4711);

        Angestellte a = new Angestellte("Müller");
        a.setPersonalNummer(10293);
        a.setSchulleitung(false);

        Angestellte sl = new Angestellte("Keller", 54321);
        sl.setSchulleitung(true);

        System.out.println(p.vorstellen());
        System.out.println(mus.vorstellen());
        System.out.println(mt.vorstellen());
        System.out.println(a.vorstellen());
        System.out.println(sl.vorstellen());
    }
}