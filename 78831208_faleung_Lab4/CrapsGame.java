public class CrapsGame
{
    private int point = 0;
   
    /**
    *  Calculates the result of the next dice roll in the Craps game.
    *  The parameter total is the sum of dots on two dice.
    *  point is set to the saved total, if the game continues,
    *  or 0, if the game has ended.
    *  Returns 1 if player won, -1 if player lost,
    *  0 if player continues rolling.
    */
    public int processRoll(int total)
    {
        // Your implementation goes here
    	
    	// second time around (point is not 0), and rolls 7
    	if (point != 0 && total == 7)
    	{
    		// reset point to 0
    		point = 0;
    		return -1;
    	}
    	// second time around(point is not 0), if total is point
    	else if (point != 0 && point == total)
    	{
    		// reset point to 0
    		point = 0;
    		return 1;
    	}
    	// first time roll 7 or 11 with point = 0 to win
    	else if ((total == 7 || total == 11) && point == 0)
    		return 1;
    	
    	// first time roll a 2, 3, or 12 with point = 0 to lose
    	else if ((total == 2 || total == 3 || total == 12) && point == 0)
    		return -1;
    	
    	else if (point == 0)
    	{
    		point = total;
    		return 0;
    	}
    	// else set point to total
    	else
    	{
    		// point = total;
    		return 0;
    	}
    	

    }
  
    /**
    *  Returns the saved point
    */
    public int getPoint()
    {
        return point;
    }
}