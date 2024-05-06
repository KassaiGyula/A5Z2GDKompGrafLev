package hu.the.A5Z2GD;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


// @author KassaiG


public class A5Z2GDProg7 extends JFrame
    {
    JLabel felirat1;
    JLabel felirat2;
    JLabel felirat3;

    A5Z2GDProg7()
        {
        felirat1 = new JLabel("Program terevző informatikus, 2024");
        felirat2 = new JLabel("Program terevző informatikus, 2024");
        felirat3 = new JLabel("Program terevző informatikus, 2024");
        felirat1.setBounds(6,10,500,30);
        felirat2.setBounds(6,40,500,30);
        felirat3.setBounds(6,70,500,30);
        felirat1.setForeground(Color.blue);
        felirat2.setForeground(Color.black);
        felirat3.setForeground(Color.red);
        felirat1.setFont(felirat1.getFont().deriveFont(Font.ITALIC, 24f));
        felirat2.setFont(felirat1.getFont().deriveFont(Font.BOLD, 18f));
        felirat3.setFont(felirat1.getFont().deriveFont(Font.ITALIC, 15f));
        
        add(felirat1);
        add(felirat2);
        add(felirat3);
        
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(500, 200);
        //pack();
        setVisible(true);
        setTitle("Kassai");
        getContentPane().setLayout(new FlowLayout());//specify a layout manager
        getContentPane().setBackground(Color.yellow);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    public static void main(String[] args)
        {
        //System.out.println("Hello World!");  
        new A5Z2GDProg7();
        }
    }
