Feature: Google Image Search feature
Scenario: Google Image Search on a given topic
Given user should be on google search page
When user clicks on images link
Then user should be on google images page
When user searches for rose in search bar
And user clicks search button
Then multiple images should be dispalyed
And user closes the browser