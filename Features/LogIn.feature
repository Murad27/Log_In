Feature: User able to the logIn the application

@Smoke
Scenario: User able to the logIn the Zoopla with valid userName and password User

Given User able to open chrome browser
And User able to enter URL "https://www.zoopla.co.uk/"
When User able to click Sign-in button
And User able to enter valid userName "hasanmurad4201@gmail.com"
And User able to enter valid password "Murad123"
When User able to click on the login button
Then User able to varify the information on grid




