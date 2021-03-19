package TechM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//jars//geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "jars/chromedriver.exe");
//        System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//jars//IEDriverServer_64.exe");

        System.out.println("started");
//		WebDriver driver = new InternetExplorerDriver();
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        Thread.sleep(2000);
//        driver.get("http://www.DemoQA.com");
        driver.navigate().to("http://www.DemoQA.com");
//        System.out.println("Application title is =============" + driver.getTitle());
//        System.out.println("Application URL is =============" + driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.close();
//        driver.quit();
//

    }


}
