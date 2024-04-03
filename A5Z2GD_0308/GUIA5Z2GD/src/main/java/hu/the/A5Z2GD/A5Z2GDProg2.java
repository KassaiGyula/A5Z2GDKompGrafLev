package hu.the.A5Z2GD;

import javax.swing.JFrame;
import javax.swing.JLabel;

// @author KassaiG


public class A5Z2GDProg2 extends JFrame
    {
    JLabel felirat;
    A5Z2GDProg2()
        {
        felirat = new JLabel("Program terevző informatikus, BSC");
        add(felirat);
        //setSize(400, 300);
        pack();
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    public static void main(String[] args)
        {
        //System.out.println("Hello World!");  
        new A5Z2GDProg2();
        }
    }
