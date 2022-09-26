Feature: User able to logIn the application valid credintails 

@negative
Scenario Outline: Valid user can give the valid userName and password to log in the application,invalid credintails will not log in
Given User able to go to any browser
And User able to go to URL "<URL>"
When User able to click sign in button
And User can enter the valid userName "<userName>"
And User User can enter the valid password "<password>"
And User able to logIn button
Then User can Varify the infomation on grid

Examples: 
 |URL                      |userName                       |password|
 |https://www.zoopla.co.uk/|hasanmurad4201@gmail.com       |Murad123|
 |https://www.amazon.com/  |         123                   |  122   |
 |                         |                               |        | 
 
 