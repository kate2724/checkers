package Checkers;

import java.awt.EventQueue;
//import java.awt.event;
import javax.swing.JFrame;

public class Checkers extends JFrame{
    public Checkers() {
        initUI();
    }

    private void initUI() {

//      creates board
        Board board =new Board();
        add(board);
//        board.drawCheckerPiece(x,y, Graphics g);
        setSize(650, 675);
        setTitle("Checkers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        board.addMouseListener(new MyMouseListener());
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Checkers ex = new Checkers();
            ex.setVisible(true);
        });
    }
}

