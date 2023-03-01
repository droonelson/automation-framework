Feature: Amazon Test - login

  Scenario: Navigate to website and login
    Given I am a customer who has navigated to the amazon.com website
    When I navigate to sign in
    Then I can input my username and password to successfully login