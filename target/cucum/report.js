$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeaturesFile/first.feature");
formatter.feature({
  "line": 1,
  "name": "Test login functionality",
  "description": "",
  "id": "test-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4421119900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Check login  credentials",
  "description": "",
  "id": "test-login-functionality;check-login--credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is open a page facebook.com",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enters \"abcdefg\" and \"Ab234we567\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is navigate to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsTest.user_open_the_browser()"
});
formatter.result({
  "duration": 557558700,
  "status": "passed"
});
formatter.match({
  "location": "stepsTest.user_is_open_a_page_facebook_com()"
});
formatter.result({
  "duration": 7093466100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcdefg",
      "offset": 13
    },
    {
      "val": "Ab234we567",
      "offset": 27
    }
  ],
  "location": "stepsTest.user_enters_and(String,String)"
});
formatter.result({
  "duration": 10302407100,
  "status": "passed"
});
formatter.match({
  "location": "stepsTest.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 106434000,
  "status": "passed"
});
formatter.match({
  "location": "stepsTest.user_is_navigate_to_the_home_page()"
});
formatter.result({
  "duration": 31579366700,
  "status": "passed"
});
});