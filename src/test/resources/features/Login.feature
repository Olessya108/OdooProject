Feature: Login as different user types

  Scenario Outline: Login as different <usertype>
    Given User is on the login page

    Examples:
    |usertype|username|password|
    |contact |