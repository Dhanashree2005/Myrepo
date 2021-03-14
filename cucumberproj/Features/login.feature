Feature: Login to facebook app

Scenario: Login to site
Given Launch site
When Enter username
And Enter password
And Click on the submit button
Then Site should be login successfully