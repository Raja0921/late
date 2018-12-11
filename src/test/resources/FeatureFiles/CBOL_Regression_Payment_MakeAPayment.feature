Feature: Payment

@NoNickname
Scenario Outline: CRD_PMT063.001(a) [B]-SP-One Time CCP Landing Page - Display of Credit Card Selector Field_MultiCard_No Nick Name_Alternate Flow
Given I launch "<URL>" and "<PageType>"
When I login using valid "<userid>" and "<password>"
And I see dashboard
And I select Pay Citi credit Cards from Payment & Transfers
And I validate dropdown from Payment page
Then I sign Off

Examples:
|URL|userid|password|
##@data@src/test/java/dataProvider/TestData.xlsx@MRCdashboard
|https://uat2.online.citi.com/US/login.do|uat2_u2_6383|ist123|