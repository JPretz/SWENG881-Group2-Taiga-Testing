Feature: User Story Creation

  Scenario: Reject user story creation when subject is empty
    Given the user is on the user story creation page
    When the user enters an empty subject and a valid description
    Then the user story creation should be rejected

  Scenario: Reject user story creation when subject contains only whitespace
    Given the user is on the user story creation page
    When the user enters a whitespace-only subject and a valid description
    Then the user story creation should be rejected