package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Assertions {

	// 1. assertEquals() - Asserts that two Strings are equal. If they are not, an
	// AssertionError is thrown.
	@Test
	public void test1() {
		Reporter.log("running test1 method", true);
		String expResult = "good morning";
		String actResult = "good morning";

		Assert.assertEquals(actResult, expResult, "act & exp result is not equal");
	}

	// 2. assertNotEquals
	@Test
	public void test2() {
		Reporter.log("running test2 method", true);
		String expResult = "good morning";
		String actResult = "good night";

		Assert.assertNotEquals(actResult, expResult, "act & exp result is equal");
	}

	// 3. assertTrue
	@Test
	public void test3() {
		Reporter.log("running test3 method", true);
		boolean result = true;

		Assert.assertTrue(result, "result is false");

	}

	// 3. assertFalse
	@Test
	public void test4() {
		Reporter.log("running test4 method", true);
		boolean result = false;

		Assert.assertFalse(result, "result is true");

	}

	// 3. assertNull
	@Test
	public void test5() {
		Reporter.log("running test5 method", true);
		String actResult = null;

		Assert.assertNull(actResult, "act result is not null");

	}

	// 6. assertNotNull
	@Test
	public void test6() {
		Reporter.log("running test6 method", true);
		String actResult = "good morning";

		Assert.assertNotNull(actResult, "act result is null");

	}

	// 7. Fail - Fails a test with no message.
	@Test
	public void test7() {
		Reporter.log("running test7 method", true);
        Assert.fail();
	}

}
