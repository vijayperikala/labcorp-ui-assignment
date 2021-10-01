package com.labcorp.actions;

import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.labcorp.pages.CareersPage;
import com.labcorp.pages.HomePage;
import com.labcorp.pages.JobDetailsPage;
import com.labcorp.utils.References;

public class JobDetailsPageActions extends JobDetailsPage {
	


	
	public JobDetailsPageActions(WebDriver driver) {
		super(driver);
	}

	public void verifyUserIsAtJobDetailsPage(String jobTitle)
	{
		Assert.assertEquals(driver.getTitle(),JOBDETAILS_TITLE.replace("<jobTitle>", jobTitle));
	}
	
	public void verifyUserNavigatedToCorrectJobDetails(String expectedJobTitle)
	{
		Assert.assertEquals(jobTitle.getText(), expectedJobTitle);
		
	}
	
	public void verifyJObDetailsContainsExpectedHeaders()
	{
		Assert.assertTrue(hdrRequirements.isDisplayed());
		Assert.assertTrue(hdrResponsabilities.isDisplayed());
		Assert.assertTrue(btnApplyNowBottom.isDisplayed());
		Assert.assertTrue(btnApplyNowTop.isDisplayed());
	}
	
	public void clickOnApplyJob()
	{
		btnApplyNowTop.click();
	}
	
	public void getJobTitleLocationAndId()
	{
		References.jobIdVal = jobId.getText();
		References.jobTitleVal = jobTitle.getText();
		References.jobLocationVal = jobLocation.getText();
		References.headerJobResponsibilitiesVal = headerJobResponsibilities.getText();
		References.headerRequirementsVal = headerRequirements.getText();
		References.txtRequirementDetailsVal = txtRequirementDetails.getText();
		
	}

}
