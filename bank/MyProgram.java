public class MyProgram extends ConsoleProgram
{
    private boolean stop = false;
    private int input = 0;
    private bank c = new bank(20);
    private int currentID;
    public void run()
    {
        while(!false)
        {
            showOptionsintro();
            int input = readInt("select number");
            if(input == 1) createAccount();
            else if(input == 2) loginAccount();
            else 
            {
                System.out.println("Not one of the choices");
                showOptionsintro();
            }
        }
    }
    
    public void showOptionsintro()
    {
        System.out.println("1.create account");
        System.out.println("2.login to account");
        System.out.println("3.delete the account");
        
    }
    public void createAccount()
    {
        String fName = readLine("What is your firstname");
        String LName = readLine("What is your lastname");
        String Pass = readLine("What is your Password"); 
        Customer fname = new Customer(fName, LName, Pass);
        c.addCustomer(fname);
    }
    public void loginAccount()
    {
        c.printAllcustomer();
        int user = readInt("select number of Who you want to sign in?");
        String ePass = readLine("enter the password");
        currentID = user - 1;
        if(c.getCustomerPass(currentID).equals(ePass))
        {
            System.out.println("correct password");
            System.out.println("Welcome" + c.getCustomerfName(currentID) + c.getCustomerlName(currentID));
        }
    }
    
    
}
