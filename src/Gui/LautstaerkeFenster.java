package Gui;

import model.Lautstaerke;
import model.LautstaerkeLesen;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class LautstaerkeFenster extends JFrame implements Observer {

    private JButton btnLauter, btnLeiser, btnMute;
    private JLabel lblLautstaerke;

    public LautstaerkeFenster() {
        initComponents();
    }

    private void initComponents() {

        btnLauter = new JButton("Lauter");
        btnLeiser = new JButton("Leiser");
        btnMute = new JButton("Mute");
        lblLautstaerke = new JLabel("---");
        lblLautstaerke.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(btnLauter, BorderLayout.EAST);
        this.add(btnLeiser, BorderLayout.WEST);
        this.add(btnMute, BorderLayout.NORTH);
        this.add(lblLautstaerke, BorderLayout.CENTER);

        this.setSize(300, 200);
        this.setTitle("Lautstärke");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        // View holt sich Daten vom model via interface
        int lautstaerke = ((LautstaerkeLesen) o).getLautstaerke();

        // Daten anzeigen
        String lautstaerkeText = String.valueOf(lautstaerke);
        lblLautstaerke.setText(lautstaerkeText);
    }


}
