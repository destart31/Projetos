package JAVA.Linha;

import javax.swing.JFrame;

public class LinhasTest {
    public static void main(String[] args) {     
        Linhas linhasPanel = new Linhas();
        JFrame newFrame = new JFrame();

        newFrame.add(linhasPanel);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setSize( 600 ,600);
        newFrame.setVisible(true);
    }
}
