package javacode.exercises.Chess;
import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {
    private final JSplitPane splitPane;
    private final JPanel topPanel;

    Dimension screenSize;

    public UI() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        this.setLayout(new BorderLayout());
//        this.setLayout(new GridLayout());
        this.makeFrameFullSize();
        this.setVisible(true);

        splitPane = new JSplitPane();
        topPanel = new JPanel();
//        board = new JPanel(Board);
        Board board = new Board();
//        board = new JPanel();
        board.repaint();

//        board = new JPanel(new GridLayout(8,8));
//        board = new JPanel(new GridLayout(8,8));

//        this.setPreferredSize(new Dimension(400, 400));     // let's open the window with a default size of 400x400 pixels
//        getContentPane().setLayout(new GridLayout());
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitPane.setDividerLocation(60);
        splitPane.setTopComponent(topPanel);
        splitPane.setBottomComponent(board);
        this.add(splitPane);
        board.setBackground(Color.lightGray);

    }

    private void makeFrameFullSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
    }
}
