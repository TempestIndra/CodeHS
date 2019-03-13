public class bank
{
    private Customer[] customers;
    private int Index;
    private int totalCustomer;
    
    public bank(int totalCustomer)
    {
        customers = new Customer[totalCustomer];
        Index = 0;
        totalCustomer = 0;
    }
    
    public void addCustomer(Customer s)
    {
        customers[Index] = s;
        Index++;
        totalCustomer++;
    }
    
    public void printAllcustomer()
    {
        System.out.println("All customer");
        for(int i = 0; i < totalCustomer; i++)
        {
            System.out.println((i+1) + " " + customers[i]);
        }
    }
    
    public String getCustomerPass(int index)
    {
        return customers[index].getPass();
    }
    
    public String getCustomerfName(int index)
    {
        return customers[index].getFname();
    }
    
     public String getCustomerlName(int index)
    {
        return customers[index].getLname();
    }
}
