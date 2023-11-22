package ch.bztf;

import java.util.ArrayList;

public class Zimmer {
    private String typ = null;
    private final ArrayList<Moebel> moebelList = new ArrayList<>();

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void addMoebel(Moebel moebel) {
        moebelList.add(moebel);
    }

    public ArrayList<Moebel> getMoebelList() {
        return moebelList;
    }
}
