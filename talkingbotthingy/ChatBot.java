public class ChatBot 
{
	private String myName;
	
	public ChatBot(String name)
	{
		myName = name;
	}
	
	public String getName()
	{
		return myName;
	}
	
	public String getGreeting() 
	{
		return "Hello! My name is " + myName + ", what's your favorite food?";
	}
	
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.trim().length() == 0)
		{
			response = "Say something, please.";
		} 
		else if (findKeyword(statement, "Hi") >= 0)
		{
			response = "It is very nice to meet you!";
		}
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			// Respond to a "I want to <something>" statement
			response = transformIWantToStatement(statement);
		}
		else
		{
			// Look for a two word (you <something> me) pattern
			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0 && findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
		}
		return response;
	}
	
	public String getRandomResponse() {
	    if (Math.random() * 2 < 1) {
	        return "Umm";
	    }
	    else {
	        return "Interesting, tell me more.";
	    }
	}
	
	public String getValediction() {
		return "Bye";
	}
	
	protected int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		int psn = phrase.indexOf(goal, startPos);

		// Make sure the goal isn't part of a word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
			}

			// If before and after aren't letters, we've found the word
			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) 
				&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal, psn + 1);
		}

		return -1;
	}

	protected int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}
	
	private String transformIWantToStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword (statement, "I want to", 0);
		String restOfStatement = statement.substring(psn + 9).trim();
		return "Why do you want to " + restOfStatement + "?";
	}
	
    private String transformYouMeStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "What makes you think that I " + restOfStatement + " you?";
	}
	
	
	
	public void randomPause()
	{
		try 
		{
            Thread.sleep((long)(Math.random() * 2000));               
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
	}    
}
