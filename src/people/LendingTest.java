/**
 * 
 */
package people;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

/**
 * @author dracon
 *
 */
public class LendingTest {

	private Lending lending;
	private Person personDisabled;
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
		lending = new Lending();
		personDisabled = mock(Person.class);
		person = mock(Person.class);
		when(personDisabled.isGreaterThan18()).thenReturn(false);
		when(personDisabled.isHighSalary()).thenReturn(false);
		when(person.isGreaterThan18()).thenReturn(true);
		when(person.isHighSalary()).thenReturn(true);
		
		lending.setQuantityQuota(50);
		lending.setCapital(20020);
		lending.setInterestRate(30);
		lending.setId(1L);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetDni() {
		lending.setPerson(personDisabled);
		
	}
	
	@Test
	public void testSetPerson() {
		lending.setPerson(person);
		verify(person).isGreaterThan18();
		verify(person).isHighSalary();
	}
	


}
  