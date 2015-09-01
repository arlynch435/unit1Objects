import java.awt.Color;

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
       blu.forward(50);
       omega.forward(150);
       blu.turn(90);
       omega.turn(90);
    }
}
