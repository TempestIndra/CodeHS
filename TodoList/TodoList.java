import java.util.ArrayList;


public class TodoList
{
    private String toDolistName;
    private ArrayList<task> TodoList;
    private String title;
    
    public TodoList(String theTitle)
	{
	    title = theTitle;
		TodoList = new ArrayList<task>();
	}
    
    public void displayTodoList()
	{
		System.out.println();
		if (TodoList.isEmpty())
		{
			System.out.println("NOTHING IN THE LIST");
		}
		else
		{
			for (int index = 0; index < TodoList.size(); index++)
			{
				task current = TodoList.get(index);
				System.out.println("" + (index + 1) + " " + current.getTaskname() + " (" + current.getTaskPriority() + ")");
			}
		}
		System.out.println();
	}
	
	public void addTask(task newTask)
	{
		int index = 0;
		boolean indexFound = false;
		while ( index < TodoList.size() && !indexFound)
		{
		    task currentTask = TodoList.get(index);
		    
			if ( newTask.getTaskPriority() < currentTask.getTaskPriority())
			{
				index++;
			}
			else 
			{
				indexFound = true;
			}
		}
		
		TodoList.add(index,newTask);
	}
	
	public void sort()
	{
	    int tempLength = TodoList.size()/2;
	    int highestPriority = 0;
	    
        
	}
	public boolean markComplete(int id)
	{
		if (isIDValid(id))
		{
			TodoList.remove(id - 1);
			return true;
		}
		return false;
	}
	
	public task getTask(int id)
	{
		if (isIDValid(id))
		{
			return TodoList.get(id - 1);
		}
		else 
		{
			return null;
		}
		
	}
	
	public boolean isIDValid(int id)
	{
		return !TodoList.isEmpty() && id >= 1 && id <= TodoList.size();
	}
	
	
	public int length()
	{
		return TodoList.size();
	}
}
