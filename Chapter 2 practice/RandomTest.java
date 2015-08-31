import java.util.Random;
public class RandomTest
{
    public static void main(String[] args)
    {
        Random generator= new Random();
        int hello=generator.nextInt(6)+1;
        System.out.println(hello);
    }
}