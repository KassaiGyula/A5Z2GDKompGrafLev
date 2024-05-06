package hu.the.A5Z2GD;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// @author KassaiG


public class A5Z2GDProg5 extends JFrame
    {
    /*JLabel felirat1;
    JLabel felirat2;*/
    A5Z2GDProg5()
        {
        JFrame keret = new JFrame();
        keret.setSize(640,480);
        keret.setVisible(true);
        keret.setLayout(null);
        
        
        JButton gmb1 = new JButton("Kilépés");
        gmb1.setBounds(270, 30, 100, 20);
        gmb1.addActionListener(x -> keret.dispose());
        keret.add(gmb1);
        
        JButton gmb2 = new JButton("Változtat");
        gmb2.setBounds(270, 50, 100, 20);
        gmb2.addActionListener(x -> keret.setTitle("Működik"));
        keret.add(gmb2);
        
        JButton gmb3 = new JButton("Vissza");
        gmb3.setBounds(270, 70, 100, 20);
        gmb3.addActionListener(x -> keret.setTitle("Előző"));
        keret.add(gmb3);
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
        new A5Z2GDProg5();
        }
    }
