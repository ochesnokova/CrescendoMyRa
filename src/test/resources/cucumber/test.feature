Feature: As a user I'm able to add activity

  Background: tap on welcome picture
    Given tap on welcome picture

  @Test
  Scenario: check tht the user can add activity on Daily Functionality
    Given I tap on Daily Functionality Tile
    Then I tap on Add an Activity
    And I verify that I am on Add Activities screen
    And I tap on Getting Dressed