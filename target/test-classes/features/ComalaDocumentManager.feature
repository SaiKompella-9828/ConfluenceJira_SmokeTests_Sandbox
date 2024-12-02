Feature: Checking All Pages and Functionality of  Comala Document Manager
@Comala
Scenario: Comala Document Smoke Testing
Given User is on Confluence Login Page
When User should login through <Username> and <Password>
Then User Performs Search Functionality with "Service Deliver Home" text
And User Checks all Comala Related Functionality
Examples:
| Username | Password |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 |