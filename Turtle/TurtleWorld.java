import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.ORANGE);
        turtle.penDown();
        turtle.turn(60);
        turtle.forward(50);
        turtle.turn(60);
        turtle.forward(87);
        turtle.turn(150);
       turtle.forward(100);
    }
}
