Feature: Login functionality

	Scenario: successful login
		Given User is on the login Page
		When User enters valid credentials "testuser11@gmail.com" and "password123"	
		Then User should be logged in successful
		