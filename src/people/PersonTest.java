/**
 * 
 */
package people;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author dracon
 *
 */
public class PersonTest {
	
	private Person person;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		person = new Person();
		person.setDni(12345);
		person.setage(50);
		person.setname("Albert Cortez");
		person.setsalary(5000);

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testGetDni() {
		int resp = person.getDni();
		int respWaited = 12345;
		
		assertEquals(respWaited, resp);
	}
	
	@Test 
	public void testSetDni() {
		int dni = 1233123;
		person.setDni(dni);
		
		assertNotNull(person.getDni());
	}
	
	@Test
	public void testIsGreaterThan18() {
		assertTrue(person.isGreaterThan18());
	}

}
