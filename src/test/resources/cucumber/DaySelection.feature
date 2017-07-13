Feature: As a user I'm able to tap Today or Yesterday or Select Date to specify a date

  Background: tap on welcome picture
    Given tap on welcome picture

  @DaySelection
  Scenario: check that the user can record the data for any day
    Given I tap on Big Picture
    Then I tap on Okay
    And I verify number three
    Then I tap on Yesterday
    Then I tap on Very Bad
    And I verify number five
    Then I tap on Select Date
    Then I verify that I am on Select a Date screen
    And I pick any date and year
    And I tap Done
    Then I tap on Very Good
    And I verify number one
