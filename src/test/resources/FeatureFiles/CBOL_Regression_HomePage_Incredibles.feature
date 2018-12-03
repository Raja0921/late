@HPIBankingOverview
Feature: Banking Overview
 #-------------------------------------------------------------------------------------------
#------------------------------------Positive Flow------------------------------------------
#-------------------------------------------------------------------------------------------
@HPIBankingIRA
Scenario Outline: EN_Desktop_Verify IRAs package module for pre login under CDs and Banking IRAs under Banking Overview Page
Given I launch "<URL>"
When I select "<Language>"
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module


Examples:
|URL|Language|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|CD&BankingIRA|IRA|



@HPIBankingCD
Scenario Outline: EN_Desktop_Verify CDs package module for pre login under CDs and Banking IRAs under Banking Overview Page
Given I launch "<URL>"
When I select "<Language>"
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module


Examples:
|URL|Language|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|CD&BankingIRA|CD|


@HPIBankingCitiSavingEs
Scenario Outline: ES_Desktop_Verify Citi Savings Account package modules in Savings Tab under Banking Overview Page for post login
Given I launch "<URL>"
When I select "<Language>"
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module


Examples:
|URL|Language|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|Spanish|Saving|CitiSavingsAccount|
