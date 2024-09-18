Feature: Register

@Smoke
Scenario: User should be able to register using valid credentials

Given Browser is open
And url is navigated to register page
When user enters valid credentials
| M |	Test	|	manualTest	|	qs_manualtest	|	Password@123	|

And clicks on register button
Then new account should be created
And Browser must be closed