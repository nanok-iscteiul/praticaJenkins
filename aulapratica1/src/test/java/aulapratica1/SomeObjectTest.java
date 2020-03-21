package aulapratica1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SomeObjectTest {
	SomeObject so;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		so = new SomeObject();
	}

	@Test
	public void testSomeObject() {
		so = new SomeObject();
	}

	@Test
	public void testSum_numbers() {
		assertEquals(5,so.sum_numbers(3, 2));
	}

}
