package javacode.exercises.BouncingBallDillon;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel implements Runnable{

    Thread loopThread = new Thread(this);
    int dx = 1;
    int dy = 0;
    Point oval1Position = new Point(20,20);
    Point oval2Position = new Point(40,40);
    Point oval3Position = new Point(60,60);
    Point oval4Position = new Point(80,80);
    Point oval5Position = new Point(100,100);
    Point oval6Position = new Point(120,120);
    Point oval7Position = new Point(140,140);

    public Panel() {
        loopThread.start();
        this.setSize(1920,1080);
        this.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(oval1Position.x, oval1Position.y,10,10);
        g.drawOval(oval2Position.x, oval2Position.y,10,10);
        g.drawOval(oval3Position.x, oval3Position.y,10,10);
        g.drawOval(oval4Position.x, oval4Position.y,10,10);
        g.drawOval(oval5Position.x, oval5Position.y,10,10);
        g.drawOval(oval6Position.x, oval6Position.y,10,10);
        g.drawOval(oval7Position.x, oval7Position.y,10,10);

        if( oval1Position.x > 1366) {
            dx = dx * -1;
            dy = dy * -1;

        }
        else if (oval1Position.x <1) {
            dx = dx * -1;
            dy = dy * -1;
        }

        oval1Position.x = oval1Position.x + dx;
        oval1Position.y = oval1Position.y + dy;
        oval2Position.y = oval2Position.y + dy;
        oval2Position.x = oval2Position.x + dx;
        oval3Position.x = oval3Position.x + dx;
        oval4Position.x = oval4Position.x + dx;
        oval5Position.x = oval5Position.x + dx;
        oval6Position.x = oval6Position.x + dx;
        oval7Position.x = oval7Position.x + dx;
    }

    @Override
    public void run() {
        while(true)
            repaint();

    }
}
