import javax.swing.*;
import java.awt.*;
import javax.swing.JComponent;class ShapeDrawing extends JComponent {
  
    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(100, 150, 60, 200);
        g2.drawOval(185, 235, 80, 220);
    }
}public class A5Z2GDProg8 {    public static void main(String[] args) {
        JFrame frame = new JFrame("My first JFrame");
        frame.setSize(600, 600);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.getContentPane().add(new ShapeDrawing ());
        frame.setVisible(true);  
    }
    
}