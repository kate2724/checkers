package Checkers;

import javax.swing.JPanel;
import java.awt.*;

import java.awt.event.*;

public class Board extends JPanel{
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawCheckerboard(g);

        Checker_Pieces checkerPieces = new Checker_Pieces();
        checkerPieces.drawCheckerPiece(g, Color.BLACK, 0, 0);
        checkerPieces.drawCheckerPiece(g, Color.YELLOW, 0, 480);
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
    /** if mouse clicked
     * get location
     * see if a checker piece is at that location (maybe use a list/dictionary)
     * when mouse is clicked again
     * move checker piece to location of mouse click
     *
     * will implement rules later (can only move forwards diagonally, can't move into other same color pieces,
     * will take other color pieces off canvas.
     **/
    public void moveCheckerPiece(){

    }
}

