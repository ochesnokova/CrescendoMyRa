Feature: Each tile is clickable and opens the selected Tracking page

  Background: tap on welcome picture
    Given tap on welcome picture

  @TrackLanding
  Scenario: check the 7 Tracking Tiles
    Given I tap on Big Picture Tile
    Then I verify "How are you feeling overall?" is present
    And I tap on Back
    Then I tap on Joint Pain Tile
    And I tap on Get Started button on Joint Pain Welcome screen
    Then I verify that I am on Joint Pain Screen
    And I tap on Back
    Then I tap on Morning Stiffness Tile
    Then I verify that I am on Morning Stiffness screen
    And I tap on Back
    Then I tap on Fatigue Tile
    Then I verify that I am on Fatigue screen
    And I tap on Back
    Then I tap on Daily Functionality Tile
    Then I verify that I am on Daily Functionality screen
    And I tap on Back
    Then I tap on Medications Tile
    Then I verify that I am on Medication screen
    And I tap on Back
    Then I tap on Labs Tile
    Then I verify that I am on Labs screen