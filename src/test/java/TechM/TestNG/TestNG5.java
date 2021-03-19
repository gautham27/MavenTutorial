package TechM.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG5 {
	WebDriver driver = null;

	@Parameters({ "browser", "url" })
	@Test
	public void getParameters(String browser, String url) {
		System.out.println("Browser value is " + url);
		System.out.println("url value is " + browser);
		switch (browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//jars//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			break;

		case "Firefox":
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//jars//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			break;

		default:
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//jars//IEDriverServer_64.exe");
			driver = new InternetExplorerDriver();
			driver.get(url);
			break;
		}
	}


}
