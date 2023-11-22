package ch.bztf;

public class App {
    public static void main(String[] args) {
        Person p = new Person();
        p.setNachname("Muster");

        Lehrer mt = new Lehrer();
        mt.setNachname("Lempel");
        mt.setFachbereich("RitschRatschMühle");
        mt.setPersonalNummer(12345);

        Lernende mus = new Lernende();
        mus.setNachname("Moritz");
        mus.setNummer(4711);

        Angestellte a = new Angestellte();
        a.setNachname("Müller");
        a.setPersonalNummer(10293);
        a.setSchulleitung(false);

        Angestellte sl = new Angestellte();
        sl.setNachname("Verwalti");
        sl.setPersonalNummer(54321);
        sl.setSchulleitung(true);

        System.out.println("Ich heisse " + p.getNachname() + ".");
        System.out.println(mus.vorstellen());
        System.out.println(mt.vorstellen());
        System.out.println(a.vorstellen());
        System.out.println(sl.vorstellen());
    }
}