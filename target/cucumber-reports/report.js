$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ContactFeature.feature");
formatter.feature({
  "name": "Contact Page Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful contact request",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SunnyDay"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "An user submits feedback",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactSteps.userSubmitsFeedback()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees a successful message",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.userSeesASuccessfulMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Failed contact request",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RainyDay"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "An user submits feedback without required details",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactSteps.userSubmitsFeedbackWithoutRequiredDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees a error message",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.userSeesAErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/LoginFeature.feature");
formatter.feature({
  "name": "Login Page Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login request",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SunnyDay"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "An user login with correct credential",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.anUserLoginWithCorrectCredential()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees the login account",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.userSeesTheLoginAccount()"
});
formatter.result({
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003ctest\u003e but was: \u003c\u003e\r\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:54)\r\n\tat org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:195)\r\n\tat org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:184)\r\n\tat org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:179)\r\n\tat org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:508)\r\n\tat com.planittesting.automation.tests.cucumber.steps.FeedbackSteps.userSeesTheLoginAccount(FeedbackSteps.java:38)\r\n\tat ✽.User sees the login account(src/test/resources/features/LoginFeature.feature:6)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Failed login request without term agreement",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RunnyDay"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "An user login without term agreement",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User sees the error message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful log out",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SunnyDay"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "An user log out",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});