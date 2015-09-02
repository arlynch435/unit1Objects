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
       blu.turn(180);
       omega.turn(180);
       blu.penUp();
       omega.penUp();
       blu.forward(200);
       omega.forward(300);
       blu.turn(90);
       omega.turn(90);
       blu.turn(45);
       blu.penDown();
       omega.penDown();
      Random generator= new Random();
      int  thingie=generator.nextInt(360);
      System.out.println(thingie); // remember 105,
      int stuff=0;
      while (stuff<100)     {
          blu.turn(thingie);
          omega.turn(0-thingie);
          // thingie=generator.nextInt(100);
          blu.forward(50);
          omega.forward(50);
          stuff+=1;
        }
    }
}
