@smoke
  Feature: Home slider
    Scenario: first slider is clickable on home page
      Given user navigates to home page
      When clicking on slider
      Then user is directed to nokia lumia url

    Scenario: second slider is clickable on home page
      Given user navigates to home page
      When clicking on slider
      Then user is directed to iphone url