// Amy Campbell
// L00147036

package ie.lyit.adamsfam;

import static org.junit.Assert.*;
import org.junit.Test;

public class BookingTest
{
	// create a new booking object
	private Booking testBooking = new Booking(001, "Bloggs", 105);
	private Booking booking2 = new Booking(001, "Bloggs", 105);

	@Test
	public void testBooking() 
	{
		// check that the values have been set correctly
		assertTrue(001 == testBooking.getBookingNumber()); // check if booking number is correct
		assertEquals("Bloggs", testBooking.getBookingName()); // check if booking name is correct
		assertTrue(105 == testBooking.getRoomBooked()); // check if pricePerNight is correct 
			
	}
	
	// toString() method to display the booking object & ensure all details are correct
	@Test
	public void testToString() 
	{
		assertEquals("Booking number: 1 Name: Bloggs Room: 105", testBooking.toString());
	}
   
	// equals() method to compare two booking objects
	@Test
	public void testEquals()
	{
		assertTrue(testBooking.equals(booking2)); // objects are currently the same, so this passes
		
	}

}
