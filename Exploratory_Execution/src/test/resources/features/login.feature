Feature: Taiga Login

  Scenario: Login with valid credentials

    Given I am on the Taiga login page
    When I enter valid credentials
    Then I should see the Taiga dashboard