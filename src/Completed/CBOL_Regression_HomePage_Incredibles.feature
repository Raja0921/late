@HPIBankingOverview
Feature: Banking Overview
 #-------------------------------------------------------------------------------------------
#------------------------------------Positive Flow------------------------------------------
#-------------------------------------------------------------------------------------------
@HPIBankingCitigold   @Prelogin				
Scenario Outline: EN_Desktop_Verify CitiGold modules in Checking Tab under Banking Overview Page for pre login
Given I launch "<URL>"
When I select "<Language>"
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module

Examples:
|URL|Language|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|Checking|CitiGold|


@HPIBankingCitibank   @Prelogin			
Scenario Outline: EN_Desktop_Verify Citibank Account modules in Checking Tab under Banking Overview Page for pre login
Given I launch "<URL>"
When I select "<Language>"
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module

Examples:
|URL|Language|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|Checking|CitiBank|


@HPIBankingBasicbanking   @Prelogin			
Scenario Outline: EN_Desktop_Verify Basic Banking modules in Checking Tab under Banking Overview Page for pre login
Given I launch "<URL>"
When I select "<Language>"
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module

Examples:
|URL|Language|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|Checking|BasicBanking|



@HPIBankingAccessAccount   @Prelogin		
Scenario Outline: EN_Desktop_Verify Access Accounts modules in Checking Tab under Banking Overview Page for pre login
Given I launch "<URL>"
When I select "<Language>"
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module

Examples:
|URL|Language|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|Checking|AccessAccount|


@HPIBankingCitiPriority   @Prelogin			
Scenario Outline: EN_Desktop_Verify Citi Priority modules in Checking Tab under Banking Overview Page for pre login
Given I launch "<URL>"
When I select "<Language>"
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module

Examples:
|URL|Language|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|Checking|CitiPriority|


@HPIBankingCheckingTab   @Prelogin			
Scenario Outline: EN_Desktop_Verify Checking Tab modules under Banking Overview Page for pre login
Given I launch "<URL>"
When I select "<Language>"
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link

Examples:
|URL|Language|Tab|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|Checking|



@HPIBankingCD&IRATab   @Prelogin
Scenario Outline: EN_Desktop_Verify CDs and IRAs Tab for pre login under Banking Overview Page
Given I launch "<URL>"
When I select "<Language>"
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link

Examples:
|URL|Language|Tab|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|CD&BankingIRA|


@HPIBankingCD&IRATab   @Prelogin			
Scenario Outline: EN_Desktop_Verify CDs&IRAs Tab modules under Banking Overview Page for pre login
Given I launch "<URL>"
When I select "<Language>"
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link

Examples:
|URL|Language|Tab|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|CD&BankingIRA|



@HPIBankingIRA   @Prelogin			
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




@HPIBankingCD   @Prelogin			
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



@HPIBankingCD   @Prelogin
Scenario Outline: EN_Desktop_CD Laddering page Entry point_Banking Overview page_Pre Login Customer
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



@HPIBankingCitiSavingEs @postlogin		
Scenario Outline: ES_Desktop_Verify Citi Savings Account package modules in Savings Tab under Banking Overview Page for post login
Given I launch "<URL>"
When I select "<Language>"
And I login using valid "<userid>" and "<password>"
And I click on Citi link
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module

Examples:
|URL|Language|userid|password|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|Spanish|uat3fb_8155|test@123|Saving|EsCitiSavingsAccount|



@HPIBankingCitiPriorityEs @postlogin		
Scenario Outline: ES_Desktop_Verify Citi Priority modules in Checking Tab under Banking Overview Page for post login
Given I launch "<URL>"
When I select "<Language>"
And I login using valid "<userid>" and "<password>"
And I click on Citi link
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module

Examples:
|URL|Language|userid|password|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|Spanish|uat3fb_8155|test@123|Checking|EsCitiPriority|



@HPIBankingSavingsTab @postlogin		
Scenario Outline: EN_Desktop_Verify Savings Tab modules under Banking Overview Page for post login
Given I launch "<URL>"
When I select "<Language>"
And I login using valid "<userid>" and "<password>"
And I click on Citi link
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link

Examples:
|URL|Language|userid|password|Tab|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|uat3fb_8155|test@123|Saving|



@HPIBankingCitigold @postlogin			
Scenario Outline: EN_Desktop_Verify CitiGold modules in Checking Tab under Banking Overview Page for post login
Given I launch "<URL>"
When I select "<Language>"
And I login using valid "<userid>" and "<password>"
And I click on Citi link
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module

Examples:
|URL|Language|userid|password|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|uat3fb_8155|test@123|Checking|CitiGold|



@HPIBankingCitibank @postlogin			
Scenario Outline: EN_Desktop_Verify Citibank Account modules in Checking Tab under Banking Overview Page for post login
Given I launch "<URL>"
When I select "<Language>"
And I login using valid "<userid>" and "<password>"
And I click on Citi link
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module

Examples:
|URL|Language|userid|password|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|uat3fb_8155|test@123|Checking|CitiBank|



@HPIBankingCheckingTab @postlogin			
Scenario Outline: EN_Desktop_Verify Savings Tab modules under Banking Overview Page for post login
Given I launch "<URL>"
When I select "<Language>"
And I login using valid "<userid>" and "<password>"
And I click on Citi link
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link

Examples:
|URL|Language|userid|password|Tab|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|uat3fb_8155|test@123|Checking|



@HPIBankingAccessaccount @postlogin			
Scenario Outline: EN_Desktop_Verify Access Accounts modules in Checking Tab under Banking Overview Page for post login
Given I launch "<URL>"
When I select "<Language>"
And I login using valid "<userid>" and "<password>"
And I click on Citi link
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module

Examples:
|URL|Language|userid|password|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|uat3fb_8155|test@123|Checking|AccessAccount|



@HPIBankingCitiPriority @postlogin			
Scenario Outline: EN_Desktop_Verify Citi Priority modules in Checking Tab under Banking Overview Page for post login
Given I launch "<URL>"
When I select "<Language>"
And I login using valid "<userid>" and "<password>"
And I click on Citi link
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module

Examples:
|URL|Language|userid|password|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|uat3fb_8155|test@123|Checking|CitiPriority|



@HPIBankingCD&IRAtab @postlogin			
Scenario Outline: EN_Desktop_Verify CDs and IRAs Tab for post login under Banking Overview Page
Given I launch "<URL>"
When I select "<Language>"
And I login using valid "<userid>" and "<password>"
And I click on Citi link
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link

Examples:
|URL|Language|userid|password|Tab|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|uat3fb_8155|test@123|CD&BankingIRA|



@HPIBankingIRA @postlogin			
Scenario Outline: EN_Desktop_Verify IRAs package module for post login under CDs and Banking IRAs under Banking Overview Page
Given I launch "<URL>"
When I select "<Language>"
And I login using valid "<userid>" and "<password>"
And I click on Citi link
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module

Examples:
|URL|Language|userid|password|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|uat3fb_8155|test@123|CD&BankingIRA|IRA|



@HPIBankingCD @postlogin			
Scenario Outline: EN_Desktop_Verify CDs package module for post login under CDs and Banking IRAs under Banking Overview Page
Given I launch "<URL>"
When I select "<Language>"
And I login using valid "<userid>" and "<password>"
And I click on Citi link
And I click Banking menu
And I get Banking overview page "<Language>"
And I validate "<Tab>" link
Then I validate "<Package>" module

Examples:
|URL|Language|userid|password|Tab|Package|
##@data@src/test/java/dataProvider/TestData.xlsx@HPI
|https://uat3.online.citi.com/US/login.do?|English|uat3fb_8155|test@123|CD&BankingIRA|CD|

