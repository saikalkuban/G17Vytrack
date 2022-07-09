
Feature: User should be able to click Export Grid dropdown


  @login @truck_driver
  Scenario: Login as a Truck Driver
    Given the user is on the login page
    When the user enters the username "user48"
    And the user enters the password "UserUser123"
    And the user clicks the login button
    Then the user should see Fleet Management page







#  @login @store_manager
#  Scenario: Login as a Truck Driver
#    Given the user is on the login page
#    When the user enters the username "storemanager83"
#    And the user enters the password "UserUser123"
#    And the user clicks the login button
#    Then the user should see Fleet Management page


