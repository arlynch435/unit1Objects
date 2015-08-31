import java.awt.Rectangle;
public class Rectangle2
{
    public static void main(String[] args)
    {
        Rectangle box= new Rectangle(5,10,20,30);
        box.add(0,0);
        System.out.println("Original coordinates are: x=5,y=10,width=20,height=30");
        System.out.println("New coordinates are: x=0,y=0,width=20,height=30");
    }
}