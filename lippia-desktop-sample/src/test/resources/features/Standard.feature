@Smoke
Feature: As a potential client i need to open a calculator and do math operations

  Scenario: Plus operation
    When Seven Plus Eight
    Then Result is Fifteen

  Scenario: Multiply operation
    When Seven multiply Eight
    Then Result is Fifty six

  Scenario: Divide operation
    When Seven divide Eight
    Then Result is zero eighty seven

  Scenario: Rest operation
    When Seven Rest Eight
    Then Result is minus one




