package TechM;


import com.TechM.Library.Utils;
import com.TechM.Objects.She_Jobs_HomePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SheJobs_testcase1 {
    Utils utils = new Utils();
    ExtentReports extent = new ExtentReports();
    ExtentTest test;

    @BeforeTest
    public void beforeTest(ITestContext testContext) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
        String folderNameWithTimeStamp = df.format(new Date());

        ExtentSparkReporter spark = new ExtentSparkReporter("Reports/" + folderNameWithTimeStamp + ".html");
        extent.attachReporter(spark);
        extent = new ExtentReports();
        extent.attachReporter(spark);
        test = extent.createTest(testContext.getName(), "Sample Test case");

        Utils.extent = extent;
        Utils.test = test;
    }

    @Test
    public void sheJobsHomePage(ITestContext testContext) throws IOException {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.she-jobs.com");

        She_Jobs_HomePage sheJobsHomePage = new She_Jobs_HomePage(driver);
        PageFactory.initElements(driver, sheJobsHomePage);

        utils.verifyElementPresent(driver, sheJobsHomePage.sheJobs_logo, "sheJobsHomePage.sheJobs_logo");
        utils.verifyElementPresent(driver, sheJobsHomePage.jobLocation, "sheJobsHomePage.jobLocation");
        utils.verifyElementPresent(driver, sheJobsHomePage.jobsLink, "sheJobsHomePage.jobsLink");


    }

    @AfterTest
    public void afterTest(){
        extent.flush();
    }

}
