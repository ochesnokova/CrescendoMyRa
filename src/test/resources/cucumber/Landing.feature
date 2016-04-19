Feature: As a user I will be able to navigate between tracks

  Background: tap on welcome picture
    Given tap on welcome picture

    @Landing
    Scenario: check the tracks
      Given I tap on Track
      Then I verify that I am on Track page
      Then I tap on Summary
      And I tap on Me
      Then I tap on Resources


