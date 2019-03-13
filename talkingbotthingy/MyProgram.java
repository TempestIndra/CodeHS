import java.util.Random;
public class MyProgram extends ConsoleProgram
{
	
	public void run()
	{
		MyBot bot;
		
		//Add code to set bot an instance of your bot class.
		bot = new MyBot("Chuck");
		
		startChatting(bot);
	}
	
	public void startChatting(MyBot bot)
	{
		println(bot.getGreeting());
		
		String userResponse = readLine("");
		
		while (!userResponse.equals("Bye"))
		{
			String botResponse = bot.getResponse(userResponse);
			
			randomPause();
			
			if (!botResponse.equals(""))
			{
				println(botResponse);
			}
			else
			{
				println(bot.getRandomResponse());
			}
			
			userResponse = readLine("");
		}
		
		println(bot.getValediction());
	}
	
	public void randomPause()
	{
		//pause(Math.random() * 2000);
		try {
            Thread.sleep((long)(Math.random() * 2000));               
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
	}

}
