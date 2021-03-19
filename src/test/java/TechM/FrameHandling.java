package TechM;

import com.TechM.Objects.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FrameHandling {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("started");
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//jars//geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//jars//chromedriver.exe");
        System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//jars//IEDriverServer_64.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String appUrl = "https://demoqa.com/frames";
        driver.get(appUrl);

        // create object of object map
        ObjectMap om = new ObjectMap(driver);

        try {
            System.out.println("is element present under frame " + om.txtThisIsSamplePage.isDisplayed());
        } catch (Exception nse) {
            System.out.println("Element not found");
        }
        System.out.println("Switching to frame");
        driver.switchTo().frame(om.frmTop);
        System.out.println("is element present under frame " + om.txtThisIsSamplePage.isDisplayed());
        driver.switchTo().defaultContent();
        try {
            System.out.println("is element present under frame " + om.frmContent.isDisplayed());
            driver.switchTo().frame(om.frmContent);
            System.out.println("is element present under frame " + om.txtThisIsSamplePage.isDisplayed());
            System.out.println("is element present under frame " + om.frmTop.isDisplayed());

        } catch (Exception nse) {
            System.out.println("Element not found :: " + nse.getMessage());
        }
    }

}
