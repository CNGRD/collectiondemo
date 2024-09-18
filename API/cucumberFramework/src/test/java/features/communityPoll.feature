Feature: Community Poll

Scenario: User should be able to poll after log in

Given Browser is open and URL is navigated
And User is logged in 
When User selects an option in community poll
Then the option must be recorded
