package TechM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Test7_DragDrop {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.out.println("started");
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//jars//geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//jars//chromedriver.exe");
        System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//jars//IEDriverServer_64.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.get("http://demo.guru99.com/test/drag_drop.html");
//        Thread.sleep(3000);
//        WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));
//        WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));
//        Actions act = new Actions(driver);
//
//        //Dragged and dropped.
//        act.dragAndDrop(From, To).build().perform();

//        Thread.sleep(2000);
        String baseUrl = "http://www.facebook.com/";

        driver.get(baseUrl);
        WebElement txtUsername = driver.findElement(By.id("email"));

        Actions builder = new Actions(driver);
        builder
                .moveToElement(txtUsername)
                .click()
                .keyDown(txtUsername, Keys.SHIFT)
                .sendKeys(txtUsername, "hello")
                .keyUp(txtUsername, Keys.SHIFT)
                .doubleClick(txtUsername)
                .contextClick()
                .sendKeys(Keys.chord(Keys.TAB, "MY PASSWORD", Keys.TAB, Keys.ENTER))
                .build()
                .perform();

    }

}
