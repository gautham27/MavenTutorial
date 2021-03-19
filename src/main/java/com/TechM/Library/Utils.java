package com.TechM.Library;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

;

public class Utils {

    public static ExtentReports extent;
    public static ExtentTest test;

    public File getScreenShot(WebDriver driver, String screenShoteName) throws IOException {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        File destFile = new File("screenshots/" + screenShoteName + "_" + timestamp + ".png");
        Files.copy(srcFile, destFile);
        Reporter.log("SCREENSHOT :: <a href='" + destFile + "'> <img_src='" + destFile + "' height='100', width='100' />" + screenShoteName + "</a>");
        return srcFile;
    }

    public void verifyElementPresent(WebDriver driver, WebElement ele, String screenShotName) throws IOException {
        try {
            Utils utils = new Utils();
            ele.isDisplayed();
//            utils.getScreenShot(driver, screenShotName);
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            String srcFile = scrShot.getScreenshotAs(OutputType.BASE64);

            test.info("Validating element in ghe page");
            test.pass("Element :" + screenShotName + " is present");
            test.addScreenCaptureFromBase64String(srcFile,screenShotName);
//            test.addScreenCaptureFromPath(Utils.takeScreenShot(driver, screenShotName));
            Reporter.log(screenShotName + "-----------------------is present in the page");
        } catch (Exception e) {
            test.fail(screenShotName + "  is not present or xpath for the element is not cotrrect");

            //Reporter.log(screenShotName +"  is not present in the page");
        }
    }

    public static String takeScreenShot(WebDriver driver, String screenShoteName) throws IOException {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        File destFile = new File("screenshots/" + screenShoteName + "_" + timestamp + ".png");
        Files.copy(srcFile, destFile);
        return destFile.getAbsolutePath();

    }
}
