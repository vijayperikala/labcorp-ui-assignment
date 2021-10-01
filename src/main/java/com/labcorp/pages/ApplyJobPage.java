package com.labcorp.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplyJobPage extends PageBase {
	
	public ApplyJobPage(WebDriver driver)
	{
		super(driver);
		wait = new WebDriverWait(driver, 60);
	}
	
	public String APPLYJOBPAGE_TITLE = "Career Site - Self Service";
	
	
	@FindBy(xpath = "//button[contains(@class,'closebutton')]")
	public WebElement btnClosePopUp;
	
	@FindBy(xpath = "//span[@class='jobTitle job-detail-title']")
	public WebElement valJobTitle;
	
	@FindBy(xpath = "//span[@class='resultfootervalue']")
	public WebElement valJobLocation;
	
	@FindBy(xpath = "//span[@class='jobnum']")
	public WebElement valJobId;
	
	@FindBy(xpath = "//p[text()='Job Responsibilities:']")
	public WebElement valHeaderJobResponsibilities;
	
	@FindBy(xpath = "//div[text()='Requirements']")
	public WebElement valHeaderRequirements;
	
	@FindBy(xpath = "//li[text()='Quality experience is a plus!']")
	public WebElement valTxtRequirementDetails;
	
	@FindBy(xpath = "//span[text()='Return to Job Search']")
	public WebElement btnReturnToJobSearch;
}
