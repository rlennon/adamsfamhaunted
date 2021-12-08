package ie.lyit.adamsfam;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccommodationTest {
	
	// Declare testing object
	private Accommodation house;
	private Accommodation house2;
	
	// Provide setUp() method using @Before annotation and instantiate testing object
	@Before
	public void setUp() throws Exception{
		house = new Accommodation("House", 6, 400.0);
		house2 = new Accommodation("House", 6, 400.0);
	}
	
	// Test object
	@Test
	public void testHouse() {
		assertTrue("House".equals(house.getType())); // check if type is correct
		assertEquals("Capacity should be 6", 6, house.getCapacity()); // check if capacity is correct
		assertTrue(400.00 == house.getPrice()); // check if pricePerNight is correct 
			
	}
	
	// Test for Exceptions
	@Test(expected=IllegalArgumentException.class)
	public void testHouseStringIntDoubleForException() {
		
		house = new Accommodation("House", 0, 300.0); // providing incorrect capacity of 0
			
	}
	
	// Test to String Method
	@Test
	public void testToString() {
		assertEquals("Type:House\nCapacity:6\nPrice Per Night:400.0", house.toString());
				   
	}
	
	// Test equals
	@Test
	public void equalsTest(){
		assertTrue(house.equals(house2));
	}
}
