Feature: Each tile is clickable and opens the selected Tracking page

  Background: tap on welcome picture
    Given tap on welcome picture

  @TrackLanding
  Scenario: check the Tracks
    Given I tap on Big Picture Tile
    Then I verify that I am on Big Picture screen
    And I tap on Back
    Then I tap on Joint Pain Tile