package ch.bztf;

public class Main
{
    public static void main(String[] args)
    {
        // Es werden konkrete Objekte (Instanzen) erzeugt
        Mutter frauMu = new Mutter();
        Mutter frauSa = new Mutter();
        Kind claudia = new Kind();
        // Setzen des Alters der Instanz frauMu
        frauMu.setAlterMutter(28);
        frauSa.setAlterMutter(32);
        // frauMu bekommt Claudia zeigt auf Instanz Claudia
        frauMu.setIhrKind(claudia);
        frauSa.setIhrKind(claudia);
        // Kind Claudia zeigt auf frauMu, also das Kind von frauMu
        claudia.setSeineMutter(frauMu);
        System.out.println("Frau Muster mit ihrer Tochter Claudia");
        System.out.println("Quasi Adresse des Kindes von frauMu: " + frauMu.getIhrKind());
        System.out.println("Quasi Adresse des Kindes von frauSa. " + frauSa.getIhrKind());

        System.out.println("Quasi Adresse der Mutter von Claudia: " + claudia.getSeineMutter());

        System.out.println("Alter der Mutter von Claudia: " + frauMu.getAlterMutter());
    }
}