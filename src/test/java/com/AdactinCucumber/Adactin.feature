Feature: feature of Adactin Hostels Login Functionality


Scenario Outline:: user login with Valid Username and Password
Given user in on login page
When Enter the Username "<username>"
And Enter the Password "<password>"
Then User should be click on login

Examples:
| username | password |
| Aarush12 | Aarush123 |
| Aarush12 | Aarush12 |


Scenario: Search Hotel in the Adactin Hostles
Given User can select the hotel location 
When select the Hotels names
And  select the Room Type 
And Select the Number of Rooms
And Choose the date to check in
And select the check out date
And Choose Adults per Room
And Choose the Children Per Room
Then Click the Search button

Scenario: Select the Hotel
Given Select the Selected Hostel
When Click the continue button

Scenario: Book A Hotel
Given User name should be given the First Name
When User name should be given the Last Name 
And Provide the Billing address
And Giving user credit card details
And click the Booknow button
Then click logout








