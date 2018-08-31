package javacode.exercises.Chess;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

//    setBackground(new Color(113,198,113));
    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        g.drawRect(100,100,410,410);
        Color navajoWhite = new Color(255,222,173);
        Color saddleBrown = new Color(139,69,19);

        for( int x = 0; x <= 350; x+=100){
            g.setColor(navajoWhite);
            for( int y = 0; y<=350; y +=200){
                g.fillRect(x,y,50,50);
            }
        }

//        g.setColor(new Color(255, 222, 173)); //sets the color to navajo white
//        g.fillRect(0,0,100,100);
//        g.setColor(new Color(139, 69, 19)); //sets the color to saddle brown
//        g.fillRect(100,0,100,100);
    }


}
