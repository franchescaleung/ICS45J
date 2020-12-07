import java.util.Scanner;

public class Lab1
{

    // problem 1
    public double circleArea(int radius)
    {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    // problem 2
    // surface area of a cylinder given radius and height
    // calls circleArea
    public double findSurfaceArea(int radius, int height)
    {
        // A = (2 * pi * radius) + (2 * pi * r^2)
        double surfaceArea = (2 * Math.PI * radius * height) + (2 * circleArea(radius));
        return surfaceArea;
    }

    // problem 3 
    // isPerfectCube
    // can we use cbrt function
    public boolean isPerfectCube(int num)
    {
    	// if the remainder of the cube root is not 0, then num is not perfect cube
        if (java.lang.Math.cbrt(num) % 1.0 == 0)
        {
          return true;
        }
        else
          return false;
    }

      // problem 4
      // isPrime
      /// determines if num is a prime number
      public boolean isPrime(int num)
      {
        // prime = num > 1 w/ no positive divisors besides one and itself
        // true if num is prime and false otherwise
        
    	// 2 and 3 are always prime
        if (num == 2 || num == 3)
          return true;
        
        // not prime if less than 2
        if (num < 2)
          return false;
        
        // see if divisible by numbers up to itself
        for (int i = 2; (int) Math.sqrt(num) + 1 >= i; i++)
        {
            if (num % i == 0)
                return false;
        }
        // returns true for prime after passing all cases above
        return true;
      }

      // problem 5
      // greatest common factor
      public int greatestCommonFactor(int x, int y)
      {
    	// see which int is smaller
        int smallerNum = x;
        if (y < x)
        {
          smallerNum = y;
        }
        // default gcf
        int gcf = 1;
        
        // see if both nums are divisble by another number up til small num
        for (int i = 2; i <= smallerNum; i++)
        {
          if (x % i == 0 && y % i == 0)
        	// set gcf
            gcf = i;

        }

        return gcf;
      }

      // problem 6

      public double findCurrentTemp(double chirps)
      {
    	// calculate chirps in a minute then use formula given
        double chirpsInAMinute = 4 * chirps;
        double sum = 40 + chirpsInAMinute ;
        double temp = .25 * sum;
        return temp;
      }

      // problem 7

      public double findDegrees(int celsius)
      {
        double temp = (double) (celsius * ((double) 9/5) + 32);
        return temp;
      }

    
      // problem 8

      public boolean isValidPlate(String plateNumber)
      {
        if (plateNumber.length() != 7)
          return false;

        // if first item is not a digit return false
        if (!Character.isDigit(plateNumber.charAt(0)))
          return false;
        
        // see if next three characters are letters
        for (int i = 1; i <= 3; i++)
        {
          if (!Character.isLetter(plateNumber.charAt(i)))
            return false;
        }

        // see if last 3 are digits
        for (int i = 4; i <= 6; i++)
        {
          if (!Character.isDigit(plateNumber.charAt(i)))
            return false;
        }

        return true;
      }

      // problem 9

      public boolean isPalindrome(String word)
      {
    	// convert to lowercase because not case sensitive
        word = word.toLowerCase();
        int len = word.length();
        
        // a palindrome if only 1 letter
        if (len == 1)
          return true;
        
        // check first with last letters then go inwards
        for (int i = 0; i < len/2; i++)
        {
          if (word.charAt(i) != word.charAt(len-i-1))
            return false;

        }

        return true;
 
      }

      // problem 10
      public int findNumOfVowels(String word)
      {
    	  
        int numOfVowels = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++)
        {
          char letter = word.charAt(i);
          if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
          {
            numOfVowels++;
          }
        }

        return numOfVowels;
      }

      // problem 11


      public int convertToDecimal(String roman)
      {
        int total = 0;
       // System.out.println("last letter = " + roman.charAt(roman.length() - 1));
   
       // System.out.println("first num = " + romanToInt(roman.charAt(0)));
       
        int len = roman.length();
        for (int i = 0; i < len;i++)
        {
        	int letterToNum = romanToInt(roman.charAt(i));
        	
        	if (i + 1 < len)
        	{
        		int letter2ToNum = romanToInt(roman.charAt(i + 1));
        		
        		// if the next letter is larger, then add next letter then subtract current
        		if (letterToNum < letter2ToNum)
        		{
        			total += letter2ToNum - letterToNum;
        			// since subtracting, skip next num
        			i++;
        		}
        		
        		else
        			total += letterToNum;
        		
        	}
        	
        	else
        		total += letterToNum;
        	
        	
        }
        return total;
      }

      // helper function
      private int romanToInt(char letter)
      {
        
        if (letter == 'I')
          return 1;
        if (letter == 'V')
          return 5;
        if (letter == 'X')
          return 10;
        if (letter == 'L')
          return 50;
        if (letter == 'C')
          return 100;
        if (letter == 'D')
          return 500;
        if (letter == 'M')
          return 1000;
        
        // if not defined in roman numerals, return 0
        return 0;
        
      }

      // problem 12

      public String convertToBinary(int num)
      {
        // remember to reverse final answer
        String reversedBinary = "";
        while (num != 0)
        {
          reversedBinary += (num % 2);
          num = num/2;
        }
        
        String binary = "";
        for (int i = reversedBinary.length() - 1; i >= 0; i--)
        {
          binary += reversedBinary.charAt(i);
        }
        return binary;
      }

}



