Feature: The API Test cases for ReqRes application
Description: 

Background: 
Given User initialize Rest Assured
When User add header "content-type" and "application/json"

@Regression @smoke @sanity
Scenario: Verify the API for list Users 
When User call the "GET" method with url "https://reqres.in/api/users?page=2"
Then verify status code is 200

@Regression
Scenario: Verify the API for single User
When User call the "GET" method with url "https://reqres.in/api/users/2"
Then verify status code is 200

@Regression
Scenario: Verify the API for Unavailable User- User not found
When User call the "GET" method with url "https://reqres.in/api/users/23"
Then verify status code is 404

@Regression
Scenario: Verify the API for Unavailable User- User not found
When User call the "GET" method with url "https://reqres.in/api/unknown"
Then verify status code is 200