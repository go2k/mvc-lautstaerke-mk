package model;

import java.util.Observable;
import java.util.Observer;

public class Lautstaerke extends Observable{

    private int lautstaerke;

    public Lautstaerke() {
        this.lautstaerke = 1;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        if (lautstaerke >= 0 && lautstaerke <= 10) {
            this.lautstaerke = lautstaerke;
            //Observer benachrichtigen
            setChanged();
            notifyObservers();
        }
    }


}
