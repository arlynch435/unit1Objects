import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Practice2
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation= new URL("https://upload.wikimedia.org/wikipedia/commons/0/07/Giraffe08_-_melbourne_zoo.jpg");
        JOptionPane.showMessageDialog(null,"Wassup Yo","Boring Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        }
    }