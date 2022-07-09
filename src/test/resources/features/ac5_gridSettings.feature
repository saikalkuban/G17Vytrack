Feature: User should be able to click Grid Settings button

  User Story: As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown on the left side,
  Refresh, Reset and Grid Settings Buttons on the right side

  Accounts are: Truck Driver, Store Manager, Sales Manager

  Background:
    Given the user is on the login page
    When the user enters the username "user48"
    And the user enters the password "UserUser123"
    And the user clicks the login button
    Given the user is logged in and on Fleet Management page
    When the user clicks on Fleet module
    And the user clicks on Vehicles subcategory

  Scenario: Login as a Truck Driver

    Then the user should see Fleet Management page

  Scenario: Truck driver should land on Vehicles page

    Then the user should see the Vehicles page with Cars header

@gridSettings
  Scenario: Truck Driver clicks on Grid Settings button
    Given the user is on the Vehicles page
    When the user clicks on Grid Settings button
    Then the user should see the settings