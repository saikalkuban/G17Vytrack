@gridSettings
Feature: User should be able to click Grid Settings button
  User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown on the left side,
  Refresh, Reset and Grid Settings Buttons on the right side

  @truckDriver
  Scenario Outline: Truck driver click Grid Settings Button
    Given truck driver enter below credentials
      | username | <user>      |
      | password | UserUser123 |
    And truck driver click on login button
    When truck driver hover over fleet module
    When truck driver click on vehicles
    And truck driver should see vehicles page
    Then truck driver should be able to click Grid Settings Button
    Examples:
      | user   |
      | user48 |
      | user49 |
      | user50 |