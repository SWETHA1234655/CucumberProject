Feature: Travel Insurance

  Scenario: To get lowest three plans
    Given Click on travel insurance
    When Enter your destination
    And Enter the trip dates
    And Select the age of travellers
    And select the predimedical condition
    Then click premium low to high in sortby
    And click the lowest three plans
