public class Customer
{
    private String firstName;
    private String lastName;
    private double balance = 0;;
    private String password;

    public Customer(String fName, String lName, String pass)
    {
        firstName = fName;
        lastName = lName;
        password = pass;
    }
    
    public void depositeMoney(double money)
    {
        balance += money;
    }
    
    public void withdraw(double money)
    {
        balance -= money;
    }
    
    public String getPass()
    {
        return password;
    }
    public String toString()
    {
        return firstName + " " + lastName;
    }
    
    public String getFname()
    {
        return firstName;
    }
    
    public String getLname()
    {
        return lastName;
    }
}
