public class MyProgram extends ConsoleProgram
{

    public void run()
    {
        int [] [] sampleData = {
                                {0,0,10,0,0},
                                {15,0,0,0,0},
                                {0,20,0,30,0},
                                {0,0,0,0,40}
                                };
        for (int i = 0; i < sampleData.length; i++)
        {
           System.out.print(sampleData[i]+ " ");
        }
        System.out.println("");
        for (int i = 0; i < sampleData.length ; i++)
        {
            System.out.print(sampleData [i] [0] +  " ");
        }
    }
}
