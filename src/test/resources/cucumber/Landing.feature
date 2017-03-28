Feature: As a user I will be able to navigate between tracks

  Background: tap on welcome picture
    Given tap on welcome picture

    @Landing
    Scenario: check the Navigation Footer
      Given I tap on Track
      Then I verify that I am on Track page
      Then I tap on Summary
      And T verify "Average_time_with_morning" is present
      Then I tap on Me
      And I verify that I am on Me page
      Then I tap on Resources
      And I verify that I am on Resources page


