
Feature: User checking Today's Deals on Amazon Home page
  
Scenario: User should success to check Today's Deals
    Given User on the Amazon Home page
    When  User click on Today's Deals
    And   click on cell phones box
    And   click on 70% off box
    Then  User able to see the item lists successfully 
    

  