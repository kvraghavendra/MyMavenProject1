Feature: Login into Newtour website

  Background:
    Given Launch the Chrome browser

#    @smoke

  Scenario: Valid username and password
    Given  I launch the application
    When I enter correct username and password and login
    Then I am login into application



