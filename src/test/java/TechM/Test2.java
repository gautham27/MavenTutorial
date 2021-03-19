package TechM;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {

//		 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//jars//geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//jars//chromedriver.exe");
//         System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//jars//IEDriverServer_64.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(577, 768));
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Long.valueOf(20), TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//		String appUrl = "http://www.DemoQA.com";
//		driver.get(appUrl);
//
		WebElement elm=	driver.findElement(By.xpath("//div[@class='card mt-4 top-card']"));
//		elm.click();
//		Thread.sleep(3000);
//
//		System.out.println("Navigating back");
//		driver.navigate().back();
//		Thread.sleep(3000);
//
//		System.out.println("Going forward");
//		driver.navigate().forward();
//		Thread.sleep(3000);
//
//		driver.navigate().to(appUrl);
//		Thread.sleep(3000);
//
//		System.out.println("Refreshing");
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//
//		// Close browser
//		driver.quit();
////		driver.close();
    }

}
