package javacode.exercises.JavaLearnings;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public Panel() {
        this.setSize(1920,1080);
        this.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(20,20,10,10);
    }

}
