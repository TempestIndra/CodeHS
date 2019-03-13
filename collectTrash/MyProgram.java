
public class SuperKarelProgram extends SuperKarel
{
    public void run()
    {
        while(leftIsClear()){
            cleanRow();
        }
        finish();
        while(notFacingWest()){
            turnLeft();
        }
        while(frontIsClear()){
            move();
        }
        turnLeft();
        while(frontIsClear()){
            move();
        }
        while(notFacingEast()){
            turnLeft();
        }
    }
    
    private void cleanRow() 
    {
        while(frontIsClear()){
            ballPresentTake();
            move();
        }
        ballPresentTake();
        turnLeft();
        move();
        turnLeft();
        while(frontIsClear()){
            move();
        }
        turnAround();
    }
    
    private void finish(){
        ballPresentTake();
        while(frontIsClear()){
            move();
            ballPresentTake();
        }
    }
    private void ballPresentTake(){
        if(ballsPresent())
        {
            takeBall();
        }
    }
}

/**
 * the requirement for solving this challege is
 * you require to to pick up all the balls
 * you require to come back the to starting point
 * you require to make keral facing east
 * the solution have to work for all the worlds
 * Challenge
 * The maximum line of code is 55
 * use only whlie as control structor
 **/
 

