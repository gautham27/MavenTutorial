package TechM.TestNG;

import org.testng.annotations.Test;

public class TestNG3 {
	@Test(timeOut = 5000) // time in mulliseconds
	public void test1() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("test-1");
	}

	@Test(timeOut = 1000)
	public void test2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("test-2");
	}
}
