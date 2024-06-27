Feature: Car Insurance

  Scenario: Capturing error message by giving invalid login
    Given Navigate to home page
    When click the click here button
    And Select the city and Rto
    And Select car brand
    And Select car model
    And Select car fuel type
    And Select car Variant
    Then Give the name
    And give the email
    And give the mobile number
    And capture the error message
