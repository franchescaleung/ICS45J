import junit.framework.TestCase;

public class Lab1Test extends TestCase {
	
	public void test1()
    {
        Lab1 test = new Lab1();
        assertEquals( test.circleArea( 5 ), 78.53981633974483 );
    }

    public void test2()
    {
        Lab1 test = new Lab1();
        assertEquals( test.findSurfaceArea( 3, 4 ), 131.94689145077132 );
    }

    public void test3()
    {
        Lab1 test = new Lab1();
        assertEquals( test.isPerfectCube( 64 ), true );
        assertEquals( test.isPerfectCube( 16 ), false );
    }

    public void test4()
    {
        Lab1 test = new Lab1();
        assertEquals( test.isPrime( 9 ), false );
        assertEquals( test.isPrime( 17 ), true );
    }

    public void test5()
    {
        Lab1 test = new Lab1();
        assertEquals( test.greatestCommonFactor( 12, 18 ), 6 );
    }

    public void test6()
    {
        Lab1 test = new Lab1();
        assertEquals( test.findCurrentTemp( 20 ), 30.0 );
    }

    public void test7()
    {
        Lab1 test = new Lab1();
        // You may or may not experience roundoff error. Check to make sure they are essentially
        // the same.
        assertEquals( test.findDegrees( 0) , 32.0);
        assertEquals( Math.abs( test.findDegrees( 42 ) - 107.60000000000001 ) < 0.00000000001, true );
    }

    public void test8()
    {
        Lab1 test = new Lab1();
        assertEquals( test.isValidPlate( "0UCI123"), true );
        assertEquals( test.isValidPlate( "PETER949"), false );
        assertEquals( test.isValidPlate( "0eTE949"), true );
    }

    public void test9()
    {
        Lab1 test = new Lab1();
        assertEquals( test.isPalindrome( "Racecar"), true );
        assertEquals( test.isPalindrome( "wowmom" ), false );
    }

    public void test10()
    {
        Lab1 test = new Lab1();
        assertEquals( test.findNumOfVowels( "Fran" ), 1 );
        assertEquals( test.findNumOfVowels( "Iowa" ), 3 );
    }

    public void test11()
    {
        Lab1 test = new Lab1();
        assertEquals( test.convertToDecimal( "MMXIX" ), 2019 );
        assertEquals( test.convertToDecimal("LXX"), 70 );
        assertEquals( test.convertToDecimal("CCC"), 300);
        assertEquals( test.convertToDecimal("CM"), 900);
        assertEquals( test.convertToDecimal("XC"), 90);
    }



    public void test12()
    {
        Lab1 test = new Lab1();
        assertEquals( test.convertToBinary( 300 ), "100101100" );
        assertEquals( test.convertToBinary( 333 ), "101001101" );
    }

}
