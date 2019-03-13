public class SuperKarelProgram extends SuperKarel
{
    public void run()
    {
        int b = 0 ;
        while(frontIsClear())
        {
            move();
            b++
        }
        turnAround();
        for(int i =0; i < b/2 ; i++)
        {
            move();
        }
        turnAround();
        
        OuterLayer();
        
        for(int g = 0; g < 9; g++)
        {
         move();
        }
        turnLeft();
        for(int g = 0; g < 9; g++)
        {
         move();
        }
        notSquare();
        turnLeft();
        accrosee();
        upAccrosee();
        turnLeft();
        accrosee();
        turnLeft();
        notSquare();
        move();
        turnLeft();
        while(frontIsClear()){
            move();
        }
        turnLeft();
        while(frontIsClear()){
            move();
        }
        turnLeft();
    }
    
    private void OuterLayer()
    {
        for(int g = 0; g < 4; g++)
        {
            for(int i = 0; i < 11; i++)
            {
                    
                turnLeft();
                move();
                turnRight();
                move();
                putBall();
            }
            turnLeft();
        }
       
    }
    
    private void notSquare()
    {
        for(int b = 0; b < 2; b++)
        {
            for(int h = 0; h < 9; h++)
            {
                        
                turnLeft();
                move();
                turnRight();
                move();
                putBall();
            }
            turnLeft();    
        }
    }
    
    private void accrosee()
    {
        move();
        for(int j = 0; j < 17; j++)
        {
            putBall();
            move();
        }
        putBall();
    }
    
    private void upAccrosee()
    {
        while (notFacingNorth())
        {
            turnLeft();
        }
        for(int p = 0 ; p < 4; p++ )
        {
            move();
        }
    }
}