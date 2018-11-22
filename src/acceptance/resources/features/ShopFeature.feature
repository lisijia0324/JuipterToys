Feature: Shop Page and Cart Page Tests

  @SunnyDay @Debug
  Scenario: Successful order selected product
    Given An user login with correct credential
    When the user put order for selected product
    And the user checkout and submit order

