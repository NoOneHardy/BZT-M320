package ch.bztf;

public class Buch {
    private String titel;
    private boolean ausgeliehen = false;

    public boolean ausleihen() {
        if (!this.getStatus()) {
            this.ausgeliehen = true;
            return true;
        }
        return false;
    }

    public boolean zurueck() {
        if (this.getStatus()) {
            this.ausgeliehen = false;
            return true;
        }
        return false;
    }

    public boolean getStatus() {
        return this.ausgeliehen;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String title) {
        this.titel = title;
    }
}
