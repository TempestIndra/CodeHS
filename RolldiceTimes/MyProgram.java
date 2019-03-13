import java.util.Random;
public class MyProgram extends ConsoleProgram
{
    int count = 0;
    public void run()
    {
        Random rand = new Random();
        int myNum1 = rand.nextInt(6) + 1;
        int myNum2 = rand.nextInt(6) + 1;
        while(myNum1 != myNum2)
        {
            count++;
            myNum1 = rand.nextInt(6) + 1;
            myNum2 = rand.nextInt(6) + 1;
        }
        System.out.println(count);
    }
}