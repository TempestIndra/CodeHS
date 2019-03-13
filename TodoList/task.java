import java.util.ArrayList;

public class task
{
    private String taskName;
    private int taskPriority;
    private boolean taskComplete;
    
    public task(String theTaskName, int theTaskPriority)
    {
        taskName = theTaskName;
        taskPriority =  theTaskPriority;
    }
    
    public String getTaskname()
	{
		return taskName;
	}
	
	public void setTaskname(String newTaskname)
	{
		newTaskname = taskName;
	}

	public int getTaskPriority() 
	{
		return taskPriority;
	}

	public void setTaskPriorityy(int newTaskPriority) 
	{
		taskPriority = newTaskPriority;
	}
}
	
