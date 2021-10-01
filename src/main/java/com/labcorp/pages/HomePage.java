package com.labcorp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		wait = new WebDriverWait(driver, 60);
	}
	
	public String HOMEPAGE_TITLE = "Labcorp | Global Life Sciences Leader in Diagnostics and Drug Development";
	
	@FindBy(xpath ="(//a[contains(text(),'Careers')])[1]")
	public WebElement lnkCareers;

}
