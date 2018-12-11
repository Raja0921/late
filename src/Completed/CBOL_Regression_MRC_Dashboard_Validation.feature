Feature: MRC dashboard Validation

@Accountsnapshot
Scenario Outline: Bank-Account Management-Account Summary-EN_Account Snapshot_CBOL-Positive Flow
Given I launch "<URL>"
When I login using valid "<userid>" and "<password>"
And I see dashboard
And I click on Statements and Documents under services link
And I select Account Snapshot link to verify the page
Then I sign Off

Examples:
|URL|userid|password|
##@data@src/test/java/dataProvider/TestData.xlsx@MRCdashboard
|https://uat2.online.citi.com/US/login.do|uat2_u2_6383|ist123|



