Feature: API Tests

  Scenario: Get all phones
    When I fetch all phone names
    Then I should see phones starting with work apple
    Then I should get the phone with lowest cost
    Then I should validate that ID is not null
