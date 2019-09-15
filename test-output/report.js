$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/com/qa/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM features",
  "description": "",
  "id": "freecrm-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "login page functionality check",
  "description": "",
  "id": "freecrm-features;login-page-functionality-check",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "initialize the browser and navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user is using valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user is logged in to application successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user close the browser instance",
  "keyword": "Then "
});
formatter.match({
  "location": "FreeCRM_login.initialize_the_browser_and_navigate_to_login_page()"
});
formatter.result({
  "duration": 21748517647,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRM_login.user_is_using_valid_username_and_password()"
});
formatter.result({
  "duration": 852713758,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRM_login.user_is_logged_in_to_application_successfully()"
});
formatter.result({
  "duration": 2937333328,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRM_login.user_close_the_browser_instance()"
});
formatter.result({
  "duration": 771059802,
  "status": "passed"
});
});