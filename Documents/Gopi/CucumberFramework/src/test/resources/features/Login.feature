Feature: Login functionality

	Background:
		Given User is on the login Page
	
	Scenario Outline: Sucessful login with valid credentials
			When User enters valid credentials "<username>" and "<password>"						
			Then User should be logged in successful
			
	Examples:
			|username  						  | password  |
			|testuser11@gmail.com   |password123|
			|testuser11@gmail.com   |password123|
			
		
	Scenario: Login with incorrect password
		When User enters invalid credentials "testuser@gmail.com" and "password123"	
    Then User should see an error message		