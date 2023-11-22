package ch.bztf;

public class Kind
{
    /**
    * DasKind hat noch keine Kenntnis von Mutter,
    * zeigt auf null
    */
    private Mutter refMutter = null;
    // Normale Wertvariable
    private int geburtsJahr= 0;
    public int getGeburtsJahr() {
        return geburtsJahr;
    }
    public void setGeburtsJahr(int geburtsJahr) {
        this.geburtsJahr = geburtsJahr;
    }
    /**
    * Es findet eine Parameterübergabe statt.
    * Die Klasse Kind macht einen Verweis zur Mutter.
    * Das Kind kennt nun seine Mutter.
    */
    public void setSeineMutter(Mutter refMutter)
    {
        this.refMutter = refMutter;
    }
    public Mutter getSeineMutter()
    {
        return refMutter;
    }
}
