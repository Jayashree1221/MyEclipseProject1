$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/AdactinCucumber/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "feature of Adactin Hostels Login Functionality",
  "description": "",
  "id": "feature-of-adactin-hostels-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": ": user login with Valid Username and Password",
  "description": "",
  "id": "feature-of-adactin-hostels-login-functionality;:-user-login-with-valid-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user in on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the Username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter the Password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should be click on login",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "feature-of-adactin-hostels-login-functionality;:-user-login-with-valid-username-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "feature-of-adactin-hostels-login-functionality;:-user-login-with-valid-username-and-password;;1"
    },
    {
      "cells": [
        "Aarush12",
        "Aarush123"
      ],
      "line": 12,
      "id": "feature-of-adactin-hostels-login-functionality;:-user-login-with-valid-username-and-password;;2"
    },
    {
      "cells": [
        "Aarush12",
        "Aarush12"
      ],
      "line": 13,
      "id": "feature-of-adactin-hostels-login-functionality;:-user-login-with-valid-username-and-password;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": ": user login with Valid Username and Password",
  "description": "",
  "id": "feature-of-adactin-hostels-login-functionality;:-user-login-with-valid-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user in on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the Username \"Aarush12\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter the Password \"Aarush123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should be click on login",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_in_on_login_page()"
});
formatter.result({
  "duration": 5997650900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aarush12",
      "offset": 20
    }
  ],
  "location": "AdactinStepDefinition.enter_the_Username(String)"
});
formatter.result({
  "duration": 249476000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aarush123",
      "offset": 20
    }
  ],
  "location": "AdactinStepDefinition.enter_the_Password(String)"
});
formatter.result({
  "duration": 128562900,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_should_be_click_on_login()"
});
formatter.result({
  "duration": 670046300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": ": user login with Valid Username and Password",
  "description": "",
  "id": "feature-of-adactin-hostels-login-functionality;:-user-login-with-valid-username-and-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user in on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the Username \"Aarush12\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter the Password \"Aarush12\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should be click on login",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_in_on_login_page()"
});
formatter.result({
  "duration": 671008900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aarush12",
      "offset": 20
    }
  ],
  "location": "AdactinStepDefinition.enter_the_Username(String)"
});
formatter.result({
  "duration": 119548900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aarush12",
      "offset": 20
    }
  ],
  "location": "AdactinStepDefinition.enter_the_Password(String)"
});
formatter.result({
  "duration": 98635300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_should_be_click_on_login()"
});
formatter.result({
  "duration": 1575273700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Search Hotel in the Adactin Hostles",
  "description": "",
  "id": "feature-of-adactin-hostels-login-functionality;search-hotel-in-the-adactin-hostles",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "User can select the hotel location",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "select the Hotels names",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "select the Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select the Number of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Choose the date to check in",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "select the check out date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Choose Adults per Room",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Choose the Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Click the Search button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_can_select_the_hotel_location()"
});
formatter.result({
  "duration": 286039600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.select_the_Hotels_names()"
});
formatter.result({
  "duration": 230306500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.select_the_Room_Type()"
});
formatter.result({
  "duration": 196460600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.select_the_Number_of_Rooms()"
});
formatter.result({
  "duration": 154181200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.choose_the_date_to_check_in()"
});
formatter.result({
  "duration": 251798200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.select_the_check_out_date()"
});
formatter.result({
  "duration": 187627100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.choose_Adults_per_Room()"
});
formatter.result({
  "duration": 151935100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.choose_the_Children_Per_Room()"
});
formatter.result({
  "duration": 149873300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.click_the_Search_button()"
});
formatter.result({
  "duration": 1185344400,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Select the Hotel",
  "description": "",
  "id": "feature-of-adactin-hostels-login-functionality;select-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "Select the Selected Hostel",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "Click the continue button",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefinition.select_the_Selected_Hostel()"
});
formatter.result({
  "duration": 733015700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.click_the_continue_button()"
});
formatter.result({
  "duration": 1209028000,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Book A Hotel",
  "description": "",
  "id": "feature-of-adactin-hostels-login-functionality;book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "User name should be given the First Name",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "User name should be given the Last Name",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Provide the Billing address",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Giving user credit card details",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "click the Booknow button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "click logout",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_name_should_be_given_the_First_Name()"
});
formatter.result({
  "duration": 136585000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_name_should_be_given_the_Last_Name()"
});
formatter.result({
  "duration": 139499100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.provide_the_Billing_address()"
});
formatter.result({
  "duration": 180161600,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.giving_user_credit_card_details()"
});
formatter.result({
  "duration": 762887500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.click_the_Booknow_button()"
});
formatter.result({
  "duration": 141449500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.click_logout()"
});
formatter.result({
  "duration": 7036266800,
  "status": "passed"
});
});