Feature: Login Page Tests

  @SunnyDay
  Scenario: Successful login request
    Given An user login with correct credential
    Then User sees the login account

  @RunnyDay
  Scenario: Failed login request without term agreement
    Given An user login without term agreement
    Then User sees the error message




