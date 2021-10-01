package com.labcorp.stepDefinitions;

import com.labcorp.actions.ApplyJobDetailsPage;
import com.labcorp.actions.CareerPageActions;
import com.labcorp.actions.HomePageActions;
import com.labcorp.actions.JobDetailsPageActions;
import com.labcorp.utils.References;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplyJobStepDef {
	
	HomePageActions homePageActions = new HomePageActions(References.driver);
	CareerPageActions careerPageActions = new CareerPageActions(References.driver);
	JobDetailsPageActions jobDetailsPageActions = new JobDetailsPageActions(References.driver);
	ApplyJobDetailsPage applyJobDetailsPage = new ApplyJobDetailsPage(References.driver);

	
	@Given("user is at labcorp home page")
	public void user_is_at_labcorp_home_page() {
	   homePageActions.verifyUserIsAtHomePage();
	}

	@When("user clicks on careers link and switch tab to access career page")
	public void user_clicks_on_careers_link_and_switch_tab_to_access_career_page() {
	   homePageActions.navigateToCareersPage();
	}

	@Then("user should be at career page")
	public void user_should_be_at_career_page() {
		careerPageActions.verifyUserIsAtCareerPage();
	}

	@When("user search for job with job title as {string} and location as {string} at career page")
	public void user_search_for_job_with_job_title_as_and_location_as_at_career_page(String jobTitle, String jobLocation) {
		careerPageActions.searchJob(jobTitle, jobLocation);
	}

	@Then("user should see search result matching job title as {string} and location as {string}")
	public void user_should_see_search_result_matching_job_title_as_and_location_as(String jobTitle, String jobLocation) {
		careerPageActions.verifySearchResultAsPerSearchCriteria(jobTitle, jobLocation);
	}
	
	@Then("user verifies the count of search result shown in header")
	public void verifySearchResultCountWithHeaderInfo()
	{
		careerPageActions.verifySearchResultCountWithHeaderInfo();
	}

	@When("user clicks on first job link from search results")
	public void user_clicks_on_first_job_link_from_search_results() {
		careerPageActions.clickOnFirstJob();
	}

	@Then("user should be navigated to job details page for {string}")
	public void user_should_be_navigated_to_job_details_page(String jobTitle) {//Need to change the step in feature file for passing jobTitle
		jobDetailsPageActions.verifyUserIsAtJobDetailsPage(jobTitle);
	}

	@Then("user verifies job details matching job title as {string}")
	public void user_verifies_job_details_matching_job_title(String jobTitle) {
		jobDetailsPageActions.verifyUserNavigatedToCorrectJobDetails(jobTitle);
	
	}
	
	@Then("user fetches job title, job location and job id from job details page")
	public void fetchJobTitleLocationAndId()
	{
		jobDetailsPageActions.getJobTitleLocationAndId();
	}

	@When("user clicks on apply now button")
	public void user_clicks_on_apply_now_button() {
		jobDetailsPageActions.clickOnApplyJob();
	}

	@Then("user should be navigated to apply job page")
	public void user_should_be_navigated_to_apply_job_page() {
		applyJobDetailsPage.clickOnClosePopUp();
		applyJobDetailsPage.verifyUserIsAtApplyJobDetailsPage();
	}

	@Then("user verifies applying job details matching as job details page")
	public void user_verifies_job_details_matching_job_title_as_and_location_as_at_apply_job_page() {
		applyJobDetailsPage.verifyUserNavigatedToCorrectJobDetails();
	}

	@When("user clicks on return to search result")
	public void user_clicks_on_return_to_search_result() {
		applyJobDetailsPage.clickOnBackToJobSearch();
	}

}
