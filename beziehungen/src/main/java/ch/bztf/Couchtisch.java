package ch.bztf;

public class Couchtisch extends Moebel{
    private String form;
    private boolean dekoriert;

    public Couchtisch() {
        super();
        setTyp("Couchtisch");
    }

    public String getForm() {
        return form;
    }

    public boolean isDekoriert() {
        return dekoriert;
    }

    public void setForm(String form) {
        this.form = form;
    }

    private void setDekoriert(boolean dekoriert) {
        this.dekoriert = dekoriert;
    }

    public void dekorieren() {
        if (!isDekoriert()) {
            setDekoriert(true);
        } else {
            System.out.println("Dieser Couchtisch ist bereits dekoriert.");
        }
    }

    public void aufraeumen() {
        if (isDekoriert()) {
            setDekoriert(false);
        } else {
            System.out.println("Dieser Couchtisch ist nicht dekoriert.");
        }
    }
}
