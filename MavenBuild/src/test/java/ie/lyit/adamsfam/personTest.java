import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author L00143787
 *
 */
public class personTest {

	/**
	 * Test method for {@link Person#Person(java.lang.String, int)}.
	 */

	// Creating Person objects
	Person p1 = new Person("Mary", 29);
	Person p2 = new Person("Tom", 30);

	@Test
	public void testPerson() { // Testing that name and age are set

		assertEquals("Mary", p1.getName());
		assertEquals(29, p1.getAge());
	}

	@Test
	public void textToString() { // tests toString

		assertEquals("Name : MaryAge : 29", p1.toString());

	}

	@Test
	public void testEqualsTo() { // Testing equals method

		assertFalse(p1.equals(p2));

	}

}