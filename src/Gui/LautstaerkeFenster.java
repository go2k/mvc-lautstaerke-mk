package Gui;

import model.Lautstaerke;
import model.LautstaerkeLesen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class LautstaerkeFenster extends JFrame implements Observer {

    private JButton btnLauter, btnLeiser, btnMute;
    private JLabel lblLautstaerke;
    private EventController controller;

    public void setController(EventController eventController) {
        this.controller = eventController;
    }

    public LautstaerkeFenster() {
        initComponents();
        initEvents();
    }

    private void initEvents() {

        btnMute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.Mute();
            }
        });

        btnLeiser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.Leiser();
            }
        });

        btnLauter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.Lauter();
            }
        });

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
        Font font = lblLautstaerke.getFont();
        lblLautstaerke.setFont(new Font(font.getName(), font.getStyle(), 40));
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setTitle("Lautstärke");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        // View holt sich Daten vom model via interface
        LautstaerkeLesen model = (LautstaerkeLesen) o;
        int lautstaerke = model.getLautstaerke();

        // Daten anzeigen
        String lautstaerkeText = String.valueOf(lautstaerke);
        lblLautstaerke.setText(lautstaerkeText);
    }


}
