package App;

import Gui.LautstaerkeFenster;
import model.Lautstaerke;

public class Main {

    public static void main(String[] args) {

        Lautstaerke model = new Lautstaerke();
        LautstaerkeFenster lautstaerkeFenster = new LautstaerkeFenster();
        model.addObserver(lautstaerkeFenster);
        model.setLautstaerke(7);
    }

}
