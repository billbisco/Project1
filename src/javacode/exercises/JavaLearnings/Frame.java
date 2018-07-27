package javacode.exercises.JavaLearnings;

import javax.swing.*;

public class Frame extends JFrame {

    Boolean booley = false;

    public Frame() {
        this.setSize(1920,1080);
        this.add(new Panel());
        this.setVisible(true);
        this.booley = true;
    }

    public static void main(String[] args) {
        Frame framey = new Frame();

    }
}
