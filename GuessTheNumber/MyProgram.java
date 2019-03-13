import java.util.Random;
public class MyProgram extends ConsoleProgram
{

    public void run()
    {
        
        System.out.println("Let's Play " + (char)34 + "Guess the Number" + (char)34 + "!");
        System.out.println("They mystery number is between 1 and  10.");
        GuessTime();
    }
    public void GuessTime()
    {
        
        Random rand = new Random();
        int myNum = rand.nextInt(10) + 1;
        boolean Answer = false;
        int Times = 0;
        while(!(Answer))
        {
            System.out.println("Take a Guess:");
            int Input = readInt("");
            if(Input == myNum)
            {
                System.out.println("You got it!");
                Times++;
                Answer = true;
            }
            else if(Input > myNum)
            {
                System.out.println("Too High");
                Times++;
            }
            else
            {
                System.out.println("Too low");
                Times++;
            }
        }
        System.out.println("It tool you " + Times + " guesses.");
        if(Times == 1)
        {
            System.out.println("Lucky You");    
        }
        else if(Times == 2 || Times == 3)
        {
            System.out.println("Well Done!");
        }
        else if (Times == 4)
        {
            System.out.println("Not bad.");
        }
        else
        {
            System.out.println("You need to reconsider your strategy");
        }
        
    }
    
    
}


