package TechM.TestNG;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class check {


    @BeforeTest
    public void beforeTest() {
        System.out.println("before test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
    }

    @Test
    public void Test1(ITestContext testContext) {
        System.out.println("test name is " + testContext.getName());
        sampleMethod();
    }

    @Test
    public void Test2() {
        System.out.println("test 2");
        sampleMethod();
        sampleMethod();
        sampleMethod();
    }

    public void sampleMethod() {
        System.out.println("SAMPLE METHOD");
    }
}
