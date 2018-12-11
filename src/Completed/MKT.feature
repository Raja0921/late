#------------------------------------------------------------------------------------------------------------------------------------------------------------#
#---- Base Framework model - CBOL Sign On v2---------------------------10/05/2018------------------------------------------------------------#
#------------------------------------------------------------------------------------------------------------------------------------------------------------#
@MKT
Feature: Link Validation 
 #-------------------------------------------------------------------------------------------
#------------------------------------Positive Flow------------------------------------------
#-------------------------------------------------------------------------------------------
@MKTSimplicity
Scenario Outline: Cards Marketing_DD MKT_PDP page_Citi Simplicity Cash Card_Large breakpoint_Link Validation
Given I am on the Home Page "<URL>"
When I click search card
And I enter and select "<CardName>"
And I get PDP page
And I validate "<CardName>" apply now link
And I validate pricing info link
Then I validate additional info link

Examples:
|URL|CardName|
##@data@src/test/java/dataProvider/TestData.xlsx@MKT


@MKTCostcoVisa
Scenario Outline: Cards Marketing_DD MKT_PDP page_Costco Anywhere Visa Card by Citi_Large breakpoint_Link Validation
Given I am on the Home Page "<URL>"
When I click search card
And I enter and select "<CardName>"
And I get PDP page
And I validate "<CardName>" apply now link
And I validate pricing info link
Then I validate additional info link

Examples:
|URL|CardName|
##@data@src/test/java/dataProvider/TestData.xlsx@MKT


@MKTCostcoBusiness
Scenario Outline: Cards Marketing_DD MKT_PDP page_Costco Anywhere Visa Business Card by Citi_Large breakpoint_Link Validation
Given I am on the Home Page "<URL>"
When I click search card
And I enter and select "<CardName>"
And I get PDP page
And I validate "<CardName>" apply now link
And I validate pricing info link
Then I validate additional info link

Examples:

|URL|CardName|
##@data@src/test/java/dataProvider/TestData.xlsx@MKT


@MKTAdvantageexecutive
Scenario Outline: Cards Marketing_DD MKT_PDP page_Citi AAdvantage Executive World Elite MasterCard_Large breakpoint_Link Validation
Given I am on the Home Page "<URL>"
When I click search card
And I enter and select "<CardName>"
And I get PDP page
And I validate "<CardName>" apply now link
And I validate pricing info link
Then I validate additional info link

Examples:

|URL|CardName|
##@data@src/test/java/dataProvider/TestData.xlsx@MKT

@MKTCitibusiness
Scenario Outline: Cards Marketing_DD MKT_PDP page_CitiBusiness AAdvantage Platinum Select World MasterCard_Large breakpoint_Link Validation

Given I am on the Home Page "<URL>"
When I click search card
And I enter and select "<CardName>"
And I get PDP page
And I validate "<CardName>" apply now link
And I validate pricing info link
Then I validate additional info link

Examples:

|URL|CardName|
##@data@src/test/java/dataProvider/TestData.xlsx@MKT

@MKTPlatinum
Scenario Outline: Cards Marketing_DD MKT_PDP page_Citi AAdvantage Platinum Select World Elite MasterCard_Large breakpoint_Link Validation

Given I am on the Home Page "<URL>"
When I click search card
And I enter and select "<CardName>"
And I get PDP page
And I validate "<CardName>" apply now link
And I validate pricing info link
Then I validate additional info link

Examples:

|URL|CardName|
##@data@src/test/java/dataProvider/TestData.xlsx@MKT

@MKTDoublecash
Scenario Outline: Cards Marketing_DD MKT_PDP page_Citi Double Cash Card_Large breakpoint_Link Validation

Given I am on the Home Page "<URL>"
When I click search card
And I enter and select "<CardName>"
And I get PDP page
And I validate "<CardName>" apply now link
And I validate pricing info link
Then I validate additional info link

Examples:

|URL|CardName|
##@data@src/test/java/dataProvider/TestData.xlsx@MKT


@MKTATTAcess
Scenario Outline: Cards Marketing_DD MKT_PDP page_ATT Access Card from Citi_Large breakpoint_Link Validation

Given I am on the Home Page "<URL>"
When I click search card
And I enter and select "<CardName>"
And I get PDP page
And I validate "<CardName>" apply now link
And I validate pricing info link
Then I validate additional info link

Examples:

|URL|CardName|
##@data@src/test/java/dataProvider/TestData.xlsx@MKT

@MKTSecured
Scenario Outline:Cards Marketing_DD MKT_PDP page_Citi Secured MasterCard_Large breakpoint_Link Validation 

Given I am on the Home Page "<URL>"
When I click search card
And I enter and select "<CardName>"
And I get PDP page
And I validate "<CardName>" apply now link
And I validate pricing info link
Then I validate additional info link

Examples:

|URL|CardName|
##@data@src/test/java/dataProvider/TestData.xlsx@MKT

@MKTCollege
Scenario Outline:Cards Marketing_DD MKT_PDP page_Citi ThankYou Preferred Card for College Students_Large breakpoint_Link Validation

Given I am on the Home Page "<URL>"
When I click search card
And I enter and select "<CardName>"
And I get PDP page
And I validate "<CardName>" apply now link
And I validate pricing info link
Then I validate additional info link

Examples:

|URL|CardName|
##@data@src/test/java/dataProvider/TestData.xlsx@MKT

@MKTPreferred
Scenario Outline:Cards Marketing_DD MKT_PDP page_Citi ThankYou Preferred Card_Large breakpoint_Link Validation

Given I am on the Home Page "<URL>"
When I click search card
And I enter and select "<CardName>"
And I get PDP page
And I validate "<CardName>" apply now link
And I validate pricing info link
Then I validate additional info link

Examples:

|URL|CardName|
##@data@src/test/java/dataProvider/TestData.xlsx@MKT

@MKTPremier
Scenario Outline:Cards Marketing_DD MKT_PDP page_Citi ThankYou Premier Card_Large breakpoint_Link Validation

Given I am on the Home Page "<URL>"
When I click search card
And I enter and select "<CardName>"
And I get PDP page
And I validate "<CardName>" apply now link
And I validate pricing info link
Then I validate additional info link

Examples:

|URL|CardName|
##@data@src/test/java/dataProvider/TestData.xlsx@MKT

@MKTExpedia
Scenario Outline:Cards Marketing_DD MKT_PDP page_Expedia Card from Citi_Large breakpoint_Link Validation

Given I am on the Home Page "<URL>"
When I click search card
And I enter and select "<CardName>"
And I get PDP page
And I validate "<CardName>" apply now link
And I validate pricing info link
Then I validate additional info link

Examples:

|URL|CardName|
##@data@src/test/java/dataProvider/TestData.xlsx@MKT

@MKTVoyager 
Scenario Outline:Cards Marketing_DD MKT_PDP page_Expedia Voyager Card from Citi_Large breakpoint_Link Validation

Given I am on the Home Page "<URL>"
When I click search card
And I enter and select "<CardName>"
And I get PDP page
And I validate "<CardName>" apply now link
And I validate pricing info link
Then I validate additional info link

Examples:

|URL|CardName|
##@data@src/test/java/dataProvider/TestData.xlsx@MKT
