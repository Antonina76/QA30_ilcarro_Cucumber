Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And User click on the login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success  message is displayed
    And  User quites browser

  @wrongPassword
  Scenario Outline: Login with valid email and wrong password
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And User click on the login link
    And User enters valid email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies error  message is displayed
    And  User quites browser
    Examples:
      | email      | password      |
      | j.d@com.de | Antpavl1234!! |
      | j.d@com.de | antpavl1234!! |
      | j.d@com.de | antpavl123!!  |
      | j.d@com.de | NEUER456!!   |
      | j.d@com.de | Antpavl1234   |