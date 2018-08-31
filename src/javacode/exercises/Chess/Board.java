package javacode.exercises.Chess;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

//    setBackground(new Color(113,198,113));
    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        g.drawRect(100,100,410,410);


        g.setColor(new Color(255, 222, 173)); //sets the color to navajo white
        g.fillRect(0,0,100,100);
        g.setColor(new Color(139, 69, 19)); //sets the color to saddle brown
        g.fillRect(100,0,100,100);
    }


}
