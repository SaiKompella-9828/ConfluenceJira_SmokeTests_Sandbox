Feature: Confluence Page Login Functionality
Scenario: Confluence Login Functionality Check with Valid Credentials
Given User is on Confluence Login Page
When User should login through <Username> and <Password>
Then User is landed on the Confluence Home page
Examples:
| Username | Password |
| sai.kompella@cotiviti.com	| Omnamahshivaya@982896 |
