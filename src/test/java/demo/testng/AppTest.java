package demo.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	public AppTest() {
	}

	@Test
	public void testEquals() {

		Assert.assertEquals(10, 10, "10 = 10 ?");
	}

	@Test
	public void testApp() {
		Assert.assertTrue(true);
	}
}
