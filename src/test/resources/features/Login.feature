@wip
Feature:Login as different user types


    Scenario: Login as a eventsManager user
        Given the user is on the login page
        When the user logs in using "eventscrmmanager24@info.com" and "eventscrmmanager"
        Then the user should be able to login
        And the title should contain "CRM"

#    Scenario: Login as a sales manager
#        Given the user is on the login page
#        When user logs in using "salesmanager10@info.com" and "salesmanager"
#        Then the user should be able to login
#        And the title should contain "CRM"
#
#
#    Scenario: Login as a expense manager
#        Given the user is on the login page
#        When user logs in using "expensesmanager10@info.com" and "expensesmanager"
#        Then the user should be able to login
#        And the title should contain "CRM"