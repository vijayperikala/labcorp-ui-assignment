package com.labcorp.actions;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.labcorp.pages.CareersPage;

public class CareerPageActions extends CareersPage {

	
	public CareerPageActions(WebDriver driver) {
		super(driver);
	}

	public void verifyUserIsAtCareerPage()
	{
		Assert.assertEquals(driver.getTitle(),CAREERSPAGE_TITLE);
	}
	
	public void searchJob(String jobTitle, String location)
	{
		txtBoxSearch.clear();
		txtBoxSearch.sendKeys(jobTitle);
		driver.findElement(By.xpath(customLocForSearchedJobTitle.replace("%jobTitle%", jobTitle))).click();
		
		txtBoxSearchLocation.clear();
		txtBoxSearchLocation.sendKeys(location);
		driver.findElement(By.xpath(customLocForSearchedLocation.replace("%location%", location))).click();
//		
		btnSubmit.click();
		wait.ignoring(StaleElementReferenceException.class);
		wait.until(new Function<WebDriver, Boolean>() {
		     public Boolean apply(WebDriver driver) {
		       return searchResultHeader.isDisplayed();
		     }
		   });
	}
	
	public void verifySearchResultCountWithHeaderInfo()
	{
		int countInHeader = Integer.parseInt(searchResultHeader.getText().split(" ")[0]);
		int actualCount = allSearchResults.size();
		Assert.assertEquals(actualCount, countInHeader);
	}
	
	public void verifySearchResultAsPerSearchCriteria(String jobTitle, String location)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", allSearchResults.get(0));
		
		allSearchResults.stream().forEach(result -> {
			String jobText = result.getText().toLowerCase();
			jobText.contains(jobTitle);
			jobText.contains(location);
		});
	}
	
	public void clickOnFirstJob()
	{
		allSearchResults.get(0).click();
	}

}
