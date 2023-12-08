package ch.bztf;

public abstract class Person {
    protected String nachname;
    private Person ehepartner;
    protected final double MINPREIS = 2.5;
    public abstract double kantineKonsum(int anzahl);

    protected Person(String nachname) {
        setNachname(nachname);
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getNachname() {
        return nachname;
    }

    public String vorstellen() {
        return "Guten Tag, ich heisse " + this.getNachname() + "! Von der " + this.getClass() + ".";
    }

    public Person getEhepartner() {
        return this.ehepartner;
    }

    protected void heiraten(Person ehepartner) {
        if (this != ehepartner) {
            if (getEhepartner() == null && ehepartner.getEhepartner() == null) {
                this.ehepartner = ehepartner;
                ehepartner.ehepartner = this;
                System.out.println(nachname + " und " + ehepartner.getNachname() + " haben geheiratet. ");
            } else {
                System.out.println(nachname + " und " + ehepartner.getNachname() + " können nicht heiraten, "
                        + "weil mindestens einer bereits verheiratet ist! ");
            }
        } else {
            System.out.println(nachname + " kann sich nicht selber heiraten!");
        }
    }

    protected void scheiden() {
        if (getEhepartner() != null) {
            Person ex = getEhepartner();
            ex.ehepartner = null;
            this.ehepartner = null;
            System.out.println(getNachname() + " und " + ex.getNachname() + " sind jetzt geschieden.");
        } else {
            System.out.println(getNachname() + " kann sich nicht scheiden lassen, weil er nicht verheiratet ist.");
        }
    }

    @Override
    public String toString() {
        String klasse = getClass().toString().split("@")[0];
        String string = getNachname();
        string += "\n\tKlasse: " + klasse.split("\\.")[klasse.split("\\.").length - 1];
        string += "\n\tZivilstand: " + (ehepartner == null ? "Single" : "Verheiratet");
        return string;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        return obj.getClass() == getClass() && this.hashCode() == (obj).hashCode();
    }

    @Override
    public int hashCode() {
        return nachname.hashCode();
    }
}
