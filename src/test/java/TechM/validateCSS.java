package TechM;

import com.TechM.Objects.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import java.util.concurrent.TimeUnit;

public class validateCSS {

    public static void main(String[] args) {
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
        String clr = om.btnNewBrowserWindow.getCssValue("background-color");
        System.out.println(clr);
        System.out.println(clr.equals("rgba(0, 100, 0, 1)"));
        System.out.println("HEX value is " + Color.fromString(clr).asHex());
        System.out.println("HEX value is " + Color.fromString(clr).asRgb());
        System.out.println("HEX value is " + Color.fromString(clr).toString());

        System.out.println(om.btnNewBrowserWindow.getCssValue("padding-left"));
        System.out.println(om.btnNewBrowserWindow.getCssValue("padding-left"));
        System.out.println(om.btnNewBrowserWindow.getCssValue("border-radius"));

//		driver.close();
    }

}
