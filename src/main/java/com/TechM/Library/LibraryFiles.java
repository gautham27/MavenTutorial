package com.TechM.Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibraryFiles {

	public static boolean waitForElement(WebDriver driver, WebElement elm, int time)
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,time);
			wait.until(ExpectedConditions.visibilityOf(elm));
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
}
