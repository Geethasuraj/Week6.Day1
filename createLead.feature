Feature: Creating the lead functionality of leaftaps
Scenario Outline: TC001- Create the Lead
#Given Open the Chrome Browser
#And Load the application url
#Given Enter the username as <username>
#And Enter the password as <password>
#When Click on Login button
#When Click on CRMSFA link
#And Click on Leads Button
When Click on Create Leads Button
Given Enter the companyName as <company>
And Enter the firstname as <fname>
And Enter the lastname as <lname>
And Enter the phonenumber as <phnum>
When Click on Submit button

Examples:
|username|password|company|fname|lname|phnum|
|'Demosalesmanager'|'crmsfa'|'virtusa'|'Geetha'|'S'|'99'|
|'Demosalesmanager'|'crmsfa'|'FSS'|'Dhana'|'T'|'97'|
