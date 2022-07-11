Feature: User should be able to click Grid Setting button

  Background:
    Given the user is logged in and on Fleet Management page
    When the user clicks on Fleet module
    And the user clicks on Vehicles subcategory




  Scenario: Truck Driver should land on Vehicles page
    Then the user should see the Vehicles page with Cars header


  @gridSettings
  Scenario: Truck driver clicks on grid setting

    When the user should be able to click Grid Setting button
    Then the Grid Settings button should be displayed

