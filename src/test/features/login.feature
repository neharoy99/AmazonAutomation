Feature: As a user
  I should be able to login

  @login
  Scenario: Validate user login with valid credentials

    Given I am on home page "https://www.amazon.co.uk"
    When I click on Sign in button
    And I enter a valid email address "tester_nehar@yahoo.com"
    And I click on continue button
    And I enter a valid password "Test@123"
    And I click on Sign In submit
    Then I should be on Amazon homepage with a message "Hello"