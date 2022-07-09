
Feature: User should be able to click Export Grid dropdown

  Background:
    Given the user is logged in and on Fleet Management page
    When the user clicks on Fleet module
    And the user clicks on Vehicles subcategory




  Scenario: Truck Driver should land on Vehicles page
    Then the user should see the Vehicles page with Cars header

  @wip
  Scenario: Truck Driver clicks on Export Grid dropdown
    When the user clicks on the Export Grid dropdown
    Then the user should see the dropdown options



