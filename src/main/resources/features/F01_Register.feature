@smoke
Feature: Register
  Scenario: verify that user can register successfully when entering required data
    Given user navigates to home page
    When clicking on Register button
    And user selects gender "gender-female"
    And user enters first name "Malak"
    And user enters last name "Ghoneim"
    And user selects date of birth "22" "4" "2000"
    And user enters email "malakghoneimm@gmail.com"
    And user enters company name "Amazon"
    And user enters password "000000"
    And user confirms password "000000"
    And user clicks on register
    Then success message is displayed
