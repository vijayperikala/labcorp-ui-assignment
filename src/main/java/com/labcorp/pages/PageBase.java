package com.labcorp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

}
