Feature: As a user I'm able to Navigate from the Big Picture page properly

  Background: tap on welcome picture
    Given tap on welcome picture

  @Navigation
  Scenario: check that the user can navigate from the Big Picture
    Given I tap on Big Picture
    Then I tap on Back
    And I verify that I am on Track page
    Then I tap on Big Picture
    And I verify that I am on Big Picture screen
    Then I tap on Track
    And I verify that I am on Track page
    Then I tap on Big Picture
    And I verify that I am on Big Picture screen
    Then I tap on the Left arrow button
    And I verify that I am on Labs screen
    Then I tap on the Right arrow button
    And I verify that I am on Joint Pain Welcome Screen