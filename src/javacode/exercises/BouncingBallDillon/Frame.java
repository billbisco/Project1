package javacode.exercises.BouncingBallDillon;

import javax.swing.*;

public class Frame extends JFrame {

    boolean booley = false;

    public Frame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.add(new Panel());
        this.setVisible(true);
        this.booley = true;
    }

    public static void main(String[] args) {
        Frame framey = new Frame();

    }
}
