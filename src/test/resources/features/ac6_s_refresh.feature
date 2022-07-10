Feature: User should be able to click refresh button
  @truckdriver @driver
  Scenario Outline: Truck driver click refresh button
    Given truck driver enter below credentials
      | username  | <user>      |
      | password | UserUser123 |
    And truck driver click on login button
    When truck driver hover over fleet module
    When truck driver click on vehicles
    And truck driver should see vehicles page
    Then truck driver should be able to refresh the page
    Examples:
      | user     |
      | user48   |
      | user49 |
      | user50 |
  @salesmanager @driver
  Scenario Outline: Sales manager click refresh button
    Given Sales manager enter below credentials
      | username  | <salesmanager>      |
      | password | UserUser123 |
    And Sales manager click on login button
    When Sales manager hover over fleet module
    When Sales manager click on vehicles
    And Sales manager should see vehicles page
    Then Sales manager should be able to refresh the page
    Examples:
      | salesmanager     |
      | salesmanager149   |
      | salesmanager150   |
  @storemanager @driver
  Scenario Outline: Store manager click refresh button
    Given Store manager enter below credentials
      | username  | <storemanager>      |
      | password | UserUser123 |
    And Store manager click on login button
    When Store manager hover over fleet module
    When Store manager click on vehicles
    And Store manager should see vehicles page
    Then Store manager should be able to refresh the page
    Examples:
      | storemanager     |
      | storemanager83   |
      | storemanager84   |
      | storemanager245   |