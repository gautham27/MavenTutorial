package TechM.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {

	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void failedTC()
	{
		System.out.println("Executing failed tc");
		Assert.assertEquals(true, false);
	}
}
