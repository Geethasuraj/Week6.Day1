Feature: Merge lead functionality of leaftaps
Scenario: TC005- Merge the Lead
#Given Open the Chrome Browser
#And Load the application url
#Given Enter the username as <username>
#And Enter the password as <password>
#When Click on Login button
#And Click on CRM/SFA link
#And Click on Leads Button
When Click on Merge Leads Button
When Click on Find Leads Button by entering the fname in lookup1 and lookup along with that get leadid
When Click on Merge Button
When Click on Find Leads Button in merge
Given Enter the LeadId in merge
When Click on Find Leads Button in merge window
Then Verify the text for records