Feature: Amazon Test - Selection and Checkout

  Scenario: user is selecting and buying socks

    Given I am a customer on a product page for 'socks' that I selected from search
    When I select the size
    And I can select buy now
    And I can place the order
    And I can see the order confirmation