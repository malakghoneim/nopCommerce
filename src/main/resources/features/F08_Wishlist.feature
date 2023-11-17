@smoke
Feature: Wishlist
  Scenario: user clicks on wishlist button and success msg is displayed
    Given user navigates to home page
    When clicking on add to wishlist
    Then success msg is displayed

    Scenario: user clicks on wishlist button and item added to wishlist
      Given user navigates to home page
      When clicking on add to wishlist
      And success msg is displayed
      Then Qty value is greater than zero
