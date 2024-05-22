package hu.the.A5Z2GD;

import java.awt.*;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

    public class A5Z2GDProg10_2
        {
        JFrame keret;
        DefaultListModel<String> l1sta;
        JList<String> list;
        Color szürke;

        A5Z2GDProg10_2()
            {
            keret= new JFrame("BSC");
            keret.setSize(220,150);
            keret.setVisible(true);
            keret.setLayout(null);
            
            szürke = new Color(200,200,200);

            l1sta = new DefaultListModel<>();  
            l1sta.addElement("Programtervező informatikus:");  
            l1sta.addElement("Antal Béla");  
            l1sta.addElement("Kassai Gyula");  
            l1sta.addElement("Mátyás Tibor");

            list = new JList<>(l1sta);  
            list.setBounds(0, 0, 220, 150);
            list.setBackground(szürke);
            
            keret.add(list);
            }
    public static void main(String args[])
    {
        new A5Z2GDProg10_2();
    }
}