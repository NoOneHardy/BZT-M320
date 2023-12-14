# Klassendiagramm Beziehungen

```plantuml
title Beziehungen
@startuml

class Main {
    .. Attribute ..
    .. Methoden ..
    +{static} main(String[] args): void
}

class Mieter {
    .. Attribute ..
    -name: String
    -anzahlWohnungen: int
    -wohnungen: ArrayList<Wohnung>
    .. Konstruktoren ..
    +Mieter(String name)
    .. Getter ..
    +getName(): String
    +getAnzahlWohnungen(): int
    +getWohnungen(): ArrayList<Wohnung>
    .. Setter ..
    +setName(String name): void
    .. Methoden ..
    +wohnungMieten(Wohnung wohnung): void
    +mietVertagKuenden(Wohnung wohnung): void
}

class Zimmer {
    .. Attribute ..
    -anzahlFenster: int
    -anzahlLampen: int
    -lichtAn: boolean
    -typ: String
    -moebelListe: ArrayList<Moebel>
    .. Konstruktoren ..
    +Zimmer()
    .. Getter ..
    +getAnzahlFenster(): int
    +getAnzahlLampen(): int
    +isLichtAn(): boolean
    +getTyp(): String
    +getMoebelListe(): ArrayList<Moebel>
    .. Setter ..
    +setTyp(String typ): void
    +setAnzahlFenster(int anzahlFenster): void
    +setAnzahlLampen(int anzahlLampen): void
    +setLichtAn(boolean licht): void
    .. Methoden ..
    +moebelHinzufuegen(Moebel moebel): void
    +moebelEntfernen(Moebel moebel): void
    +betaetigeLichtschalter(): boolean
}

class Schlafzimmer {
    .. Attribute ..
    -betten: ArrayList<Bett>
    -maxBetten: int
    .. Konstruktoren ..
    +Schlafzimmer(Bett bett, int maxBetten)
    +Schlafzimmer(ArrayList<Bett> betten)
    .. Getter ..
    +getBetten(): ArrayList<Bett>
    +getMaxBetten(): int
    .. Setter ..
    -setMaxBetten(int maxBetten): void
    .. Methoden ..
    +bettHinzufuegen(Bett bett): void
    +bettEntfernen(Bett bett): void
}

class Wohnzimmer {
    .. Attribute ..
    -sofas: ArrayList<Sofa>
    -couchtische: ArrayList<Couchtisch>
    -maxSofas: int = 1
    -maxCouchtische: int = 1
    .. Konstruktoren ..
    +Wohnzimmer(Couchtisch couchtisch, Sofa sofa, int maxSofas, int maxCouchtische)
    +Wohnzimmer(ArrayList<Couchtisch> couchtische, ArrayList<Sofa> sofas)
    .. Getter ..
    +getSofas(): ArrayList<Sofa>
    +getCouchtische(): ArrayList<Couchtisch>
    +getMaxSofas(): int
    +getMaxCouchtische(): int
    .. Setter ..
    -setMaxSofas(int maxSofas): void
    -setMaxCouchtische(int maxCouchtische): void
    .. Methoden ..
    +sofaHinzufuegen(Sofa sofa): void
    +sofaEntfernen(Sofa sofa): void
    +couchtischHinzufügen(Couchtisch couchtisch): void
    +couchtischEntfernen(Couchtisch couchtisch): void
}

class Badezimmer {
    .. Attribute ..
    -wc: WC
    -lavabo: Lavabo
    -dusche: Dusche
    .. Konstruktoren ..
    +Badezimmer(WC wc, Lavabo lavabo, Dusche dusche)
    .. Getter ..
    +getWc(): WC
    +getLavabo(): Lavabo
    +getDusche(): Dusche
    .. Setter ..
    +setWc(WC wc): void
    +setLavabo(Lavabo lavabo): void
    +setDusche(Dusche dusche): void
}

class Wohnung {
    .. Attribute ..
    -adresse: String
    -mieter: Mieter
    -anzahlStockwerke: int = 1
    -anzahlZimmer: int
    -miete: double
    -frei: boolean
    -zimmerListe: ArrayList<Zimmer>
    .. Konstruktoren ..
    +Wohnung(int anzahlZimmer, String adresse)
    +Wohnung(int anzahlZimmer, String adresse, int anzahlStockwerke)
    .. Getter ..
    +getAdresse(): String
    +getMieter(): Mieter
    +getAnzahlStockwerke(): int
    +getAnzahlZimmer(): int
    +getMiete(): double
    +getZimmerListe(): ArrayList<Zimmer>
    +isFrei(): boolean
    .. Setter ..
    +setMieter(Mieter mieter): void
    +setMiete(double miete): void
    -setAdresse(String adresse): void
    -setAnzahlZimmer(int anzahlZimmer): void
    -setAnzahlStockwerke(int anzahlStockwerke): void
    .. Methoden ..
    +zimmerUmbauen(int index, String typ, ArrayList<Moebel> moebelListe): void
    +mieten(Mieter mieter): void
    +ausziehen(): void
}

class Moebel {
    .. Attribute ..
    -typ: String
    -material: String
    -wert: double
    -hersteller: String
    -zimmer: Zimmer
    -breite: double
    -laenge: double
    .. Konstruktoren ..
    +Moebel()
    .. Getter ..
    +getTyp(): String
    +getMaterial(): String
    +getWert(): double
    +getHersteller(): String
    +getZimmer(): Zimmer
    +getBreite(): double
    +getLaenge(): double
    .. Setter ..
    +setTyp(String typ): void
    +setMaterial(String material): void
    +setWert(double wert): void
    +setHersteller(String hersteller): void
    +setBreite(double breite): void
    +setLaenge(double laenge): void
    .. Methoden ..
    +einrichten(Zimmer zimmer): void
    +ausZimmerNehmen(): void
}

class Bett {
    .. Attribute ..
    -plaetze: int
    -gemacht: boolean
    .. Konstruktoren ..
    +Bett()
    .. Getter ..
    +getPlaetze(): int
    +isGemacht(): boolean
    .. Setter ..
    +setPlaetze(int plaetze): void
    +setGemacht(boolean gemacht): void
    .. Methoden ..
    +machen(): void
}

class Sofa {
    .. Attribute ..
    -plaetze: int
    -ecksofa: boolean
    .. Konstruktoren ..
    +Sofa()
    .. Getter ..
    +getPlaetze(): int
    +isEcksofa(): boolean
    .. Setter ..
    +setPlaetze(int plaetze): void
    +setEcksofa(boolean ecksofa): void
}

class Couchtisch {
    .. Attribute ..
    -form: String
    -dekoriert: boolean
    .. Konstruktoren ..
    +Couchtisch()
    .. Getter ..
    +getForm(): String
    +isDekoriert(): boolean
    .. Setter ..
    +setForm(String form): void
    -setDekoriert(boolean dekoriert): void
    .. Methoden ..
    +dekorieren(): void
    +aufraeumen(): void
}

class WC {
    .. Attribute ..
    -elektrisch: boolean
    -benutzt: boolean
    .. Konstruktoren ..
    +WC()
    .. Getter ..
    +isElektrisch(): boolean
    +isBenutzt(): boolean
    .. Setter ..
    +setElektrisch(boolean elektrisch): void
    -setBenutzt(boolean benutzt): void
    .. Methoden ..
    +benutzen(): void
    +spuelen(): void
}

class Dusche {
    .. Attribute ..
    -tuerTyp: String
    -transparent: boolean
    .. Konstruktoren ..
    +Dusche()
    .. Getter ..
    +getTuerTyp(): String
    +isTransparent(): boolean
    .. Setter ..
    +setTuerTyp(String tuerTyp): void
    +setTransparent(boolean transparent): void
}

class Lavabo {
    .. Attribute ..
    -form: String
    -hahnTyp: String
    .. Konstruktoren ..
    +Lavabo()
    .. Getter ..
    +getForm(): String
    +getHahnTyp(): String
    .. Setter ..
    +setForm(String form): void
    +setHahnTyp(String hahnTyp): void
}

Zimmer "1..*" --* "1" Wohnung
Wohnung "0..*" --> "1" Mieter
Moebel "0..*" --> "0..1" Zimmer

Bett "1..*" --o "0..1" Schlafzimmer
Sofa "1..*" --o "0..1" Wohnzimmer
Couchtisch "1..*" --o "0..1" Wohnzimmer
WC "1" --o "0..1" Badezimmer
Dusche "1" --o "0..1" Badezimmer
Lavabo "1" --o "0..1" Badezimmer

Zimmer <|-- Schlafzimmer
Zimmer <|-- Wohnzimmer
Zimmer <|-- Badezimmer

Moebel <|-- Bett
Moebel <|-- Sofa
Moebel <|-- Couchtisch
Moebel <|-- WC
Moebel <|-- Dusche
Moebel <|-- Lavabo


@enduml
```