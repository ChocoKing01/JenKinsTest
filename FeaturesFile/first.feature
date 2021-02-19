Feature: Test login functionality

  Scenario: Check login  credentials
    Given User open the browser
    And user is open a page facebook.com
    When user enters "abcdefg" and "Ab234we567"
    And user clicks on login button
    Then user is navigate to the home page

