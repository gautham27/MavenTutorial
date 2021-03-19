package TechM;

import com.TechM.Library.LibraryFiles;
import com.TechM.Objects.ObjectMap;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test6_Alerts {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.out.println("started");
//        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//jars//geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//jars//chromedriver.exe");
//        System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//jars//IEDriverServer_64.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String appUrl = "http://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
        driver.get(appUrl);

        // create object of object map
        ObjectMap om = new ObjectMap(driver);
        LibraryFiles.waitForElement(driver, om.btnClickMe1, 10);
        om.btnClickMe1.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        System.out.println("ALERT TEXT AFTER SWITCHING IS " + alert.getText());
        alert.accept();
        Thread.sleep(3000);

        om.btnClickMe2.click();
        Thread.sleep(3000);
        alert = driver.switchTo().alert();
        System.out.println("ALERT TEXT AFTER SWITCHING IS " + alert.getText());
        alert.dismiss();

        om.btnClickMe3.click();
        Thread.sleep(3000);
        alert = driver.switchTo().alert();
        System.out.println("ALERT TEXT AFTER SWITCHING IS " + alert.getText());
        alert.sendKeys("Hello ALert");
        alert.accept();

    }

}
