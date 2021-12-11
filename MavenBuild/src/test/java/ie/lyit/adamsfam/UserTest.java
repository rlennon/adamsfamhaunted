package ie.lyit.adamsfam;

import junit.framework.TestCase;

public class UserTest extends TestCase {
	

	

	//Create a user 
	User mainUser = new User("Brian", "B", "l00139962", "verySecure", "123", "l00139962@student.lyit.ie", 345);
	
	//tests if the user fname and sname are set
	public void testTheUsersNames() {
		//create the user object
		//User mainUser = new User("Brian", "B");
		
		//methods to test 
		String fnameVal = mainUser.getFname();	
		String snameVal = mainUser.getSname();
		
		//check if the value matches
		assertEquals(fnameVal, "Brian");
		assertEquals(snameVal, "B");

		
		
	}

	//test for username
	public void testUserName(){

		//check if the username is set
		assertEquals(mainUser.username, "l00139962");
	}

	//test for equality
	public void testEquals(){
		//second user
		User secondUser = new User("Brian2", "B2", "l00139962", "verySecureToo", "123", "l00139962@student.lyit.ie", 345);

		//check if the two objects are the same
		assertEquals(mainUser.equals(secondUser), true);


	}
	
	
}
