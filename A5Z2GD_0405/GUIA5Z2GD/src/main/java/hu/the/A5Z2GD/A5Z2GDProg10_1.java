package hu.the.A5Z2GD;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class A5Z2GDProg10_1 implements ItemListener
    {
    JLabel felirat;
    JTextField bevitel;
    JButton gomb;
    Color red;
    Color blue;
    JRadioButton piros;
    JRadioButton kek;
    JRadioButton nagy;
    JRadioButton kicsi;
    ButtonGroup szin;
    ButtonGroup meret;
    
    A5Z2GDProg10_1()
        {
        JFrame keret= new JFrame("A5Z2GDProg10");
        keret.setSize(300,250);
        keret.setVisible(true);
        keret.setLayout(null);
        
        gomb = new JButton("Törlés");
        felirat = new JLabel("Szöveg");
        bevitel = new JTextField("Beviteli mező");
        piros = new JRadioButton("Piros");
        kek = new JRadioButton("Kék");
        nagy = new JRadioButton("Nagybetű");
        kicsi = new JRadioButton("Kisbetű");
        szin = new ButtonGroup();
        meret = new ButtonGroup();
        
        felirat.setBounds(0, 0, 60, 20);
        bevitel.setBounds(55, 0, 150, 20);
        gomb.setBounds(210, 0, 80, 20);
        piros.setBounds(0, 30, 50, 20);
        kek.setBounds(50, 30, 50, 20);
        nagy.setBounds(100, 30, 80, 20);
        kicsi.setBounds(180, 30, 80, 20);
        red=new Color(255,0,0);
        blue = new Color(0, 0, 255);
        
        szin.add(piros); 
        szin.add(kek);
        meret.add(nagy);
        meret.add(kicsi);
        
        keret.add(felirat);
        keret.add(bevitel);
        keret.add(gomb);
        keret.add(piros);
        keret.add(kek);
        keret.add(nagy);
        keret.add(kicsi);
        
        piros.addItemListener(this);
        kek.addItemListener(this);
        nagy.addItemListener(this);
        kicsi.addItemListener(this);        
        gomb.addActionListener(x-> bevitel.setText(""));

    }
    public void itemStateChanged(ItemEvent e)
        {
        if(e.getSource()==piros)
            {
            bevitel.setForeground(red);
            }
        if(e.getSource()==kek)
            {
            bevitel.setForeground(blue);
            }
        if(e.getSource()==nagy)
            {
            bevitel.setText(bevitel.getText().toUpperCase());
            }
        if(e.getSource()==kicsi)
            {
            bevitel.setText(bevitel.getText().toLowerCase());
            }
        }
public static void main(String args[])
{
    new A5Z2GDProg10_1();
}
}