package com.labcorp.actions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.labcorp.pages.ApplyJobPage;
import com.labcorp.utils.References;

public class ApplyJobDetailsPage extends ApplyJobPage {

	
	public ApplyJobDetailsPage(WebDriver driver) {
		super(driver);
	}

	public void verifyUserIsAtApplyJobDetailsPage()
	{
		Assert.assertEquals(driver.getTitle(),APPLYJOBPAGE_TITLE);
	}
	
	public void clickOnClosePopUp()
	{
		btnClosePopUp.click();
	}
	
	public void verifyUserNavigatedToCorrectJobDetails()
	{
		Assert.assertTrue(References.jobTitleVal.contains(valJobTitle.getText()));
		Assert.assertTrue(References.jobIdVal.contains(valJobId.getText().replace("#", "")));
		Assert.assertTrue(References.headerJobResponsibilitiesVal.contains(valHeaderJobResponsibilities.getText()));
		Assert.assertTrue(References.headerRequirementsVal.contains(valHeaderRequirements.getText()));
		Assert.assertTrue(References.txtRequirementDetailsVal.contains(valTxtRequirementDetails.getText()));
	}
	
	
	
	public void clickOnBackToJobSearch()
	{
		btnReturnToJobSearch.click();
	}
	
	

}
