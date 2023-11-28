package ch.bztf;

public class Lavabo extends Moebel {
    private String form;
    private String hahnTyp;

    public Lavabo() {
        super("Lavabo");
    }

    public String getForm() {
        return this.form;
    }

    public String getHahnTyp() {
        return hahnTyp;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setHahnTyp(String hahnTyp) {
        this.hahnTyp = hahnTyp;
    }
}
