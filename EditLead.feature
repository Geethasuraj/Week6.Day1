Feature: Editing the lead functionality of leaftaps
Scenario Outline: TC002- Edit the Lead
#Given Open the Chrome Browser
#And Load the application url
#Given Enter the username as <username>
#And Enter the password as <password>
#When Click on Login button
#And Click on CRM/SFA link
#And Click on Leads Button
And Click on Find Leads Button in Edit
And Click on Phone
Given Enter the phone number as <phno>
When Click on Find Leads Button in the window
And Click on first record in Edit
And Click on Edit Button
Given Enter the company  name as <company>
When Click on Submit Button in Edit

Examples:
|username|password|phno|company|
|'Demosalesmanager'|'crmsfa'|'99'|'Polaris'|