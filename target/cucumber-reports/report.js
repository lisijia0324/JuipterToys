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
    },
    {
      "name": "@Debug"
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
  "status": "passed"
});
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
formatter.match({
  "location": "LoginSteps.anUserLoginWithoutTermAgreement()"
});
formatter.result({
  "status": "passed"
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
});