import java.util.Random;

public class Die
{
  private int numDots;

  // Sets numDots to a random integer from 1 to 6
  public void roll()
  {
    // Your code goes here
	  numDots = new Random().nextInt(6) + 1;

	  
  }

  // Returns numDots
  public int getNumDots()
  {
    return numDots;
  }
}
