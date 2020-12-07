
public class Grade {
	
	private String courseName;
	private double gradePoints; // - (A: 4.0, A-: 3.7, B+: 3.3, B: 3.0, B-: 2.7, etc.)
	private int numOfUnits;
	
	//default
	public Grade()
	{
		courseName = "";
		gradePoints = 0.0;
		numOfUnits = 0;
	}
	
	
	public Grade(String courseName, double gradePoints, int numOfUnits)
	{
		this.courseName = courseName;
		this.gradePoints = gradePoints;
		this.numOfUnits = numOfUnits;
	}
	
	//copy constructor
	public Grade(Grade g)
	{
		this.courseName = g.courseName;
		this.gradePoints = g.gradePoints;
		this.numOfUnits = g.numOfUnits;
	}
	
	// setters
	public void setCourseName(String name)
	{
		this.courseName = name;
	}
	
	public void setGradePoints(double gradePoints)
	{
		this.gradePoints = gradePoints;
	}
	
	public void setUnits(int units)
	{
		this.numOfUnits = units;
	}
	
	// getters
	public String getCourseName()
	{
		return courseName;
	}
	
	public double getGradePoints()
	{
		return gradePoints;
	}
	
	public int getNumOfUnits()
	{
		return numOfUnits;
	}
	
	// toString
	public String toString()
	{
		return getCourseName() + ": " + getGradePoints() + " - " + getNumOfUnits() + "\n";
	}
}
