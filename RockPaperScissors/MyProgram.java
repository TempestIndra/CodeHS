import java.util.Random;
public class MyProgram extends ConsoleProgram
{
    String playerName;
    int playerScore = 0;
    int aiScore = 0;
    String player1;
    String player2;
    String aiChoice;
    int round = 0;
    String player1Choice;
    int player1Score = 0;
    String player2Choice;
    int player2Score = 0;
    
    public void run()
    {
        System.out.println("Welcome to Rock Paper Scissors");
        System.out.println("Total of 5 rounds");
        String decision = readLine("Do you want to play Co-op or aginst AI?");
        
        if(decision.equals("AI")|| decision.equals("ai") || decision.equals("Ai"))
        {
            playerName = readLine("Enter your name :");
            System.out.println("My name is Annie bot i will be opponent");
            while(!(round == 5))
            {
                VsAI();
            }
            if(aiScore > playerScore )
            {
                System.out.println("Annie Bot win by " + aiScore + "to " + playerScore);
            }
            else if(playerScore > aiScore)
            {
                System.out.println(playerName + "Win by " + playerScore + "to " + aiScore);
            }
            else
            {
                System.out.println("It a draw");
            }
            
        }
        else if (decision.equals("two Players")||decision.equals("2")||decision.equals("Co-op")||decision.equals("co-op"))
        {
            player1 = readLine("Enter Player1 name");
            player2 = readLine("Enter Player2 name");
            Vs2();
            if(player1Score > player2Score )
            {
                System.out.println(player1 + "Win by " + player1Score + "to " + player2Score);
            }
            else if(player2Score > player1Score)
            {
                System.out.println(player2 + "Win by " + player2Score + "to " + player1Score);
            }
            else
            {
                System.out.println("It a draw");
            }
        }
        else
        {
            System.out.println("Unaccpetable decision");
            run();
        }
        
        
        
    }
    

    private void VsAI()
    {
        String PlayerChoice;
        
        Random rand = new Random();
        int myNum = rand.nextInt(3);
        if(myNum == 0)
        {
            aiChoice = "Rock";
        }
        else if(myNum == 1)
        {
            aiChoice = "Paper";
        }
        else
        {
            aiChoice = "Scissor"; 
        }
        PlayerChoice = readLine("What do you choose :");
        if(PlayerChoice.equals("Rock") || PlayerChoice.equals("rock"))
        {
            if(aiChoice.equals("Rock"))
            {
                System.out.println("Draw");
                round++;
            }
            else if(aiChoice.equals("Paper"))
            {
                playerScore++;
                System.out.println(playerName + "Win");
                round++;
            }
            else if(aiChoice.equals("Scissor"))
            {
                aiScore++;
                System.out.println("Annie bot Win");
                round++;
            }
        }
        else if(PlayerChoice.equals("Paper")||PlayerChoice.equals("paper"))
        {
            if(aiChoice.equals("Rock"))
            {
                playerScore++;
                System.out.println(playerName + "Win");
                round++;
            }
            else if (aiChoice.equals("Scissor"))
            {
                aiScore++;
                System.out.println("Annie bot Win");
                round++;
            }
            else if(aiChoice.equals("Paper"))
            {
                System.out.println("Draw");
                round++;
            }
        }
        else if(PlayerChoice.equals("Scissor")||PlayerChoice.equals("scissor"))
        {
            if(aiChoice.equals("Rock"))
            {
                aiScore++;
                System.out.println("Annie bot Win");
                round++;
            }
            else if (aiChoice.equals("Scissor"))
            {
                System.out.println("Draw");
                round++;
            }
            else if(aiChoice.equals("Paper"))
            {
                playerScore++;
                System.out.println(playerName + "Win");
                round++;
            }
        }
        else
        {
            System.out.println("Skip this round because wrong input");
            round++;
        }
        
        //System.out.println(round);
    }
    
    
    private void Vs2()
    {
        System.out.println("Vs2");
        player1 = readLine("What is player1 name?");
        player2 = readLine("What is player2 name?");
        while(!(round == 5))
        {
            player1Choice = readLine("What do "+ player1 +" choose :");
            clear();
            player2Choice = readLine("What do "+ player2 +" choose :");
            if(player1Choice.equals("Rock") || player1Choice.equals("rock"))
            {
                if(player2Choice.equals("Rock"))
                {
                    System.out.println("Draw");
                    round++;
                }
                else if(player2Choice.equals("Paper"))
                {
                    player1Score++;
                    System.out.println(player1 + "Win");
                    round++;
                }
                else if(player2Choice.equals("Scissor"))
                {
                    player2Score++;
                    System.out.println(player2 + "Win");
                    round++;
                }
                else
                {
                     System.out.println("Skip this round because wrong input");    
                }
            }
            else if(player1Choice.equals("Paper")||player1Choice.equals("paper"))
            {
                if(player2Choice.equals("Rock"))
                {
                    player1Score++;
                    System.out.println(player1 + "Win");
                    round++;
                }
                else if (player2Choice.equals("Scissor"))
                {
                    player2Score++;
                    System.out.println(player2 + "Win");
                    round++;
                }
                else if(player2Choice.equals("Paper"))
                {
                    System.out.println("Draw");
                    round++;
                }
                else
                {
                     System.out.println("Skip this round because wrong input");
                }
            }
            else if(player1Choice.equals("Scissor")||player1Choice.equals("scissor"))
            {
                if(player2Choice.equals("Rock"))
                {
                    player2Score++;
                    System.out.println(player2 + "Win");
                    round++;
                }
                else if (player2Choice.equals("Scissor"))
                {
                    System.out.println("Draw");
                    round++;
                }
                else if(player2Choice.equals("Paper"))
                {
                    player1Score++;
                    System.out.println(player1 + "Win");
                    round++;
                }
                else
                {
                     System.out.println("Skip this round because wrong input");
                }
            }
            else
            {
                System.out.println("Skip this round because wrong input");
            }
        }
    }
    
    private void clear()
    {
        for(int i = 0; i < 25 ; i++)
        {
            System.out.println("");
        }
    }
}
