package hu.the.A5Z2GD;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class A5Z2GD_Kepek extends JPanel
    {
    private BufferedImage image;

    public A5Z2GD_Kepek()
        {
        try
            {
            image = ImageIO.read(new File("the.PNG"));
            }
        catch (IOException e)
            {
            e.printStackTrace();
            }
        }

    @Override
    protected void paintComponent(Graphics g)
        {
        super.paintComponent(g);
        
        if (image != null)
            {
            int eredetiszel = image.getWidth();
            int eredetimag = image.getHeight();

            int szel25 = eredetiszel / 4;
            int mag25 = eredetimag / 4;
            g.drawImage(image, 10, 10, szel25, mag25, this);
            g.setColor(Color.BLACK);
            g.drawRect(10, 10, szel25, mag25);

            int szel50 = eredetiszel / 2;
            int mag50 = eredetimag / 2;
            g.drawImage(image, 10 + szel25 +10, 10, szel50, mag50, this);
            g.setColor(Color.BLACK);
            g.drawRect(10 + szel25 +10, 10, szel50, mag50);

            int width100 = eredetiszel;
            int height100 = eredetimag;
            g.drawImage(image, 10 + szel25 + 10 + szel50 + 10, 10, width100, height100, this);
            g.setColor(Color.BLACK);
            g.drawRect(10 + szel25 + 10 + szel50 + 10, 10, width100, height100);
            }
        }

    public static void main(String[] args)
        {
        JFrame frame = new JFrame("Képek");
        frame.setSize(550, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new A5Z2GD_Kepek());
        frame.setVisible(true);
        }
    }