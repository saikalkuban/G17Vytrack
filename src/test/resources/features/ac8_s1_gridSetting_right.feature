Feature: Export Grid dropdown is on the left of the page

  Background:
    Given the user is logged in and on Fleet Management page
    When the user clicks on Fleet module
    And the user clicks on Vehicles subcategory

  Scenario: Truck Driver should land on Vehicles page
    Then the user should see the Vehicles page with Cars header

  @wipAzamat
  Scenario: Truck Driver verifies that the Grid Settings button is on the right of the page
    Then the user verifies that the Grid Settings button is on the right of the page
