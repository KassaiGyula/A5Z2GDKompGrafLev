package hu.the.A5Z2GD;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// @author KassaiG


public class A5Z2GDProg4 extends JFrame
    {
    /*JLabel felirat1;
    JLabel felirat2;*/
    A5Z2GDProg4()
        {
        JFrame keret = new JFrame();
        keret.setSize(640,480);
        keret.setVisible(true);
        keret.setLayout(null);
        
        
        JButton gmb = new JButton("Kilépés");
        gmb.setBounds(270, 230, 100, 20);
        gmb.addActionListener(x -> keret.dispose());
        keret.add(gmb);
        
        /*felirat1 = new JLabel("Program terevző informatikus, PTI");
        felirat2 = new JLabel("Program terevző informatikus, 2024");
        felirat1.setBounds(50,100,300,50);
        felirat2.setBounds(50,120,300,50);
        add(felirat1);
        add(felirat2);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(400, 300);
        //pack();
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        }
    public static void main(String[] args)
        {
        //System.out.println("Hello World!");  
        new A5Z2GDProg4();
        }
    }
