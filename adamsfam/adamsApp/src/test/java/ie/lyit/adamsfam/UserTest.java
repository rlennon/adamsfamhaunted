package ie.lyit.adamsfam;

import junit.framework.TestCase;

public class UserTest extends TestCase {
	

	
	//tests if the user fname and sname are set
	public void testUsersNames() {
		//create the user object
		User usr = new User("Brian", "B");
		
		//methods to test 
		String fnameVal = usr.getFname();	
		String snameVal = usr.getSname();
		
		//check if the value matches
		assertEquals(fnameVal, "Brian");
		assertEquals(snameVal, "B");

		
		
	}
	
	
}
