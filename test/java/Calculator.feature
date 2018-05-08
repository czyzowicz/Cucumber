Feature: Calculator arithmetic

  Scenario: Adding number

    Given I run calculator application
    When I add 4 and 5
    Then the result should be 9

  Scenario Outline: Many additions
    Given I run calculator application
    When I add <a> and <b>
    Then the result should be <c>
    Examples:
      |a|b|c|
      |1|1|2|
      |2|2|4|
      |12|24|36|
