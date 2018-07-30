package javacode.exercises.BouncingBallDillon;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel implements Runnable{

    Thread loopThread = new Thread(this);
    int dx = 1;
    int dy = 1;
    Point ballPosition = new Point(20,20);

    public Panel() {
        loopThread.start();
        this.setSize(1920,1080);
        this.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(ballPosition.x,ballPosition.y,10,10);

        if( ballPosition.x > 1366) {
            dx = dx * -1;
            dy = dy * -1;

        }
        else if (ballPosition.x <1) {
            dx = dx * -1;
            dy = dy * -1;
        }

        ballPosition.x = ballPosition.x + dx;
        ballPosition.y = ballPosition.y + dy;
    }

    @Override
    public void run() {
        while(true)
            repaint();

    }
}
