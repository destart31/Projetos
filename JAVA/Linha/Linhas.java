package JAVA.Linha;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Linhas extends JPanel{
    public void init() {
        setBackground(Color.WHITE); 
    }
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        int x = 0;
        
        while (x <= 400){
            g.drawLine(200, 200, x, 0);

            x = x + 50;
        }
            int y = 0;
            while (y <= 400) {
            g.drawLine (200, 200, 0, y);
            y = y + 50;
            }
                int x1 = 0;
                while (x1 <= 400) {
                g.drawLine (200, 200, x1, 400);
                x1 = x1 + 50;
                }
                    int y1 = 0;
                    while (y1 <= 400) {
                    g.drawLine (200, 200, 400, y1);
                    y1 = y1 + 50;
                    }
    }   
}

