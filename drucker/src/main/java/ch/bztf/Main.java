package ch.bztf;

public class Main {
    public static void main(String[] args) {
        Mitarbeiter chef = new Mitarbeiter("Hans", "Chef", "Kuendigungen bearbeiten");
        chef.printMitarbeiter();
    
        Mitarbeiter hr = new Mitarbeiter("Melanie", "Human Resources", "Bewerbungen ablehnen");
        hr.printMitarbeiter();
    }
}