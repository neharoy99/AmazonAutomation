Feature: As a user
  I should be able to traverse through the drop down hamburger menu

  @HamburgMenu
 Scenario Outline: Validate the user is able to successfully traverse through the drop down menu
  and directed to appropriate product page

    Given I am on home page "https://www.amazon.co.uk"
    When I click on the drop down Hamburger menu
    And I click on the appropriate menu option "<menu>"
    And I click on the appropriate sub menu option "<submenu>"
    Then I am directed to appropriate product page "<resultTitle>"

    Examples:

    | menu | submenu | resultTitle|
    |Prime Video |Rent or Buy|Prime Video|
    |Books       |Children's Books| Children's Books|
    |Sports and Outdoors| Winter Sports|Winter Sports|
    |Electronics & Computers|Headphones| Headphones & Earphones|
