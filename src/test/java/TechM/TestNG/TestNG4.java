package TechM.TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNG4 {
	@BeforeGroups("pass")
	public void beforePassGroup() {
		System.out.println("before pass group");
	}
	
	@AfterGroups("pass")
	public void afterPassGroup() {
		System.out.println("after pass group");
	}
	
	@Test(groups= "fail")
	public void failTC1() {
		System.out.println("failed tc 1");
		Assert.assertEquals(true, false);
	}

	@Test(groups= "fail")
	public void failTC2() {
		System.out.println("failed tc 2");
	}
	
	@Test(groups = {"pass"})
	public void passTC1() {
		System.out.println("passed tc 1");
	}

	@Test(groups = "pass")
	public void passTC2() {
		System.out.println("passed tc 2");
	}
	
	@Test(dependsOnGroups = {"pass","fail"})
	public void runFinal() {
		System.out.println("runFinal");
	}
}
