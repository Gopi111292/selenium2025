Feature: Form Submission

  Scenario: User fills and submits the form
    Given user is on the practice form page
    When user fills the form with valid data
    And user submits the form
    Then form should be submitted successfully