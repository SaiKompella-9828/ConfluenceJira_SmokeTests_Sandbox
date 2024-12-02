Feature: Checking All Pages and Functionality of Atlassian Management
@Atlassian
Scenario: Atlassian Smoke Testing
Given User is on Confluence Login Page
When User should login through <Username> and <Password>
Then User Performs Search Functionality with "Service Deliver Home" text
And User Checks all Atlassian Related Functionality
And User should be able to perform Page Updates
Examples:
| Username | Password |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 |