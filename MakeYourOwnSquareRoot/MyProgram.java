public class MyProgram extends ConsoleProgram
{

    public void run()
    {
        System.out.println(squareRoot(7));
        System.out.println(squareRoot(15));
        //System.out.println(squareRoot(16));
        //System.out.println(squareRoot(25));
        //System.out.println(squareRoot(36));
        //System.out.println(squareRoot(49));
        //System.out.println(squareRoot(64));
        //System.out.println(squareRoot(81));
        //System.out.println(squareRoot(100));
        //System.out.println(squareRoot(121));
        //System.out.println(squareRoot(144));
        //System.out.println(squareRoot(7));
    }
    
    public static double squareRoot(double n)
    {
        double i = n/2;
        int times = 0;
        while((i*i)-n> 0.000000000000000000000000001)
        { 
            i = (i +n/i)/2;
            //System.out.println(i);
            times++;
            if(times>= 100){
                return i;
            }
        }
        return i;
    }
}
