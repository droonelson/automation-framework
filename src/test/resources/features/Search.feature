Feature: Amazon Test - Search

  Scenario: user is searching for and selecting socks
    Given I am an amazon customer who has logged in
    When I input 'socks' into the search bar
    And I select search
    And I can select a pair of socks
    And I can navigate to the product page by clicking on the socks"
