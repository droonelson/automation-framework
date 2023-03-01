Feature: Amazon Test - Logout

  Scenario: user logs out
    Given I am logged into amazon
    When I hover over my name
    And click 'sign out'
    Then I will be logged out of 'amazon.com'
