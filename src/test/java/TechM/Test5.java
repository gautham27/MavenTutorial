package TechM;

import com.TechM.Library.LibraryFiles;
import com.TechM.Objects.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.out.println("started");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//jars//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//jars//chromedriver.exe");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//jars//IEDriverServer_64.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String appUrl = "http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html";
		driver.get(appUrl);

		//create object of object map
		ObjectMap om= new ObjectMap(driver);
		
		LibraryFiles.waitForElement(driver, om.lstForm, 10);
		
		
//		Select lst= new Select(om.lstForm);
//		lst.selectByValue("Sunday");
//		Thread.sleep(2000);
//		lst.selectByIndex(4);
//		Thread.sleep(2000);
//		lst.selectByVisibleText("Friday");
//		Thread.sleep(2000);
		
		
		Select lst2= new Select(om.lstMultiSelect);
		System.out.println("is Multi select ? "+lst2.isMultiple());
		lst2.selectByValue("Ohio");
		Thread.sleep(2000);
		lst2.selectByIndex(6);
		Thread.sleep(2000);
		lst2.selectByVisibleText("California");
		Thread.sleep(2000);
		lst2.deselectByIndex(6);
		Thread.sleep(2000);
		lst2.deselectByValue("Ohio");
		Thread.sleep(2000);
		lst2.deselectByVisibleText("California");
		
		
		driver.close();
		
	}

}
