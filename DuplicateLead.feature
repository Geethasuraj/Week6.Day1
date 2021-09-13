Feature: Find the duplicate lead functionality of leaftaps
Scenario: TC003- Duplicate the Lead
#Given Open the Chrome Browser
#And Load the application url
#Given Enter the username as <username>
#And Enter the password as <password>
#When Click on Login button
#And Click on CRM/SFA link
#And Click on Leads Button
And Click on Find Leads Button
And Click on Phone in DuplicateLead
Given Enter the phone number as <phno> in duplicate
When Click on Find Leads Button in window
And Click on first record in Duplicate
And Click on Duplicate Record Button
When Click on Submit Button in Duplicate