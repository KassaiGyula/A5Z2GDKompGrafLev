package hu.the.A5Z2GD;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class A5Z2GDProg9 implements ItemListener
    {
    JCheckBox kp,kn;
    JLabel felirat;
    JTextField bevitel;
    JButton gomb;
    Color piros;
    Color kek;
    
    A5Z2GDProg9()
        {
        Frame keret= new Frame("A5Z2GDProg9");
        keret.setSize(300,250);
        keret.setVisible(true);
        keret.setLayout(null);
        
        gomb = new JButton("Törlés");
        felirat = new JLabel("Szöveg");
        bevitel = new JTextField("Beviteli mező");
        kp = new JCheckBox("Kék/Piros");
        kn = new JCheckBox("Kisbetű/Nagybetű");
        
        felirat.setBounds(0, 70, 60, 20);
        bevitel.setBounds(55, 70, 150, 20);
        gomb.setBounds(210, 70, 80, 20);
        kp.setBounds(0, 100, 100, 20);
        kn.setBounds(100, 100, 200, 20);
        piros=new Color(255,0,0);
        kek = new Color(0, 0, 255);
        
        keret.add(felirat);
        keret.add(bevitel);
        keret.add(gomb);
        keret.add(kp);
        keret.add(kn);
        
        kp.addItemListener(this);
        kn.addItemListener(this);
        gomb.addActionListener(x-> bevitel.setText(""));

    }
    public void itemStateChanged(ItemEvent e)
        {
        if(e.getSource()==kp)
            {
            if (e.getStateChange()==1)
                {
                bevitel.setForeground(kek);
                }
            else
                {
                bevitel.setForeground(piros);
                }
            }
        if(e.getSource()==kn)
            {
            if (e.getStateChange()==1)
                {
                bevitel.setText(bevitel.getText().toUpperCase());
                }
            else
                {
                bevitel.setText(bevitel.getText().toLowerCase());
                }
            }
        }
public static void main(String args[])
{
    new A5Z2GDProg9();
}
}