@retailPage
Feature: Retail Website Features 



Background: 
	Given User is on Retail website 
	
	
	
@Test 
Scenario: Search functionality Test case 
	When User search for 'iphone' 
	And User click on search button 
	Then User should see Iphone image 
	
	
	
Scenario Outline: Test Search Functionality with multiple set of Data 
	When User search for '<itemName>' 
	And User click on search button 
	
	
	Examples: 
		|itemName|
		|iphone|
		|mac book|
		|Canon|
		
		
@RegisterTest
Scenario: Register an Account test case
		When User click  on MyAccount
		And User click on Register option
		And User fill the Registration form with Below information
		|firstName|lastName|email|telephone|password|confirmPassword|subscribe|
		|Alex|Sokolova|raazebratt@gmail.com|1012026633|test|test|no|
		And User accept the privacy and policy 
		And User click on Continue button
		Then User should be registered in Retail Website
		
		
		

		
		
		
		
		
		
		
		
