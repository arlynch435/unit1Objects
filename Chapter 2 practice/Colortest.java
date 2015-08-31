import java.awt.Color;
import javax.swing.JFrame;
public class Colortest
{
    public static void main(String[] args)
    {
        JFrame frame =new JFrame();
        frame.setSize(200,200);
        Color mycolor= new Color(50,100,150);
        mycolor.brighter();
        frame.getContentPane().setBackground(mycolor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}