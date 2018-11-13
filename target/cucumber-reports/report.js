$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/LoginFeature.feature");
formatter.feature({
  "name": "Login Page Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Failed login request without term agreement",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RunnyDay"
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
formatter.match({
  "location": "LoginSteps.userSeesTheErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});