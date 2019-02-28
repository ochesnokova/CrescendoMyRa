Feature: As a user I will be able to navigate between tracks

  Background: tap on welcome picture
    Given tap on welcome picture

    @Landing
    Scenario: check the Navigation Footer
      Given I tap on Track
      Then I verify that I am on Track page
      Then I tap on Summary
      And I verify "Average_time_with_morning" is present
      Then I tap on Me
      And I verify that I am on Me page
      And I turn on/off the Reminders
      Then I tap on Resources
      And I verify that I am on Resources page


