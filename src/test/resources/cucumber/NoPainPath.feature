Feature: As a user I'm able to record daily feeling

  Background: tap on welcome picture
    Given tap on welcome picture

  @NoPainPath
  Scenario: check that the user can record no pain day
    Given I tap on Big Picture
    Then I tap on Very Good
    And I verify number one
    Then I tap on text field
    And I type "test" into text field
    And T tap on Done
    Then I tap on forward arrow

    Then I tap on Get Started button on Joint Pain Welcome screen
    Then I verify that I am on Joint Pain Screen
    And I tap on no pain
    Then I tap on forward arrow




    Then I verify that I am on Morning Stiffness screen
    And I tap on No Morning Stiffness
    Then I tap on forward arrow



    And  I verify that I am on Fatigue screen
    And I tap on No Fatigue
   # Then I verify number one
    Then I tap on forward arrow
    And I verify that I am on Daily Functionality screen
    Then I tap on Add an Activity
    And I verify that I am on Add Activities screen
    Then I tap on Bathing
    And I tap Done
    And I verify that I am on Daily Functionality screen and Bathing were added
    Then I tap on number one Easy for Bathing
  # Then I verify number one
    Then I tap on text field
    And I type "test" into text field
    And T tap on Done
    Then I tap on forward arrow
    And I verify that I am on Medication screen
    And I tap on Add a Medication
#    And I verify that I am on Add Medication screen
#    Then I tap on Actemra
#    And I verify that I am Actemra detailed page
#    And I type "3" into Amount field
#    And I type "pills" into Unit field
#    And I type "2" into Times field
#    And I type "1" into Days field
#    Then I tap Done
#    And I verify that I am on Add Medication screen
#    And I tap on forward error on Medication screen
#    And I verify that I am on Labs screen
#    Then T tap on VectraDA
#    And  I make a swipe down gesture
#    And I pick the score of the test
#    Then I tap on Done

