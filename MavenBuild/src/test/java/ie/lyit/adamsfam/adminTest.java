import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author L00143787
 *
 */
public class adminTest {
	/**
	 * Test method for
	 * {@link admin#admin(java.lang.String, int, java.lang.String, boolean)}.
	 */

	// Creating admin objects
	Admin a1 = new Admin("Mary", 30, "password", true);
	Admin a2 = new Admin("Bob", 50, "12345", true);

	@Test
	public void test() { // Testing name, age, password, admin methods
		assertEquals("Mary", a1.getName());
		assertEquals(30, a1.getAge());
		assertEquals("password", a1.getPassword());
		assertTrue(a1.getAdmin());
	}

	@Test
	public void testToString() { // Testing toString
		assertEquals("Name : Mary Age : 30 Password : password Admin : true", a1.toString());
	}

	@Test
	public void testEqualsTo() { // Testing equals method

		assertFalse(a1.equals(a2));

	}

}
