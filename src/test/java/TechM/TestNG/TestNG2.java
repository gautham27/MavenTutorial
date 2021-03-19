package TechM.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {

	@Test //default enable=true
	public void test1() {
		Assert.assertEquals(true, true);
	}

	@Test(enabled = true)
	public void test2() {
		Assert.assertEquals(true, true);
	}

	@Test(enabled = true)
	public void test3() {
		Assert.assertEquals(true, false);
	}
	
	@Test(enabled = false)
	public void test4() {
		Assert.assertEquals(true, false);
	}


}
