Feature: log in as different users

  Background:
    Given the user is on login page
@inventoryManager
  Scenario: login as costumer

    When the user logs in with "imm10@info.com" and "inventorymanager"
    Then user should be able to log in
    Then user should be able to click on Inventory module
    Then user should be able to click Reordering Rules


  @login
  Scenario Outline: Login as many given users
    When the user logs in using following credentials
      | Username | <username> |
      | Password | <password> |
    Then user should be able to log in

    Examples:
      | username                    | password         |
      | eventscrmmanager12@info.com | eventscrmmanager |
      | posmanager65@info.com       | posmanager       |
      | imm10@info.com              | inventorymanager |




