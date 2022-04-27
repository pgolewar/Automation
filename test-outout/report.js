$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Automation/TestingWorkplace/Automation/src/main/java/FeatureFiles/LoginFeature");
formatter.feature({
  "line": 1,
  "name": "parabank login feature",
  "description": "",
  "id": "parabank-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "test invalid login scenario",
  "description": "",
  "id": "parabank-login-feature;test-invalid-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on login page of parabank",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter the username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_login_page_of_parabank()"
});
formatter.result({
  "duration": 4967461800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_of_login_page()"
});
formatter.result({
  "duration": 3598131700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_Enter_the_username_and_password()"
});
formatter.result({
  "duration": 208700700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 499352800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.close_the_browser()"
});
formatter.result({
  "duration": 112408200,
  "status": "passed"
});
});