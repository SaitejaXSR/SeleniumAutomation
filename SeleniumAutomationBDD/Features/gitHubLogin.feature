Feature: Github Login Feature
Scenario: Successful Login into github
Given user is on github page
When user clicks on sign in link
Then user will be on sign in page
When user enters correct username
And enters correct password
And click on sign in button
Then user should enter into his github account successfully
And user closes the window

Scenario: Login fail on github
Given user is on github page
When user clicks on sign in link
Then user will be on sign in page
When user enters wrong username or password
And click on sign in button
Then user should get failure message
And user closes the window