import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        int degree=0;
        while (degree<=15) {
            turtle.forward(100);
            turtle.turn(180);
            turtle.forward(200);
            turtle.turn(180);
            turtle.forward(100);
            turtle.turn(degree);
            degree +=1;
    }
    turtle.setPenColor(Color.YELLOW);
    degree=0;
         while (degree<=15) {
            turtle.forward(100);
            turtle.turn(180);
            turtle.forward(200);
            turtle.turn(180);
            turtle.forward(100);
            turtle.turn(degree);
            degree +=1;
    }
    turtle.setPenColor(Color.GREEN);
    degree=0;
         while (degree<=15) {
            turtle.forward(100);
            turtle.turn(180);
            turtle.forward(200);
            turtle.turn(180);
            turtle.forward(100);
            turtle.turn(degree);
            degree +=1;
    }
    turtle.setPenColor(Color.ORANGE);
    degree=0;
         while (degree<=15) {
            turtle.forward(100);
            turtle.turn(180);
            turtle.forward(200);
            turtle.turn(180);
            turtle.forward(100);
            turtle.turn(degree);
            degree +=1;
    }
    turtle.setPenColor(Color.RED);
    degree=0;
         while (degree<=15) {
            turtle.forward(100);
            turtle.turn(180);
            turtle.forward(200);
            turtle.turn(180);
            turtle.forward(100);
            turtle.turn(degree);
            degree +=1;
    }
}
}
