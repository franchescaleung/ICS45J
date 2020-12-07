//import static org.junit.Assert.*;

//import org.junit.Test;

public class Lab2Test extends junit.framework.TestCase{

	//@Test
	public void test1()
    {
		
        Address a = new Address( 1234, "Campus Dr", "Irvine", "CA", "92612" );
        assertEquals( a.getStreetName(), "Campus Dr" );
        assertEquals( a.getCity(), "Irvine" );
        assertEquals( a.getZip(), "92612" );
        Address b = new Address( a );
        b.setAddressNumber( 2468 );
        assertEquals( a.getAddressNumber(), 1234 );
        assertEquals( b.toString(), "2468 Campus Dr\nIrvine, CA 92612" );
    }

    public void test2()
    {
        Address a = new Address( 1234, "Campus Dr", "Irvine", "CA", "92612" );
        Student s = new Student();
        s.setAddress( a );
        s.setFirstName("Peter");
        s.setLastName("Anteater");
        s.setId(12345678);
        Student s2 = new Student(s);
        assertEquals( "Peter", s.getFirstName() );
        assertEquals( "Peter", s2.getFirstName() );
        assertEquals( "Anteater", s.getLastName() );
        assertEquals( 12345678, s.getId() );
       // getAddressNumber() + " " + getStreetName() + "\n" + getCity() + ", " + getState() + " " + getZip()
        assertEquals("1234 Campus Dr\n" + 
        	        		"Irvine, CA 92612" , a.toString());
    }

    public void test3()
    {
        Address a = new Address( 1234, "Campus Dr", "Irvine", "CA", "92612" );
        Student s = new Student();
        s.setAddress( a );
        s.setFirstName("Peter");
        s.setLastName("Anteater");
        s.setId(12345678);
        s.addGrade( "ICS 31", 3.7, 4);
        s.addGrade( "ICS 6B", 4, 4);
        s.addGrade( "ICS 32", 3, 4);

        //Roundoff error may occur, should be equal up to 6 decimal places
        assertEquals( 3.5666666666666664, s.getGPA() );
        assertEquals( 12, s.getUnits() );

    }

    public void test4()
    {
        Address a = new Address( 1234, "Campus Dr", "Irvine", "CA", "92612" );
        Student s = new Student();
        s.setAddress( a );
        s.setFirstName("Peter");
        s.setLastName("Anteater");
        s.setId(12345678);
        s.addGrade( "ICS 31", 3.7, 4);
        s.addGrade( "ICS 6B", 4, 4);
        s.addGrade( "ICS 32", 3, 4);
     //   System.out.print(s.getAddress());
      //  assertEquals("1234 Campus Dr\n" + 
      //  		"Irvine, CA 92612" , s.getAddress());
        assertEquals("Peter", s.getFirstName());
        assertEquals( "First Name: Peter\nLast Name: Anteater\nStudent ID: 12345678\nAddress: 1234 Campus Dr\nIrvine, CA 92612\nICS 31: 3.7 - 4\nICS 6B: 4.0 - 4\nICS 32: 3.0 - 4\nUnits: 12\nGPA: 3.5666666666666664", s.toString());
   }

    public void test5()
    {
        Address a = new Address( 1234, "Campus Dr", "Irvine", "CA", "92612" );
        
        Student s = new Student();
        s.setAddress( a );
        s.setFirstName("Peter");
        s.setLastName("Anteater");
        s.setId(12345678);
        s.addGrade( "ICS 31", 3.7, 4);
        s.addGrade( "ICS 6B", 4, 4);
        s.addGrade( "ICS 32", 3, 4);
        for( Grade g: s.getGrades() )
        {
            g.setGradePoints( 4 );
            g.setUnits( 3 );
        }
        assertEquals( "First Name: Peter\nLast Name: Anteater\nStudent ID: 12345678\nAddress: 1234 Campus Dr\nIrvine, CA 92612\nICS 31: 4.0 - 3\nICS 6B: 4.0 - 3\nICS 32: 4.0 - 3\nUnits: 9\nGPA: 4.0", s.toString());
    }

}
