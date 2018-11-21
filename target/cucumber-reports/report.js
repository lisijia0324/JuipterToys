$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ShopFeature.feature");
formatter.feature({
  "name": "Shop Page and Cart Page Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful order selected product",
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
  "name": "the user put order for selected product",
  "keyword": "When "
});
formatter.match({
  "location": "ShopSteps.theUserPutOrderForSelectedProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});