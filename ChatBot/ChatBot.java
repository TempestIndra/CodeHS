
/**
 * 
 * This class was adapted from the Magpie project from Laurie White
 *
 */

public class ChatBot 
{
	/**
	 * The ChatBot's name
	 */
	private String myName;
	
	/**
	 * Construct a new ChatBot with the given name
	 * 
	 * @param name
	 * 			the name of this ChatBot
	 */
	public ChatBot(String name)
	{
		myName = name;
	}
	
	/**
	 * @return the ChatBot's name
	 */
	public String getName()
	{
		return myName;
	}
	
	/**
	 * Get a greeting to start the conversation
	 * 
	 * @return a greeting
	 */
	public String getGreeting() 
	{
		return "Hi, my name is " + myName + ".";
	}
	
	/**
	 * Gives a response to a statement received during the conversation
	 * This method should be overrided in sublcasses of ChatBot
	 * 
	 * @param statement
	 *            the statement received
	 * @return a response based on the rules given
	 */
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
	
	/**
	 * Pick a random response to use if nothing else fits.
	 * There should be various options for this so things
	 * don't get too repetitive.
	 * 
	 * @return a non-committal string
	 */
	public String getRandomResponse() {
	    if (Math.random() * 2 < 1) {
	        return "Umm";
	    }
	    else {
	        return "Interesting, tell me more.";
	    }
		
	}
	
	/**
	 * Get a closing remark to end the conversation
	 * 
	 * @return a valediction
	 */
	public String getValediction() {
		return "Bye";
	}
	
	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no").
	 *
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @param startPos
	 *            the character of the string to begin the
	 *            search at
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
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

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	protected int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}
	
	/**
	 * Take a statement with "I want to <something>." and transform it into 
	 * "Why do you want to <something>?"
	 * @param statement the user statement, assumed to contain "I want to"
	 * @return the transformed statement
	 */
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
	
	/**
	 * Take a statement with "you <something> me" and transform it into 
	 * "What makes you think that I <something> you?"
	 * @param statement the user statement, assumed to contain "you" followed by "me"
	 * @return the transformed statement
	 */
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
}
