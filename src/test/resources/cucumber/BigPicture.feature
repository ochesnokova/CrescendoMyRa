Feature: As a user I'm able to report my overall felling

  Background: tap on welcome picture
    Given tap on allow notifications
  Given tap on welcome picture

  @BigPicture
  Scenario: check numbers on Big Picture Page
    Given I tap on Big Picture
    Then I tap on Very Good
    And I verify number one
    Then I tap on Good
    And I verify number two
    Then I tap on Okay
    And I verify number three
    Then I tap on Bad
    And I verify number four
    Then I tap on Very Bad
    And I verify number five
    Then I tap on text field
    And I type "test" into text field
    And T tap on Done





