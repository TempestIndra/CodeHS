public class MyProgram extends ConsoleProgram{   
    private String[] firstPart = {"What did the big chimney say to the little chimney?","The past, the present, and the funture walked into a bar.","What did Kim Joung Un say when his father died?","you hear the one with three holes in the ground filled with water? No?", "Two staellisted decided to get married", "How do two states greet each other?", "What did the Mexican firefighter name his two sons", "Whay are there fences around the graveyard?", "What do you calla belt made out of watches","Did you hear about the person who made the knock knock joke?"};
    private String[] secondPart = {"You're too young to be smoking!", "It was tense.","His Korea was over!", "Well, well, well...","The reception wasn't much, but the reception was incredible","Ohio!","Jose and House B", "Because people are dying to get in!","A waist of time!", "He invented the no-bell prize!"};
    private String no = "no";
    public void run(){
        String name = readLine("Hello. What is your name?");
        randomPause();
        System.out.println("Hello, " + name + " , to the joke simulator");
        rule();
        rollThejoke();
        ending();
    }
    public void randomPause(){
		try {Thread.sleep((long)(Math.random() * 2000));}               
        catch(InterruptedException ex) {Thread.currentThread().interrupt();}
	}
	public void rule(){
	    System.out.println("Ok, here are the rule. i'm going to tell you 10 jokes. You have \nto guess the right answer. If you miss the answer three times, \n you have to start over");
	    int answer = readInt("Type 1 if you understand");
	    if(answer != 1){ 
    	    System.out.println("here are the instruction again");
    	    rule();
	    }
	}
	public void rollThejoke(){
	    for(int i = 0; i<firstPart.length;i++)
	    {
	        randomPause();
	        System.out.println(firstPart[i]);
	        randomPause();
	        System.out.println(secondPart[i]);
	        
	        String opinion = readLine("Do you like the joke ");
	        if(no.compareTo(opinion.toLowerCase()) != 0)System.out.println("YEAHYEAH");
	        else System.out.println("let ignore that one");
	    }
	}
	public void ending(){
	    String opinion = readLine("Thanks for playing! Hope you laughed a bit! \n wanna see the jokes again>");
	    if(no.compareTo(opinion.toLowerCase()) != 0)run();
	    else System.out.println("bye bye");
	}
}
