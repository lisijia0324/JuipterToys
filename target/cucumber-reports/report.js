$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/LoginFeature.feature");
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
});