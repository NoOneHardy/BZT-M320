package ch.bztf;

public class Mutter
{
    /**
    * refKindist eine Referenzvariable vom Typ Kind.
    * Sie muss auf etwas zeigen, hier eben auf null
    */
    private Kind refKind = null;
    // Eine normale Wertvariable
    private int alterMutter = 18;
    /**
    * refKind wird auf das Kind gesetzt
    * also auf das Kind, welches zur Mutter gehört!*/

    public void setIhrKind(Kind refKind)
    {
        this.refKind = refKind;
    }

    public Kind getIhrKind()
    {
        return refKind;
        /* Hinweis: Man erhält eine etwas komische Ausgabe, 
        * den von einer oberen Klasse abgeleiteten Hashwert.
        * Wir sagen dem hier einfach anschaulich Adresse*/
    }

    public void setAlterMutter(int alterMutter)
    {
        this.alterMutter = alterMutter;
    }
    public int getAlterMutter()
    {
        return alterMutter;
    }
}
