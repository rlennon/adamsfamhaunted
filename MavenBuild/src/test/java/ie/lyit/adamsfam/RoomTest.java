//written by James
package ie.lyit.adamsfam;

import static org.junit.*;

public class RoomTest {
	// Declare testing object
	private Room room;
	private Room room2;
	

	@Before
	public void setUp() throws Exception{
		room = new Room("Joe", "Bloggs", 100);
		room2 = new Room("Joe", "Bloggs", 100);		
	}
	
	// Test object
	@Test
	public void testRoom() {
		assertTrue("Joe".equals(room.getFirstName())); 
		assertTrue("Bloggs".equals(room.getLastName())); 
		assertEquals("Room Number should be 100", 6, room.getRoomNo()); 
		 
			
	}
	
	// Test for Exceptions
	@Test(expected=IllegalArgumentException.class)
	public void testHouseStringIntDoubleForException() {
		
		room = new Room("Johnny"," " , 70); 
			
	}
	

	@Test
	public void testToString() {
		assertEquals("First Name: Joe\nLast name: Bloggs\nRoom Number: 100", room.toString());
				   
	}
	
	
	@Test
	public void equalsTest(){
		assertTrue(room.equals(room2));
	}
}
