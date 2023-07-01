Feature: Real estate search test

  Background: We are on the main page of the site
    Given We open the site "https://dom.ria.com/uk/"

  Scenario: Search real estate by price
    When Enter filters
    And Enter the price
    And We open the real estate page
    Then The real estate price is greater than or equal to 100000