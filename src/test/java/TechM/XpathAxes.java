package TechM;

import com.TechM.Library.LibraryFiles;
import com.TechM.Objects.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//referene URL: https://www.w3schools.com/xml/xpath_axes.asp
public class XpathAxes {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("started");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//jars//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//jars//chromedriver.exe");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//jars//IEDriverServer_64.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String appUrl = "http://www.seleniumeasy.com/test/basic-first-form-demo.html";
		driver.get(appUrl);

		//create object of object map
		ObjectMap om= new ObjectMap(driver);
		LibraryFiles.waitForElement(driver, om.edtUserMessage_1, 10);
		
		System.out.println("Entering text");
		om.edtUserMessage_1.sendKeys("Welcome to Selenium training");
		om.btnShowMessage.click();
		Thread.sleep(3000);
		System.out.println("Clearing text");
		om.edtUserMessage_1.clear();
		Thread.sleep(3000);
		driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		LibraryFiles.waitForElement(driver, om.rdbMale, 20);
		om.rdbMale.click();
		System.out.println("is male radio button selected? "+om.rdbMale.isSelected());
		System.out.println("is female radio button selected? "+om.rdbFemale.isSelected());
	}
	
}
