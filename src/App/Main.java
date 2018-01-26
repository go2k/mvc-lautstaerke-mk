package App;

import Gui.LautstaerkeFenster;
import model.Lautstaerke;

public class Main {

    public static void main(String[] args) {

        Lautstaerke model = new Lautstaerke();
        LautstaerkeFenster presenter = new LautstaerkeFenster();
        model.addObserver(presenter);
        model.setLautstaerke(7);

    }

}
