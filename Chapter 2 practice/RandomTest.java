import java.util.Random;
public class RandomTest
{
    public static void main(String[] args)
    {
        // option A
        Random generator= new Random();
        int hello=generator.nextInt(6)+1;
        System.out.println(hello);
        // option B
        double goodbye=Math.random(); // returns a double number between 0 and 1
        goodbye*=6; // range [0,6)
        goodbye+=1; // range[1,7)
        System.out.println((int)goodbye);//prints 1-6
    }
}