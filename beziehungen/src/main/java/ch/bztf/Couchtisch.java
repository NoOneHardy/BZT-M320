package ch.bztf;

/**
 * Ein Couchtisch ist eine Subklasse von Moebel.
 */
public class Couchtisch extends Moebel {
    /**
     * Die Form des Couchtisches
     */
    private String form;
    /**
     * Ist der Couchtisch dekoriert?
     */
    private boolean dekoriert;

    /**
     * Erstellt einen Couchtisch bzw. ein Moebel vom Typ Couchtisch.
     */
    public Couchtisch() {
        super("Couchtisch");
    }

    /**
     * Ein Getter fuer die Form des Couchtisches.
     * @return Die Form des Couchtisches
     */
    public String getForm() {
        return form;
    }

    /**
     * Ein Getter fuer das Property ob der Couchtisch dekoriert ist.
     * @return Boolean ob der Couchtisch dekoriert ist
     */
    public boolean isDekoriert() {
        return dekoriert;
    }

    /**
     * Ein Setter fuer die Form des Couchtisches.
     * @param form Die Form des Couchtisches
     */
    public void setForm(String form) {
        this.form = form;
    }

    /**
     * Ein Setter fuer das Property ob der Couchtisch dekoriert ist.
     * @param dekoriert Boolean ob der Couchtisch dekoriert ist
     */
    private void setDekoriert(boolean dekoriert) {
        this.dekoriert = dekoriert;
    }

    /**
     * Setzt das Property ob der Couchtisch dekoriert ist auf true.
     */
    public void dekorieren() {
        if (!isDekoriert()) {
            setDekoriert(true);
        } else {
            System.out.println("Dieser Couchtisch ist bereits dekoriert.");
        }
    }

    /**
     * Setzt das Property ob der Couchtisch dekoriert ist auf false.
     */
    public void aufraeumen() {
        if (isDekoriert()) {
            setDekoriert(false);
        } else {
            System.out.println("Dieser Couchtisch ist nicht dekoriert.");
        }
    }

    /**
     * Gibt die Eigenschaften des Couchtisches in der Konsole aus.
     */
    @Override
    public void ausgabe() {
        super.ausgabe();
        System.out.println("\tForm: " + (getForm() == null ? "Unbekannt" : getForm()));
        System.out.println("\tDekoriert: " + (isDekoriert() ? "Ja" : "Nein"));
        System.out.println();
    }
}
