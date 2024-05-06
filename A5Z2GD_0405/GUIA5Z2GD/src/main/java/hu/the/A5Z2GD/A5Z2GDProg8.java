package hu.the.A5Z2GD;

import javax.swing.*;
import java.awt.*;
import static java.awt.Color.yellow;
import javax.swing.JComponent;

class ShapeDrawing extends JComponent
    {
    public void paint(Graphics g)
        {
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.YELLOW);
        g2.fillRect(0, 0, 600, 400);
        
        g2.setColor(Color.RED);
        g2.drawRect(10, 10, 80, 80);
        g2.fillRect(10, 10, 80, 80);
        
        g2.setColor(Color.MAGENTA);
        g2.drawRect(160, 10, 80, 80);
        g2.fillRect(160, 10, 80, 80);
        
        g2.setColor(Color.CYAN);
        g2.drawRect(310, 10, 80, 80);
        g2.fillRect(310, 10, 80, 80);
        }
    }
public class A5Z2GDProg8 extends JFrame
    {
    A5Z2GDProg8()
        {
        setSize(600, 400);
        setTitle("A5Z2GD - Színek");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        getContentPane().add(new ShapeDrawing ());
        setVisible(true);  
        }
    public static void main(String[] args)
        {
        new A5Z2GDProg8();
        }
    }