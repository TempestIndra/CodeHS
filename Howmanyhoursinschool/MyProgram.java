public class MyProgram extends ConsoleProgram
{
    public void run()
    {
        
        System.out.println(inSchool("Monday",false));
        System.out.println(inSchool("Monday",true));
        System.out.println(inSchool("Tuesday",false));
        System.out.println(inSchool("Tuesday",true));
        System.out.println(inSchool("Wednesday",false));
        System.out.println(inSchool("Wednesday",true));
        System.out.println(inSchool("Thursday",false));
        System.out.println(inSchool("Thursday",true));
        System.out.println(inSchool("Friday",false));
        System.out.println(inSchool("Friday",true));
        System.out.println(inSchool("Saturday",false));
        System.out.println(inSchool("Saturday",true));
        System.out.println(inSchool("Sunday",false));
        System.out.println(inSchool("Sunday",true));
        
        Check("Monday",false, 6);
        /*
        Check("Monday",true);
        Check("Tuesday",false);
        Check("Tuesday",true);
        Check("Wednesday",false);
        Check("Wednesday",true);
        Check("Thursday",false);
        Check("Thursday",true);
        Check("Friday",false);
        Check("Friday",true);
        Check("Saturday",false);
        Check("Saturday",true);
        Check("Sunday",false);
        Check("Sunday",true);*/
    }
    
    public int inSchool(String day, Boolean hoilday)
    {
        
        if(day.equals("Sunday")||day.equals("Saturday"))
        {
            return 0;
        }
        if(hoilday)
        {
            return 4;
        }
        return 5;
        
        
    }
    
    
    public void Check(String day, Boolean hoilday, int answer)
    {
        int Answer;
        System.out.println("Expected: inSchool(" + (char)34 + day+ (char)34 + "," + hoilday + ") -> " + answer);
        System.out.println("Your run: " + inSchool(day,hoilday));
        
        if(day.equals("Sunday")||day.equals("Saturday"))
        {
            Answer = 0;
        }
        else if(hoilday)
        {
             Answer = 4;
        }
        else
        {
            Answer = 6;
        }
        
        if(Answer == inSchool(day,hoilday))
        {
            System.out.println("correct");
        }
        else
        {
            System.out.println("incorrect");
        }
    }
 
}
