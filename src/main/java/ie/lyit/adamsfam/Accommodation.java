package ie.lyit.adamsfam;

 // Written by: Mario
 // Date 02/12/2021
 // To be used to test the workflow (GitHub Actions)
public class Accommodation {
	
	// Instance variables
	
	// Type of accommodation
	private String type;
	
	// Capacity
	private int capacity;
	
	// Price per night
	private double pricePerNight;
	
	
	// User defined constructor (for administration purposes)
	// Throw IllegalArgumentException to avoid bad inputs
	
	public Accommodation(String type, int capacity, double pricePerNight) throws IllegalArgumentException
	{
		// Throw the exception whenever a inconsistency with user input is detected
		if(type == "" || capacity > 8 || capacity <= 0 || pricePerNight < 0)
			throw new IllegalArgumentException("Invalid parameters. Please provide correct values.");
		
		this.type = type;
		this.capacity = capacity;
		this.pricePerNight = pricePerNight;
	}
	
	// Accessor methods
	public String getType()
	{
		return this.type;
	}
	
	public int getCapacity()
	{
		return this.capacity;
	}
	
	public double getPrice()
	{
		return this.pricePerNight;
	}
	
	// Provide to String method
	@Override
	public String toString()
	{
		return "Type:"+getType()+"\n"+"Capacity:"+getCapacity()+"\n"+"Price Per Night:"+getPrice();
	}
	
	// provide Equals method
	@Override
	public boolean equals(Object obj)
	{  
	  Accommodation otherAccommodation;
	  if(obj instanceof Accommodation)
	    otherAccommodation = (Accommodation)obj;
	  else  
	    return false;
	 
	  if( (this.type.equals(otherAccommodation.type)) && (this.capacity == otherAccommodation.capacity) && (this.pricePerNight == otherAccommodation.pricePerNight) )
	    return true;
	  else
	    return false;
	  
	}
	

}
