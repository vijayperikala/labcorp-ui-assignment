package com.labcorp.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareersPage extends PageBase {
	
	public CareersPage(WebDriver driver)
	{
		super(driver);
		wait = new WebDriverWait(driver, 60);
	}
	
	public String CAREERSPAGE_TITLE = "Working at Labcorp | Jobs and Careers at Labcorp";
	public String customLocForSearchedLocation = "//ul[contains(@id,'search-location')]//li/a[text()='%location%']";
	public String customLocForSearchedJobTitle = "//h3[text()='Jobs By Title']/..//ul/li/a[@data-job-title ='%jobTitle%']";
	
	@FindBy(xpath="//input[@type='search']")
	public WebElement txtBoxSearch;

	@FindBy(xpath = "//input[@class='search-location']")
	public WebElement txtBoxSearchLocation;
	
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement btnSubmit;
	
	@FindBy(xpath = "//section//h1")
	public WebElement searchResultHeader;
	
	@FindBy(xpath = "//section[@id='search-results-list']/ul//li")
	public List<WebElement> allSearchResults;
	
}
