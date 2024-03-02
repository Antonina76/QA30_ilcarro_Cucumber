Feature: Add the car

  @addCar
  Scenario: Add car with valid data
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And User click on the login link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on Logged in button
    And User clicks on Let the car work button
    And User enters location
    And User enters car manufacture
    And User enters car model
    And User enters car year
    And User enters car fuel
    And User enters car seats
    And User enters car class
    And User enters car registration number
    And User enters car price
    And User clicks on Submit button
    And User clicks on Show car
    And User clicks on Logout button
    And  User quites browser