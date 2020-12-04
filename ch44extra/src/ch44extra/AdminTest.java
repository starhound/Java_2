package ch44extra;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdminTest {
	// create Admin instance
	Admin ceo = new Admin("M.Scott",LocalDate.of(2002, 3, 22),1001,"mgt","Manager",120000);
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetDept() {
		String expected = "mgt";
		String actual = ceo.getDept();
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetOffice() {
		String expected = "Manager";
		String actual = ceo.getOffice();
		assertTrue(expected.equals(actual));
		//fail("Not yet implemented");
	}

	@Test
	public void testGetSalary() {
		double expected = 120000;
		double actual = ceo.getSalary();
		assertEquals(expected,actual,0.0001);
		//fail("Not yet implemented");
	}

}
