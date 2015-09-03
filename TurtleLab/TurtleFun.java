import java.awt.Color;
import java.util.Random;

public class TurtleFun
{
  public static void main(String[] args)
  {
      World turtleworld= new World();
      Turtle blu= new Turtle(turtleworld);
      Turtle omega= new Turtle(turtleworld);
      blu.setPenColor(Color.BLUE);
      omega.setPenColor(Color.RED);
      blu.penDown();
      omega.penUp();
      omega.forward(100);
      omega.turn(270);
      omega.forward(42);
      omega.turn(90);
      omega.penDown();
      omega.turn(45);
      int distance=200;
      while (distance>0) {
          blu.forward(distance);
          omega.forward(distance);
          blu.turn(90);
          omega.turn(90);
          blu.forward(distance);
          omega.forward(distance);
          blu.turn(90);
          omega.turn(90);
          blu.forward(distance);
          omega.forward(distance);
          blu.turn(90);
          omega.turn(90);
          blu.forward(distance);
          omega.forward(distance);
          blu.turn(90);
          omega.turn(90);
          distance=distance-1;
        }
       omega.turn(360-45);
       blu.penUp();
       blu.setPenColor(Color.MAGENTA);
       omega.setPenColor(Color.MAGENTA);
       omega.penUp();
       omega.turn(90);
       blu.forward(80);
       omega.forward(175);
       blu.turn(90);
       blu.forward(155);
       blu.penDown();
       omega.penDown();
      int stuff=0;
      while (stuff<100)     {
          blu.turn(225);
          omega.turn(0-225);
          blu.forward(100);
          omega.forward(100);
          stuff+=1;
        } 
    }
}
