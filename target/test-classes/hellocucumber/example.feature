Feature: jira//PRT-1590
  Check homepage functionality

  Scenario: The example
    Given an example scenario
    When all step definitions are implemented
    Then the scenario passes

  Scenario Outline: Check homepage
    Given user opens home page
    Then user checks alarm tale
    When click on "<text>" button
    Then page is open
    Examples:
      | text          |
      | Дізнійся чому |
      | Вживання      |


  Scenario: Change city
    Given user opens home page
    When click on city Dnipro button
    Then page is open with city Dnipro

  Scenario: Choose course
    Given user opens home page
    When click on developer course
    Then check developer text

  Scenario: Choose JavaBasic course
    Given user opens home page
    When click on developer course
    When click on Java course
    When click on JavaBasic course
    Then check text - basic level