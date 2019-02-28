Feature: As a user I'm able to report my fatigue

  Background: tap on welcome picture
    Given tap on welcome picture

  @Fatigue
  Scenario: check numbers on Fatigue Page
    Given I tap on Fatigue Tile
    Then I tap on No Fatigue
    #And I verify number one No Fatigue
    Then I tap on A Bit Tired
    #And I verify number two Bit Tired
    Then I tap on Sluggish
    #And I verify number three Sluggish
    Then I tap on Exhausted
    #And I verify number four Exhausted