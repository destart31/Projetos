package JAVA.circle;

import javax.swing.JFrame;
public class Ovaltest{
        public static void main(String[] args) {
        Circle ovalPanel = new Circle();
        JFrame newFrame = new JFrame();

        newFrame.add(ovalPanel);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setSize( 600 ,600);
        newFrame.setVisible(true);
    }
}