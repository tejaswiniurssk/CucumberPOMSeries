Feature: Account Page Feature

Background:
Given user has already logged in to application
|username|password|
|dummyemail9093@gmail.com|dummy@123|

@accounts
Scenario: Accounts page title
Given user is on Accounts page
When user gets the title of the page
Then page title should be "My account - My Store"

@accounts
Scenario: Accounts section count
Given user is on Accounts page
Then user gets accounts section
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHLISTS|
|Home|
And accounts section count should be 6


@accounts
Scenario: Accounts page validation
Given user is on Accounts page
Then my account label is displayed
Then user clicks on My Addresses


