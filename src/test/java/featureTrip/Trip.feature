Feature: Open the Make my trip Website

  Scenario: Using the MakeMyTrip website
    Given User enter the Url
    Then click the Buses
    And Select the From location
    And Select the To location
    And Select the date that is two days after the current date and click search
    And Select the Pickup location and Scrolldown
    And Select the Drop location and ScrollUp
    And Filter the lowest price
    And Select bus seat
