Feature: As a user I'm able to report my overall felling

  Background: tap on welcome picture
  Given tap on welcome picture

  @BigPicture
  Scenario: check colors on Big Picture Page
    Given I tap on Big Picture
    Then I tap on Very Good
    And I verify blue color
    Then I tap on Good
    And I verify green color
    Then I tap on Okay
    And I verify yellow color
    Then I tap on Bad
    And I verify orange color
    Then I tap on Very Bad
    And I verify red color