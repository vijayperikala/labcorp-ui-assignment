package com.labcorp.actions;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.labcorp.pages.HomePage;

public class HomePageActions extends HomePage {

	
	public HomePageActions(WebDriver driver) {
		super(driver);
	}

	public void verifyUserIsAtHomePage()
	{
		Assert.assertEquals(driver.getTitle(),HOMEPAGE_TITLE);
	}
	
	public void navigateToCareersPage()
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lnkCareers);
		lnkCareers.click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindowHandle = driver.getWindowHandles();
		for(String s : allWindowHandle)
		{
			if(!s.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(s);
				break;
			}
		}
		
	}

}
