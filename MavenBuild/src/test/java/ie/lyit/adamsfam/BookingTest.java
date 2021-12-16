// Amy Campbell
// L00147036

package ie.lyit.adamsfam;

import static org.junit.Assert.*;

public class BookingTest
{
	@Test
	// create a new booking object
	Booking testBooking = new Booking(001, "Bloggs", 105);

	// test that the properties are working
	int bookingNumberValue = testBooking.getBookingNumber();
	String bookingNameValue = testBooking.getBookingName();
	int bookingRoomValue = testBooking.getRoomBooked();

	// check if the values match
	assertEquals(bookingNumberValue, 001);
	assertEquals(bookingNameValue, "Bloggs");
	assertEquals(bookingRoomValue, 105);

	// toString() method to display the booking object & ensure all details are correct
	System.out.println(testBooking.toString());

	// equals() method to compare two booking objects by looking at their unique booking number
	Booking anotherBooking = new Booking(002, "Surname", 106);
	System.out.println("Are the bookings the same?: " +testBooking.equals(anotherBooking)); // prints out either true or false

}