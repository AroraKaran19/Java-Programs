// 23. Write a Java program that draws different color shapes on an applet.
//     set the foreground & background color as red & blue.

import java.awt.Color; 
import java.awt.Graphics; 
import javax.swing.*;

public class sColorShapes extends JPanel { 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Shapes"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(400, 400);
        frame.add(new sColorShapes()); frame.setVisible(true);
    }

    protected void paintComponent(Graphics g) { 
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);
        g.fillOval(200, 50, 100, 100);
        g.setColor(Color.BLUE);
        int[] xPoints = {300, 350, 250};
        int[] yPoints = {200, 250, 250};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
