@smoke
Feature: Login
  Scenario: Verify that user can login successfully when valid entering data
    Given user navigates to home page
    When clicking on login button
    And user enters registered email "malakghoneimm@gmail.com"
    And user enters registered password "000000"
    And user clicks on login
    Then user login to system successfully

    Scenario: verify that user cannot login with invalid data
      Given user navigates to home page
      When clicking on login button
      And user enters registered email "invalid@gmail.com"
      And user enters registered password "p@ssword"
      And user clicks on login
      Then user can not login
