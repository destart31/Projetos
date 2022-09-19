package JAVA.circle;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;



public class Circle extends JPanel {
            public void init() {
            setBackground(Color.WHITE);           
        }
            public void paint(Graphics g) {
            g.setColor(Color.BLACK);
            int x = 25;
            int y = 50;

            for(int i = 0; i < 10; i++){
                g.drawOval(250-(i*x),250-(i*x),(i+1)*y,(i+1)*y);
            }
    }
}
