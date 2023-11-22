package ch.bztf;

public class Moebel {
    private String typ = "";
    private String material = "";
    private Zimmer zimmer = null;

    public Moebel(String typ, String material, Zimmer zimmer) {
        setTyp(typ);
        setMaterial(material);
        setZimmer(zimmer);
        zimmer.addMoebel(this);
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Zimmer getZimmer() {
        return zimmer;
    }

    public void setZimmer(Zimmer zimmer) {
        this.zimmer = zimmer;
    }
}
