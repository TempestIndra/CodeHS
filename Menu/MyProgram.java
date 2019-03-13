public class MyProgram extends ConsoleProgram
{
    private String[] menu= {"Nachos price is 2.0","Taco price is 1.5", "Burrito price is 3.0"};
    private double[] price= {2,1.5,3};
    private String order = "";
    private double cost = 0;
    
    public void run()
    {
        //boolean stop = false;
        boolean thatAll = false;
            while(thatAll == false)
            {
                for(int i = 0 ; i < 3 ; i++)
                {
                    System.out.println(menu[i]);
                }
                String input = readLine("what do you want ");
                if(input.equals("Nachos")) cost += price[0];
                if(input.equals("Taco")) cost += price[1];
                if(input.equals("Burrito")) cost += price[2];
                System.out.println("Ok you got " + input);
                order = order + input + ", " ;
                String con = readLine("is that All");
                if(con.equals("that all"))
                {
                    thatAll = true;
                }
            }
        System.out.println("ok you order" + order);
        System.out.println("Your total is " + cost);
    }
}
