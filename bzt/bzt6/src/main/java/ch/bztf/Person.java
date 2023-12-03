package ch.bztf;

public class Person {
    protected String nachname;
    private Person ehepartner;

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
}
