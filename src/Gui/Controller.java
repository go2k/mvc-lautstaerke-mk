package Gui;

import model.Lautstaerke;
import model.LautstaerkeLesen;
import model.LautstaerkeSchreiben;

import java.util.Observable;
import java.util.Observer;

public class Controller implements EventController, Observer {

    private LautstaerkeLesen modelLesen;
    private LautstaerkeSchreiben modelSchreiben;
    private LautstaerkeFenster lautstaerkeFenster;
    private int lautstaerke;

    public Controller(LautstaerkeSchreiben modelSchreiben) {
        this.modelSchreiben = modelSchreiben;
    }


    @Override
    public void update(Observable o, Object arg) {
        LautstaerkeLesen model = (LautstaerkeLesen) o;
        lautstaerke = model.getLautstaerke();
    }

    @Override
    public void Lauter() {
        modelSchreiben.setLautstaerke(lautstaerke + 1);
    }

    @Override
    public void Leiser() {
        modelSchreiben.setLautstaerke(lautstaerke - 1);
    }

    @Override
    public void Mute() {
        modelSchreiben.setLautstaerke(0);
    }
}
