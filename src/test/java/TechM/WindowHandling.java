package TechM;

import com.TechM.Objects.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandling {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.out.println("started");
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//jars//geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//jars//chromedriver.exe");
        System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//jars//IEDriverServer_64.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String appUrl = "http://www.seleniumframework.com/Practiceform/";
        driver.get(appUrl);

        // create object of object map
        ObjectMap om = new ObjectMap(driver);
        om.btnNewBrowserWindow.click();
        Thread.sleep(4000);
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        Set<String> winHandles = driver.getWindowHandles();

        for (String str : winHandles) {
            driver.switchTo().window(str);
            System.out.println(" URL :" + driver.getCurrentUrl());
        }
//        driver.switchTo().window(parentWindow);
        System.out.println(" URL :" + driver.getCurrentUrl());

        driver.close();
//        driver.quit();
    }
}
