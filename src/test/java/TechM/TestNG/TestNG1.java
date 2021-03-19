package TechM.TestNG;

import org.testng.annotations.*;

public class TestNG1 {
	
	@BeforeGroups("shopping")
	public void beforeGroups() {
		System.out.println("@BeforeGroups");
	}

	@AfterGroups("shopping")
	public void afterGroups() {
		System.out.println("@AfterGroups");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod \n");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod \n");
	}

	@Test(groups = "shopping")
	public void runTest1() {
		System.out.println("shopping group @Test - runTest1");

	}

	@Test(groups = "shopping")
	public void runTest2() {
		System.out.println("shopping group @Test - runTest2");
	}

	@Test
	public void runTest3() {
		System.out.println("@Test - runTest3");
	}

	@BeforeTest()
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}

	@AfterTest()
	public void afterTest() {
		System.out.println("@AfterTest");
	}

	@BeforeSuite()
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}
	@AfterSuite()
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}
}
