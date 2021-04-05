Feature: As a user
  I should be able to search and retrieve appropriate product

  @search
  Scenario: Validate the search with valid search term

    Given I am on home page "https://www.amazon.co.uk"
    When I enter a search term "Dresses"
    And I click on search Icon
    Then I should get appropriate results with result heading "Dresses"