$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Smart/eclipse-workspace/Framework/src/test/resources/features/DataDriven.feature");
formatter.feature({
  "name": "Datadriven types",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Without examples",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_opens_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_opens_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entering username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "kannan21109444@gmail.com",
        "Aswath555."
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "DataDrivenSteps.user_entering_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logout from the application",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.logout_from_the_application()"
});
formatter.result({
  "status": "passed"
});
});