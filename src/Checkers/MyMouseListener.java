package Checkers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListener extends MouseAdapter{
    @Override

    public void mouseClicked(MouseEvent event) {
        System.out.println(event.getComponent());
    }
}
