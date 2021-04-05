Feature: As a user
  I should be able to add product to the basket

  @basket
  Scenario: Validate user is able to add a product in the basket

    Given I am on home page "https://www.amazon.co.uk"
    When I enter a search term "Dresses"
    And I click on search Icon
    And I click on the product I wish to add to the basket
    And I add to bag with colour not being mandatory
    Then I should see the product in bag
