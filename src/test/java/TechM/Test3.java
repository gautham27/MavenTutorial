package TechM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//jars//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//jars//chromedriver.exe");
//		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//jars//IEDriverServer_64.exe");

		System.out.println("started");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String appUrl = "https://www.att.com/";
		driver.get(appUrl);

		// h2
		// a[id='z1-profile-cta'] == a#z1-profile-cta == z1-profile-cta ==
		// id('z1-profile-cta')
		WebElement elm;
		elm = driver.findElement(By.tagName("a"));
		System.out.println("Header text is " + elm.getText());
		
		elm = driver.findElement(By.id("z1-support"));
		System.out.println("identified using id locator " + elm.isDisplayed());
		
		//tagName[attributeName='attributeValue'] or #idValue  or .className
		elm = driver.findElement(By.cssSelector("div[id='z1-support']"));
		System.out.println("identified using css locator 1 and title value is : " + elm.isDisplayed());


		elm = driver.findElement(By.cssSelector("div#z1-support"));
		System.out.println("identified using css locator 2 and tagname is : " + elm.getTagName());
	
		elm = driver.findElement(By.xpath("//img[@alt='devices']"));
		System.out.println("identified using xpath locator 1 : " + elm.isDisplayed());
	
		elm = driver.findElement(By.xpath("//div[contains(text(),'Upgrade')]"));
		System.out.println("is elemented selected : " + elm.getText());

		elm = driver.findElement(By.xpath("//a[contains(@aria-label,'Learn more')]"));
		System.out.println("is elemented selected : " + elm.getText());

		elm=driver.findElement(By.linkText("See full offer details"));
		System.out.println("link text is "+elm.getText());
		
		elm=driver.findElement(By.partialLinkText("offer details"));
		System.out.println("partial link text is "+elm.getText());
		
		elm=driver.findElement(By.className("z1-support-link z1-link"));
		System.out.println("element tag name is "+elm.getTagName());
		
		driver.quit();


		//TAGNAME[text()='TEXTVALUE']  //TAGNAME[contains(@ATTRIBUTENAME,'ATTRIBUTEVALUE')]
	}

}
