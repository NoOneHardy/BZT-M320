package ch.bztf;

public class App {
    public static void main(String[] args) {
        Lernender noelia = new Lernender("Noelia Herzog");
        Angestellter dominik = new Angestellter("Dominik Schneider", 8392);
        Lehrer felix = new Lehrer("Felix Zuber", 2937, "Datensicherheit");
        Angestellter marlene = new Angestellter("Marlene Stähli", 7483);
        Lernender daniel = new Lernender("Daniel Lehner");
        Lehrer ramin = new Lehrer("Ramin Wellenberger", 2937, "Serverinfrastruktur");
        daniel.setNummer(5498);

        felix.scheiden();
        noelia.heiraten(dominik);
        felix.heiraten(noelia);
        dominik.scheiden();
        noelia.heiraten(noelia);
        felix.heiraten(noelia);

        System.out.println();
        System.out.println(noelia);
        System.out.println();
        System.out.println(dominik);
        System.out.println();
        System.out.println(felix);
        System.out.println();
        System.out.println(marlene);
        System.out.println();
        System.out.println(daniel);
        System.out.println();

        System.out.println(dominik.equals(dominik)); // true
        System.out.println(dominik.equals(noelia)); // false
        System.out.println(ramin.equals(felix)); // true
        System.out.println(ramin.equals(null)); // false
    }
}