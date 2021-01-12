package Checkers;

import java.awt.*;

public class Checker_Pieces {

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

}
