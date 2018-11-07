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
});