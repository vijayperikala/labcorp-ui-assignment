Feature: Apply Jobs 

@LABCORP_UI_TEST
Scenario Outline: User should be able to apply for a job on career portal 
	Given user is at labcorp home page 
	When user clicks on careers link and switch tab to access career page 
	Then user should be at career page 
	When user search for job with job title as "<jobTitle>" and location as "<location>" at career page 
	Then user should see search result matching job title as "<jobTitle>" and location as "<location>" 
	And user verifies the count of search result shown in header 
	When user clicks on first job link from search results 
	Then user should be navigated to job details page for "<jobTitle>"
	And user verifies job details matching job title as "<jobTitle>"
	And user fetches job title, job location and job id from job details page
	When user clicks on apply now button 
	Then user should be navigated to apply job page 
	And user verifies applying job details matching as job details page
	When user clicks on return to search result 
	
	Examples: 
		|jobTitle				|location 		|
		|Quality Analyst		|Connecticut, US|