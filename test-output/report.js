$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/com/qa/features/contacts.feature");
formatter.feature({
  "line": 1,
  "name": "contact features",
  "description": "",
  "id": "contact-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Contact page functionality",
  "description": "",
  "id": "contact-features;contact-page-functionality",
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
  "name": "Customer click contacts option",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "customer navigate to contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "customer clicks on New button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "customer enters firstname and lastname and save changes",
  "rows": [
    {
      "cells": [
        "FIRSTNAME",
        "LASTNAME"
      ],
      "line": 10
    },
    {
      "cells": [
        "bikrr",
        "sahoo"
      ],
      "line": 11
    },
    {
      "cells": [
        "gaurr",
        "sahoo"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user close the browser instance",
  "keyword": "Then "
});
formatter.match({
  "location": "FreeCRM_login.initialize_the_browser_and_navigate_to_login_page()"
});
formatter.result({
  "duration": 23656055385,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRM_login.user_is_using_valid_username_and_password()"
});
formatter.result({
  "duration": 864092605,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRM_login.user_is_logged_in_to_application_successfully()"
});
formatter.result({
  "duration": 2098831203,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRM_contacts.customer_click_contacts_option()"
});
formatter.result({
  "duration": 253917875,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRM_contacts.customer_navigate_to_contact_page()"
});
formatter.result({
  "duration": 319472276,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRM_contacts.customer_clicks_on_New_button()"
});
formatter.result({
  "duration": 1931646621,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRM_contacts.customer_enters_firstname_and_lastname(DataTable)"
});
formatter.result({
  "duration": 7782951231,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRM_login.user_close_the_browser_instance()"
});
formatter.result({
  "duration": 803504639,
  "status": "passed"
});
});