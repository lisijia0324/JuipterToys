Feature: Contact Page Tests

  @SunnyDay
  Scenario: Successful contact request
    Given An user submits feedback
    Then user sees a successful message

  @RainyDay
  Scenario: Failed contact request
    Given An user submits feedback without required details
    Then user sees a error message
