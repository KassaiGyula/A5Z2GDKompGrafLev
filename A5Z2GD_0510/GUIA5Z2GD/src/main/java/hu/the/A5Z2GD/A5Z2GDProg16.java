package hu.the.A5Z2GD;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class A5Z2GDProg16 extends JPanel
    {
    @Override
    protected void paintComponent(Graphics g) 
        {
        super.paintComponent(g);
        
        g.setColor(Color.RED);
        g.fillOval(10, 10, 40, 60);
        g.fillOval(80, 10, 60, 40);
        g.fillOval(160, 10, 50, 50);

        g.setColor(Color.RED);
        g.fillArc(10, 80, 50, 50, 0, 90);
        g.fillArc(70, 80, 50, 50, 90, 90);
        g.fillArc(130, 80, 50, 50, 180, 72);
        g.fillArc(150, 80, 50, 50, 270, 72);

        int kozepex = 20;
        int kozepey = 150;
        int atmero = 30;
        int szirmok = 12;
        int szog = 360 / szirmok;

        for (int i = 0; i < szirmok; i++) 
            {
            g.setColor(Color.RED);
            g.fillArc(kozepex, kozepey, atmero * 2, atmero * 2, i * szog, szog / 2);
            }
        
        int mX = 100;
        int mY = 150;
        int szeles = 30;
        int magas = 60;

        for (int i = 0; i < szirmok; i++)
            {
            g.setColor(Color.RED);
            g.fillArc(mX, mY, szeles, magas, i * szog, szog / 2);
            }
        
        int atmer = 20;
        int kozepX = 160;
        int kozepY = 160;
        int felszog = 180 / szirmok;
        
        for (int i = 0; i < szirmok; i++) 
            {
            g.setColor(Color.RED);
            g.fillArc(kozepX, kozepY, atmer * 2, atmer * 2, i * felszog, felszog / 2);
            }
        }

    public static void main(String[] args)
        {
        JFrame keret;
        keret = new JFrame();
        keret.setSize(300, 250);
        keret.setTitle("A5Z2GD - Formák");
        keret.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keret.add(new A5Z2GDProg16());
        keret.setVisible(true);
        }
    }