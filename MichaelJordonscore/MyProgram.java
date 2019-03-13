import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyProgram extends ConsoleProgram
{   
    static int[] points91;
    static int[] points98;

    public static void processData()
	{
	    
	    System.out.println(firstQuestion());
	    System.out.println(secondQuestion());
	    System.out.println(thirdQuestion());
	    System.out.println(fourthQuestion());
	    System.out.println(fifthQuestion());
	}
	
	public static double firstQuestion()
    {   
        int total = 0;
        for(int i = 0; i < points91.length ; i++)
        {
            total = total + points91[i];
        }

        return (double) total/points91.length;
    }
    
    public static int secondQuestion()
    {   
        int highest = 0;
        for(int i = 0; i < points91.length ; i++)
        {
            if(highest <= points91[i])
            {
                highest = points91[i];
            }
        }
        return highest;
    }
    
    public static int thirdQuestion()
    {
        return points98.length;
    }
    
    public static int fourthQuestion()
    {
        int total = 0;
        for(int i = 0; i < points91.length ; i++)
        {
            total = total + points91[i] + points98[i];
        }
        return total;
    }
    
    public static int fifthQuestion()
    {
        int lowest = points98[0];
        for(int i = 0; i < points98.length ; i++)
        {
            if(lowest >= points98[i])
            {
                lowest = points98[i];
            }
        }
        return lowest;
    }
    
    
	
    public static void main(String[] args) 
	{
		points91 = getPointsData("9091PointsInEachGame.txt");
		points98 = getPointsData("9798PointsInEachGame.txt");
		
		processData();
	}
	

    public static int[] getPointsData(String fileName)
	{
		try 
		{
			Scanner fileInput = new Scanner(new File(fileName));
			
			//Read in the number of games
			int numGames = fileInput.nextInt();
			
			//Create the array with the correct size
			int[] pointsData = new int[numGames];
			
			//Fill the array with the points data
			for (int i = 0; i < numGames; i++)
			{
				pointsData[i] = fileInput.nextInt();
			}
			
			fileInput.close();
			
			return pointsData;
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	
    public static void printPointsData(String season, int[] pointsData)
	{
		System.out.println(season + " Season Points Scored in Each Game");
		
		int gameNumber = 1;
		
		for (int points : pointsData)
		{
			System.out.println("Game " + gameNumber + ": " + points);
			gameNumber++;
		}
	}

}