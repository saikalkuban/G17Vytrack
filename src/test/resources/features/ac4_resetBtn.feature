@resetButton
Feature:User should be able to click the reset button

Background:
  Scenario: Truck driver login the main page
    Given the user is on the login page
    When the user is logged in and on Fleet Management page
    And the user clicks on Fleet module
    And the user clicks on Vehicles subcategory
    Then the user should see the Vehicles page with Cars header


    Scenario: Truck driver clicks reset button
    When the user should be able to reset the page
    Then the reset button should be displayed
