package lautstaerke;

public class Lautstaerke {

    private int lautstaerke;

    public Lautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        if (lautstaerke >= 0 && lautstaerke <= 10) {
            this.lautstaerke = lautstaerke;
        }
    }


}
