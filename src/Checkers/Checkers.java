package Checkers;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Checkers extends JFrame{
    public Checkers() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setSize(250, 200);

        setTitle("Checkers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Checkers ex = new Checkers();
            ex.setVisible(true);
        });
    }
}

