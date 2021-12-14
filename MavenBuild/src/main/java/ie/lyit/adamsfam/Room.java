package ie.lyit.adamsfam;

public class Room {
//written by James
	private String firstName;
	private String lastName;
	private int roomNo;
	
	public Room (String firstName, String lastName, int roomNo) {
		
		if(firstName == "" || firstName == ""|| roomNo <= 0 )
			throw new IllegalArgumentException("Invalid. Please enter the correct values.");
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.roomNo=roomNo;
	}
	
	public int getRoomNo()
	{
		return this.roomNo;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	// String method
		@Override
		public String toString()
		{
			return "Name: "+getFirstName()+" "+getLastName()+"\n"+"Room Number: "+getRoomNo();
		}
		
		// Equals method
		@Override
		public boolean equals(Object obj)
		{  
		  Room roomObj;
		  if(obj instanceof Room)
			  roomObj = (Room)obj;
		  else  
		    return false;
		 
		  if( (this.firstName.equals(roomObj.firstName)) && (this.lastName.equals(roomObj.lastName)) && (this.roomNo == roomObj.roomNo) )
		    return true;
		  else
		    return false;
		  
		}
}
