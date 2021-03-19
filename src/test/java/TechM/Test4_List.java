package TechM;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test4_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("started");
		
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//jars//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//jars//chromedriver.exe");
//		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//jars//IEDriverServer_64.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String appUrl = "https://www.att.com/";
		driver.get(appUrl);
		Dimension d = new Dimension(500, 800);
		driver.manage().window().setSize(d);
//		List<WebElement> elms= driver.findElements(By.tagName("a"));
//		System.out.println(elms.size());
//		System.out.println(elms.get(1).getText());
//		System.out.println(elms.get(1).getTagName());
//		System.out.println(elms.get(1).isDisplayed());
//		int i=1;
//		for(WebElement e: elms)
//		{
//			System.out.println(i++ +" : "+ e.getText());
//		}
//
//		driver.quit();
	}

}
