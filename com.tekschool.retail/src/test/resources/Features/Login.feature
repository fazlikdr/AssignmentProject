@LoginRegression  @CompleteTest
Feature: Login to Retail Website 


Background: 
	Given User is on Retail website 
	And User click  on MyAccount
	
	
@login @SmokeTest 
Scenario: Login to MyAccount 

	When  User click on Login 
	And User enter username 'sdet@tekschool.us' and password 'sdet' 
	And User click on Login button 
	Then User should be logged in to MyAccount dashboard 
	
	

	
@MultipleUserLogin 
Scenario Outline: Login to Retail Site with multiple users 


	When User click on Login 
	And User enter username '<userName>' and password '<password>' 
	And User click on Login button 
	Then User should be logged in to MyAccount dashboard 
	
	Examples: 
		|userName|password|
		|sdet@tekschool.us|sdet|
		|consumer@tekschool.us|JBond|
		|students@tekschool.us|TEST|
		
		

	
