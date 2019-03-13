import java.util.Random;
public class MyBot extends ChatBot
{
    private String[] genres = {"Electro","House","Trap","Instrumental","Pop","Inspirational","Rap","R&B"};
	private String[] electroSong = {"Faded","The Turnaround","Soul"};
	private String[] electroArtist = {"Alan Walker","Gemini","CloZee X VOLO"};
	private String[] houseSong = {"Sing me to sleep","Flip The Funk","Nobody"};
	private String[] houseArtist = {"Alan Walker","Loge21","DEVI"};
	private String[] trapSong = {"Dreams","Magnasanti","Superstar"};
	private String[] trapArtist = {"Prismo","Samual James","Pegboard Nerds & NGHT"};
	private String[] instrumentalSong = {"Unravel","Radioactive","Guren no Yumiya OP"};
	private String[] instrumentalArtist = {"TL","Lindsey Stirling and Pentatonix","Shingeki no Kyojin"};
	private String[] popSong = {"Paris","That's What I Like","That's What I Like"};
	private String[] popArtist = {"Chainsmokers","Bruno Mars","Drake"};
	private String[] inspirationalSong = {"Scars To Your Beautiful","Courageous","Good Fight"};
	private String[] inspirationalArtist = {"Alessia Cara","Casting Crowns","Unspoken"};
	private String[] rnbSong = {"Congratulations","24k Magic","Controlla"};
	private String[] rnbArtist = {"Post Malone","Bruno Mars","Drake"};
	private String[] rapSong = {"Bad and Boujee","Black Beatle","Bounce Back"};
	private String[] rapArtist = {"Migos","Rae Sremmurd","Big Sean"};
    private String myName;
    
    public MyBot(String name)
	{
		super(name);
	}
    
    public String getName()
	{
		return myName;
	}
	
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.trim().length() == 0)
		{
			response = "You can't say nothing and expect me to say something.";
		} 
		else if ((findKeyword(statement, "what") >= 0 && findKeyword(statement, "do you like", findKeyword(statement, "what")) >= 0 )||(findKeyword(statement, "what") >= 0 && findKeyword(statement, "you listen to", findKeyword(statement, "what")) >= 0 ))
		{
		    System.out.println("I like a lot of music: ");
		    randomPause();
		    System.out.println("Here are some");
		    Random rand = new Random();
		    for(int i = 0; i< rand.nextInt(6) + 1;i++)
		    {
		        System.out.println(genres[rand.nextInt(8)]);
		        randomPause();
		    }
		    if(rand.nextInt(2) == 0)
		    {
		        response = "What type of music do you listen to?";
		    }
		    else
		    {
		        response =genres[rand.nextInt(8)];
		    }
		}
		else if(findKeyword(statement, "most favorite") >= 0 && findKeyword(statement, "genre", findKeyword(statement, "most favorite")) >= 0)
		{
		    System.out.println("My most favorite genre is pop");
		}
		else if((findKeyword(statement, "do you like") >= 0 && findKeyword(statement, "electro", findKeyword(statement, "do you like")) >= 0)||(findKeyword(statement, "do you like") >= 0 && findKeyword(statement, "house", findKeyword(statement, "do you like")) >= 0)||(findKeyword(statement, "do you like") >= 0 && findKeyword(statement, "trap", findKeyword(statement, "do you like")) >= 0)||(findKeyword(statement, "do you like") >= 0 && findKeyword(statement, "instrumental", findKeyword(statement, "do you like")) >= 0)||(findKeyword(statement, "do you like") >= 0 && findKeyword(statement, "pop", findKeyword(statement, "do you like")) >= 0)||(findKeyword(statement, "do you like") >= 0 && findKeyword(statement, "inspirational", findKeyword(statement, "do you like")) >= 0)||(findKeyword(statement, "do you like") >= 0 && findKeyword(statement, "r&b", findKeyword(statement, "do you like")) >= 0)||(findKeyword(statement, "do you like") >= 0 && findKeyword(statement, "Rhythm And Blues", findKeyword(statement, "do you like")) >= 0)||(findKeyword(statement, "do you like") >= 0 && findKeyword(statement, "Rap", findKeyword(statement, "do you like")) >= 0)||(findKeyword(statement, "do you like") >= 0 && findKeyword(statement, "music", findKeyword(statement, "do you like")) >= 0))
		{
		    response = transformDotoI(statement);
		}
		else if((findKeyword(statement, "do you like") >= 0 ))
		{
		    response = transformDeny(statement);
		} 
		else if((findKeyword(statement, "hate") >= 0 ))
		{
		    response = "I don't hate anything except you";
		} 
		else if(findKeyword(statement, "favorite") >= 0 && findKeyword(statement, "electro", findKeyword(statement, "some")) >= 0)
		{
			//What are some eletro music do you like ?
			System.out.println("There are 3 electro music i really like\nhere is the list");
			for(int i = 0; i < 2; i++)
			{
			    System.out.println(electroSong[i] + " by " + electroArtist[i]);
			}
			response = electroSong[2] + " by " + electroArtist[2];
		}
		else if(findKeyword(statement, "most favorite") >= 0 && findKeyword(statement, "electro", findKeyword(statement, "most favorite")) >= 0)
		{
			//What is your most favorite electro music?
			response = "My favorite electro music is " +electroSong[0] + " by " + electroArtist[0];
		}
		else if(findKeyword(statement, "favorite") >= 0 && findKeyword(statement, "house", findKeyword(statement, "some")) >= 0)
		{
			//What are some house music do you like ?
			System.out.println("There are 3 house music i really like\nhere is the list");
			for(int i = 0; i < 2; i++)
			{
			    System.out.println(houseSong[i] + " by " + houseArtist[i]);
			}
			response = houseSong[2] + " by " + houseArtist[2];
		}
		else if(findKeyword(statement, "most favorite") >= 0 && findKeyword(statement, "house", findKeyword(statement, "most favorite")) >= 0)
		{
			//What is your most favorite house music?
			response = "My favorite house music is " +houseSong[0] + " by " + houseArtist[0];
		}
		else if(findKeyword(statement, "favorite") >= 0 && findKeyword(statement, "trap ", findKeyword(statement, "some")) >= 0)
		{
			//What are some house music do you like ?
			System.out.println("There are 3 trap music i really like\nhere is the list");
			for(int i = 0; i < 2; i++)
			{
			    System.out.println(trapSong[i] + " by " + trapArtist[i]);
			}
			response = trapSong[2] + " by " + trapArtist[2];
		}
		else if(findKeyword(statement, "most favorite") >= 0 && findKeyword(statement, "trap", findKeyword(statement, "most favorite")) >= 0)
		{
			//What is your most favorite trap music?
			response = "My favorite trap music is " +trapSong[0] + " by " + trapArtist[0];
		}
		else if(findKeyword(statement, "favorite") >= 0 && findKeyword(statement, "instrumental", findKeyword(statement, "some")) >= 0)
		{
			//What are some house music do you like ?
			System.out.println("There are 3 instrumental music i really like\nhere is the list");
			for(int i = 0; i < 2; i++)
			{
			    System.out.println(instrumentalSong[i] + " by " + instrumentalArtist[i]);
			}
			response = instrumentalSong[2] + " by " + instrumentalArtist[2];
		}
		else if(findKeyword(statement, "most favorite") >= 0 && findKeyword(statement, "instrumental", findKeyword(statement, "most favorite")) >= 0)
		{
			//What is your most favorite instrumental music?
			response = "My favorite instrumental music is " +instrumentalSong[0] + " by " + instrumentalArtist[0];
		}
		else if(findKeyword(statement, "favorite") >= 0 && findKeyword(statement, "pop", findKeyword(statement, "some")) >= 0)
		{
		    //What are some pop music do you like ?
			System.out.println("There are 3 pop music i really like\nhere is the list");
			for(int i = 0; i < 2; i++)
			{
			    System.out.println(popSong[i] + " by " + popArtist[i]);
			}
			response = popSong[2] + " by " + popArtist[2];
		}
		else if(findKeyword(statement, "most favorite") >= 0 && findKeyword(statement, "pop", findKeyword(statement, "most favorite")) >= 0)
		{
			//What is your most favorite pop music?
			response = "My favorite pop music is " +popSong[0] + " by " + popArtist[0];
		}
		else if(findKeyword(statement, "favorite") >= 0 && findKeyword(statement, "inspirational ", findKeyword(statement, "some")) >= 0)
		{
			//What are some inspirational music do you like ?
			System.out.println("There are 3 inspirational music i really like\nhere is the list");
			for(int i = 0; i < 2; i++)
			{
			    System.out.println(inspirationalSong[i] + " by " + inspirationalArtist[i]);
			}
			response = inspirationalSong[2] + " by " + inspirationalArtist[2];
		}
		else if(findKeyword(statement, "most favorite") >= 0 && findKeyword(statement, "inspirational", findKeyword(statement, "most favorite")) >= 0)
		{
			//What is your most favorite inspirational music?
			response = "My favorite inspirational music is " +inspirationalSong[0] + " by " + inspirationalArtist[0];
		}	
		else if(findKeyword(statement, "favorite") >= 0 && findKeyword(statement, "R&B", findKeyword(statement, "some")) >= 0)
		{
		    //What are some R&B music do you like ?
			System.out.println("There are 3 R&B music i really like\nhere is the list");
			for(int i = 0; i < 2; i++)
			{
			    System.out.println(rnbSong[i] + " by " + rnbArtist[i]);
			}
			response = rnbSong[2] + " by " + rnbArtist[2];
		}
			else if(findKeyword(statement, "most favorite") >= 0 && findKeyword(statement, "R&B", findKeyword(statement, "most favorite")) >= 0)
		{
			//What is your most favorite inspirational music?
			response = "My favorite R&B music is " +rnbSong[0] + " by " + rnbArtist[0];
		}
		else if(findKeyword(statement, "favorite") >= 0 && findKeyword(statement,"rap", findKeyword(statement, "some")) >= 0)
		{
			//What are some rap music do you like ?
			System.out.println("There are 3 rap music i really like\nhere is the list");
			for(int i = 0; i < 2; i++)
			{
			    System.out.println(rapSong[i] + " by " + rapArtist[i]);
			}
			response = rapSong[2] + " by " + rapArtist[2];
		}
		else if(findKeyword(statement, "most favorite") >= 0 && findKeyword(statement, "rap", findKeyword(statement, "most favorite")) >= 0)
		{
			//What is your most favorite inspirational music?
			response = "My favorite rap music is " +rapSong[0] + " by " + rapArtist[0];
		}
		else if(findKeyword(statement, "most favorite") >= 0 && findKeyword(statement, "music artist", findKeyword(statement, "most favorite")) >= 0)
		{
			//Who is your most favorite artist?
			response = "My most favorite music artist is Alan Walker";
		}
		else if ((findKeyword(statement, "Hi") >= 0) || (findKeyword(statement, "hello") >= 0) ||(findKeyword(statement, "Hey") >= 0)||(findKeyword(statement, "yo") >= 0))
		{
			response = "HiHi ";
		}
		else if (findKeyword(statement, "music") >= 0)
		{
		    response = "COOOOOOOL.....";
		}
		else
		{
		    response = getRandomResponse();
		}
		return response;
	}
	
	public String getRandomResponse() {
	    if (Math.random() * 2 < 1){
	        return "really";
	    }else {
	        return "hmm Interesting, tell me more.";
	   }
	}
	
	private String transformDotoI(String statement)
	{
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword (statement, "Do you like", 0);
		String restOfStatement = statement.substring(psn + 11).trim();
		return "I like " + restOfStatement + ".    :)";
	}
	
	private String transformDeny(String statement)
	{
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword (statement, "Do you like", 0);
		String restOfStatement = statement.substring(psn + 11).trim();
		return "No i don't like " + restOfStatement + ".          -_-*";
	}
}

