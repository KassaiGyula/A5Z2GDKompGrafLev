package hu.the.A5Z2GD;

import javax.swing.JFrame;
import javax.swing.JLabel;

// @author KassaiG


public class A5Z2GDProg3 extends JFrame
    {
    JLabel felirat1;
    JLabel felirat2;
    A5Z2GDProg3()
        {
        felirat1 = new JLabel("Program terevző informatikus, PTI");
        felirat2 = new JLabel("Program terevző informatikus, 2024");
        felirat1.setBounds(60,100,400,20);
        felirat2.setBounds(60,120,400,20);
        add(felirat1);
        add(felirat2);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(400, 300);
        //pack();
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    public static void main(String[] args)
        {
        //System.out.println("Hello World!");  
        new A5Z2GDProg3();
        }
    }
