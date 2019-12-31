Feature: log in as different user types
  @wip
  Scenario: login as costumer
    Given the user is on login page
    When the user logs in with "imm10@info.com" and "inventorymanager"
    Then user should be able to log in
    Then user should be able to click on Inventory module
    Then user should be able to click Reordering Rules
