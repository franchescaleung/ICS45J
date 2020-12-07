
public class Address {
	private int addressNumber;
	private String streetName, city, state, zipCode;
	
	// default
	public Address()
	{
		addressNumber = 0;
		streetName = "";
		city = "";
		state = "";
		zipCode = "";
	}
	public Address(int addressNumber, String streetName, String city, String state, String zipCode)
	{
		this.addressNumber = addressNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	// copy
	public Address(Address a)
	{
		this.addressNumber = a.addressNumber;
		this.streetName = a.streetName;
		this.city = a.city;
		this.state = a.state;
		this.zipCode = a.zipCode;
	}
	
	// setters
	public void setAddressNumber(int addressNumber)
	{
		this.addressNumber = addressNumber;
	}
	
	public void setStreetName(String name)
	{
		this.streetName = name;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public void setZipCode(String zip)
	{
		this.zipCode = zip;
	}
	
	// getters
	public int getAddressNumber()
	{
		return addressNumber;
	}
	
	public String getStreetName()
	{
		return streetName;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public String getZip()
	{
		return zipCode;
	}

	// to string
	public String toString()
	{
		return getAddressNumber() + " " + getStreetName() + "\n" + getCity() + ", " + getState() + " " + getZip();
	}
		
}
