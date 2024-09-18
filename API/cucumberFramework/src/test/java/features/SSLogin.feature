Feature: ShopperStackLogin

@Smoke
Scenario: Validate shopper can login using valid credentials

Given Browser is open and url navigated
And Login page will be displayed
And Shopper login is displayed
When User enters "ngrqsp.jsp@gmail.com" and "Nithingr@123"
And clicks on login Button
Then Shopper should be successfully logged in
And Browser must be close

@Smoke
Scenario: Validate merchant can login using valid credentials

Given Browser is open and url navigated
And Login page will be displayed
And Merchant login is displayed
When User enters "qa_merchantlogin@gmail.com" and "Password@123"
And clicks on login Button
Then merchant should be successfully logged in
And Browser must be close

@Regression
Scenario: Validate Admin can login using valid credentials

Given Browser is open and url navigated
And Login page will be displayed
And Admin login is displayed
When User enters "qa_testadmindell@gmail.com" and "Password@123"
And clicks on login Button
Then Admin must be successfully logged in 
And Browser must be close