Feature: As a user
  I should be able to traverse through the menu and submenu

  @menu
  Scenario Outline: Validate the user is able to successfully traverse through the menu and submenu
  and directed to appropriate product page

    Given I am on home page "https://www.amazon.co.uk"
    When I click on the menu option "<menu>"
    Then I am directed to appropriate page of product "<resultantPage>"

    Examples:
    |menu|resultantPage|
    |Beauty|Beauty     |
    |Books |Books      |