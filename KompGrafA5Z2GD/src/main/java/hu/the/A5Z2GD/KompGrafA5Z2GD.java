package hu.the.A5Z2GD;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class KompGrafA5Z2GD extends JPanel
    {
    private BufferedImage image1;
    private BufferedImage image2;

    public KompGrafA5Z2GD()
        {
        try
            {
            image1 = ImageIO.read(new File("Bill.jpeg"));
            }
        catch (IOException e)
            {
            e.printStackTrace();
            }
        
        try
            {
            image2 = ImageIO.read(new File("BillKesz.jpeg"));
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
                
        if (image1 != null)
            {
            int eredetiszel = image1.getWidth();
            int eredetimag = image1.getHeight();
            int szel = eredetiszel / 5;
            int mag = eredetimag / 5;
            
            g.drawImage(image1, 5, 5, szel, mag, this);
            g.setColor(Color.black);
            g.drawRect(5, 5, szel, mag);
            
            eredetiszel = image1.getWidth();
            eredetimag = image1.getHeight();
            szel = eredetiszel / 20;
            mag = eredetimag / 20;
            
            g.drawImage(image2, 5, 5, szel, mag, this);
            g.setColor(Color.white);
            g.drawRect(5, 5, szel, mag);
            }
                   
        g.setColor(Color.white);
        g.fillRect(150, 27, 120, 40);
        for (int i=0; i <=4; i++)
            {
            g.drawLine(130, 47 + i, 150, 47 + i);
            }
        Font myFont = new Font ("Courier New", 1, 18);
        g.setColor(Color.black);
        g.setFont (myFont);
        g.drawString("Elkészülve", 155, 54);
        
        g.setColor(Color.cyan);
        int helyX = 350;
        int helyY = 100;
        
        for (int i=0; i <=5; i++)
            {
            g.drawOval(helyX - i / 2, helyY - i / 2, 60 + i, 60 + i);
            }
           
        for (int i=0; i <=4; i++)
            {
            g.drawLine(378 + i, 160, 378 + i, 180);
            }
         
        for (int i=0; i <=4; i++)
            {
            g.drawRect(245 - i / 2, 180 - i / 2, 250 + i, 30 + i);
            }
            
        g.setColor(Color.cyan);
        helyX = 50;
        helyY = 220;
          
        for (int i=0; i <=5; i++)
            {
            g.drawOval(helyX - i / 2, helyY - i / 2, 30 + i, 30 + i);
            }
           
        for (int i=0; i <=4; i++)
            {
            g.drawLine(63 + i, 250, 63 + i, 280);
            }
         
        for (int i=0; i <=4; i++)
            {
            g.drawRect(10 - i / 2, 280 - i / 2, 150 + i, 50 + i);
            }
        
        helyX = 250;
        helyY = 200;
        myFont = new Font ("Courier New", 1, 27);
        g.setColor(Color.white);
        g.setFont (myFont);
        g.drawString("Kivezetés helye", helyX, helyY);
           
        helyX = 15;
        helyY = 290;
        myFont = new Font ("Courier New", 1, 10);
        g.setFont (myFont);
        g.drawString("Blue switch-ek mátrixa", helyX, helyY);
        g.drawString("Vízszintesen bemenet", helyX, helyY + 10);
        g.drawString("Függőlegesen kiemenet", helyX, helyY + 20);
        g.drawString("SBC kapcsolattal", helyX, helyY + 30);


        }

    public static void main(String[] args)
        {
        JFrame frame = new JFrame("DIY Mechanikus Billentyűzet");
        frame.setSize(550, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new KompGrafA5Z2GD());
        frame.setVisible(true);
        }
    }