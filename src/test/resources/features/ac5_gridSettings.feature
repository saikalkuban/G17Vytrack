Feature:User should be able to click the reset button

  Background:
    Given the user is on the login page
    When the user is logged in and on Fleet Management page
    And the user clicks on Fleet module
    And the user clicks on Vehicles subcategory
    And the user should see the Vehicles page with Cars header

  @resetButton
  Scenario: Truck driver clicks reset button
    And the user should be able to reset the page
    Then the reset button should be displayed

