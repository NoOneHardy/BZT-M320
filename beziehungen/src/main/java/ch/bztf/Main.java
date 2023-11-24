package ch.bztf;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Wohnung wohnung = new Wohnung(2, "Hopfenstrasse 12");
        ArrayList<Moebel> moebel = wohnung.zimmerUmbauen(0, "Schlafzimmer", new ArrayList<>());
        System.out.println(moebel);
        System.out.println(wohnung.getAdresse());
        System.out.println(wohnung.getSchlafzimmerListe().get(0).getBetten());
        System.out.println(wohnung.getBadezimmerListe().get(0).getDusche());
    }
}