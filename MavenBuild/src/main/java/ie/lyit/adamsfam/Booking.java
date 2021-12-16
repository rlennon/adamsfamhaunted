// Amy Campbell
// L00147036

package ie.lyit.adamsfam;

public class Booking
{
	// booking number (unique for every booking)
	private int bookingNumber;

	// name associated with booking
	private String bookingName;

	// number of room that has been booked
	private int roomBooked;


	// properties
	// accessors (getters)	
	public int getBookingNumber()
	{
		return bookingNumber;
	}

	public String getBookingName()
	{
		return bookingName;
	}

	public int getRoomBooked()
	{
		return roomBooked;
	}

	// mutators (setters)
	// NOTE: bookingNumber does not have a mutator, since it is unique for every booking & cannot be changed
	public void setBookingName(String nameIn)
    {
    	this.bookingName = nameIn;
    }

	public void setRoomBooked(int roomIn)
    {
    	this.roomBooked = roomIn;
    }


	// constructor
	public Booking(int numberIn, String nameIn, int roomIn)
	{
		this.bookingNumber = numberIn;
		this.bookingName = nameIn;
		this.roomBooked = roomIn;
	}


	// toString() method to display booking details
	public String toString()
	{
		return "Booking number: " +bookingNumber +" Name: " +bookingName +" Room: " +roomBooked;
	}

	// equals() method to compare two booking objects
    public boolean equals(Booking myBooking)
    {
    	// since every booking has a unique ID number, compare those to see if the objects are the same
        if(bookingNumber == myBooking.bookingNumber)
        	return true;
        else
        	return false; 
    }

}
