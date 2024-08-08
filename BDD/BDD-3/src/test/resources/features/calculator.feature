@tag

Feature: Calculator
  Scenario: radical division of two numbers
    Given Two input values, 4 and 1
    When I radical the division of two values
    Then I expect the result 2


  Scenario Outline: radical division of two numbers
    Given Two input values, <first> and <second>
    When I radical the division of two values
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 4 | 1 | 2 |
      | 72 | 8 | 3 |
      | 2 | 4 | 0 |
