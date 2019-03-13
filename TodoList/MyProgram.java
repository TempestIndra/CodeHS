import java.util.ArrayList;


public class MyProgram extends ConsoleProgram
{

    public void run()
    {
        String name = readLine("Hello there what is your name :");
        clear();
        if(name.equals(""))
        {
            name = "To-Do List";    
        }
        else
        {
            name = name + "'s To-Do List";
        }
        System.out.println(name);
        TodoList myList = new TodoList(name);
        boolean stop = false;
		while (!stop)
		{
			System.out.println("Choose an option (by #)");
			showOptions();
			int choice = readInt("Please enter your choice.");
			System.out.println();

			if (choice == 1)
			{   
			    int level = 0;
			    String TodoList = readLine("Enter what you want to put in the Todo list :");
				int taskPriority = 0;
				level = readInt("Set task Priority : ");
				myList.addTask(new task(TodoList, level));
				clear();
				myList.displayTodoList();
			}
			else if (choice == 2) 
			{
			    if (myList.length() == 0)
				{
					System.out.println("There are no tasks in your list");
				}
				else
				{
					System.out.println("Which task do you want to mark complete?");
					int taskID = readInt("Enter the number :");
					if (!myList.markComplete(taskID))
					{
						System.out.println("Invalid Choice");
					}
				}
				clear();
				myList.displayTodoList();
			}
			else if (choice == 3)
			{
			    if (myList.length() == 0)
				{
					System.out.println("There are no tasks in your list");
				}
				else
				{
				    myList.sort();
				    //need to be fix
				}
				clear();
				myList.displayTodoList();
			}
			else if (choice == 4)
			{
			     stop = true;
			}
			else
			{
			    System.out.println("You did not select a valid option");
			}
		}
		clear();
		System.out.println("HAVE A NICE DAY!!!");
    }
    
    private void clear()
    {
        for(int i = 0; i < 50 ; i++)
            System.out.println("");
    }
    
    public void showOptions() 
    {
        System.out.println("#1: Add New Task");
        System.out.println("#2: Mark Complete");
        System.out.println("#3: Sort list base on priority");
        System.out.println("#4: Quit");
    }
}