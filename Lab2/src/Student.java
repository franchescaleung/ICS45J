import java.util.ArrayList;
import java.util.List;
public class Student {
	
	private int studentIdNumber;
	private String firstName, lastName;
	private Address address; //- an object representing the mailing address of the student
	private List<Grade> transcript; // = new ArrayList<>(); // a List of grade objects

	// default
	public Student()
	{
		studentIdNumber = 0;
		firstName = "";
		lastName = "";
		transcript = new ArrayList<>();
		
	}
	
	
	public Student(int idNum, String firstName, String lastName, Address address, List<Grade> transcript)
	{
		this.studentIdNumber = idNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.transcript = transcript;
	}
	
	//copy constructor
	public Student(Student s)
	{
		this.studentIdNumber = s.studentIdNumber;
		this.firstName = s.firstName;
		this.lastName = s.lastName;
		this.address = s.address;
		this.transcript = s.transcript;
	}
	
	// setters
	public void setTranscript(List<Grade> transcript)
	{
		this.transcript = transcript;
	}
	
	public void setAddress(Address address)
	{
		this.address = address;
	}
	
	public void setFirstName(String name)
	{
		this.firstName = name;
	}
	
	public void setLastName(String name)
	{
		this.lastName = name;
	}
	
	public void setId(int idNum)
	{
		this.studentIdNumber = idNum;
	}
	
	// add grade
	public void addGrade(String description, double gradePoint, int units)
	{
		// new grade item
		// put in list
		Grade g = new Grade(description, gradePoint, units);
		transcript.add(g);
	}
	
	
	// getters
	public int getId()
	{
		return studentIdNumber;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	

	public Address getAddress()
	{
		return address;
	}
	
	// return transcript
	public List<Grade> getGrades()
	{
		return transcript;
	}
		
	// get GPA
	public double getGPA()
	{

		double gpa = 0;
		for (int i = 0; i < transcript.size(); i++)
			gpa += transcript.get(i).getGradePoints();
		return gpa/transcript.size();
		
	}
	
	// get Units
	// adds number of units taking
	public int getUnits()
	{
		int totalUnits = 0;
		for (int i = 0; i < transcript.size(); i++)
			totalUnits += transcript.get(i).getNumOfUnits();
		return totalUnits;
	}
	
	
	// used in toString
	private String getTranscript()
	{
		String s = "";
		for (int i = 0; i < transcript.size(); i++)
		{
			s += transcript.get(i).toString();
			
		}
		return s + "Units: " + getUnits() + "\nGPA: " + getGPA();
		
	}
	
	// toString
	public String toString()
	{
		
		return "First Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nStudent ID: " + getId() + "\nAddress: " + getAddress() + "\n" + getTranscript();
	}


}
