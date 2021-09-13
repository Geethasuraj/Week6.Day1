Feature: Delete lead functionality of leaftaps
Scenario: TC004- Delete the Lead
#Given Open the Chrome Browser
#And Load the application url
#Given Enter the username as <username>
#And Enter the password as <password>
#When Click on Login button
#And Click on CRM/SFA link
#And Click on Leads Button
And Click on Find Leads Button1
And Click on Phone in DeleteLead
Given Enter the phone number as <phno> in delete
When Click on Find Leads Button in window1
When Delete the Lead and search
Then Search for deleted record
