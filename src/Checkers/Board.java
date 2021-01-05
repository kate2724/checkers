package Checkers;

import javax.swing.JPanel;
import java.awt.*;

public class Board extends JPanel{
//    public Board() {}
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawCheckerboard(g);
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
}
