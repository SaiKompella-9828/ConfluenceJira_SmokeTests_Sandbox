Feature: Checking All Pages and Functionality of Atlassian Management & Comala Document Manager 
@ConfluenceSmokeTests
Scenario: Confluence Smoke Testing
Given User is on Confluence Login Page
When User should login through <Username> and <Password>
Then User is landed on the Confluence Home page
Then User Performs Search Functionality with "Service Deliver Home" text
And User Checks all Atlassian Related Functionality
And User should be able to perform Page Updates
And User Checks all Comala Related Functionality
Examples:
| Username | Password |
| sai.kompella@cotiviti.com	| Shivayya@982896 |

