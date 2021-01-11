package Checkers;

import javax.swing.JPanel;
import java.awt.*;

import java.awt.event.*;

public class Board extends JPanel{
//    public Board() {}
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawCheckerboard(g);
        drawCheckerPiece(g, Color.BLACK, 0, 0);
        drawCheckerPiece(g, Color.YELLOW, 0, 480);
    }
    private void drawCheckerboard(Graphics g) {
        int x=0;
        int y=0;
        int counter=0;

        for(int j=0; j <8; j++){
            for(int i =0; i<4; i++){
                g.setColor(Color.GRAY);
                g.fillRect(x,y,80,80);
                x=x+160;
            }
            counter++;
            y=y+80;
            if (counter%2==1){
                x=80;
            }
            else{
                x=0;
            }
        }
    }
    public void drawCircle(int x, int y, Graphics g, Color color){
        g.setColor(color);
        g.fillOval(x+10,y+10,60,60);
    }

    public void drawCheckerPiece(Graphics g, Color color, int x, int y){
        for(int j=0; j <2; j++) {
            for (int i = 0; i < 4; i++) {
                drawCircle(x, y, g, color);
                x = x + 160;
            }
            y=y+80;
            x=80;
        }
    }

    public void moveCheckerPiece(){

    }
}

