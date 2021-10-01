package com.labcorp.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobDetailsPage extends PageBase {
	
	public JobDetailsPage(WebDriver driver)
	{
		super(driver);
		wait = new WebDriverWait(driver, 60);
	}
	
	public String JOBDETAILS_TITLE = "<jobTitle> at Labcorp";
	
	
	@FindBy(className = "job-description__heading")
	public WebElement jobTitle;
	
	@FindBy(xpath = "//span[@class='job-location job-info']")
	public WebElement jobLocation;
	
	@FindBy(xpath = "//span[@class='job-id job-info']")
	public WebElement jobId;
	
	@FindBy(xpath = "//a[contains(@class,'job-apply bottom')]")
	public WebElement btnApplyNowBottom;
	
	@FindBy(xpath = "//a[contains(@class,'job-apply top')]")
	public WebElement btnApplyNowTop;
	

	@FindBy(xpath = "//strong[text()='Job Duties/Responsibilities:']")
	public WebElement hdrResponsabilities;
	
	@FindBy(xpath = "//h3[text()='Requirements']")
	public WebElement hdrRequirements;
	
	@FindBy(xpath = "//h3[text()='Shift']/..//div//span")
	public WebElement shiftSchedule;
	
	@FindBy(xpath = "//p[text()='Job Responsibilities:']")
	public WebElement headerJobResponsibilities;
	
	@FindBy(xpath = "//h3[text()='Requirements']")
	public WebElement headerRequirements;
	
	@FindBy(xpath = "//li[text()='Quality experience is a plus!']")
	public WebElement txtRequirementDetails;
	

}
