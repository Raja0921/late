package pageActions;

import org.openqa.selenium.support.PageFactory;
import pageLocators.CBOL_Regression_HomePage_Incredibles_Locator;
import utils.SeleniumDriver;

public class CBOL_Regression_HomePage_Incredibles_Actions {
	CBOL_Regression_HomePage_Incredibles_Locator homepageincredibleslocators = new CBOL_Regression_HomePage_Incredibles_Locator();
	

	public  CBOL_Regression_HomePage_Incredibles_Actions()
	{
		this.homepageincredibleslocators= new CBOL_Regression_HomePage_Incredibles_Locator();
		PageFactory.initElements(SeleniumDriver.getDriver(), homepageincredibleslocators);
	}	
	

	public void openurl(String url) throws InterruptedException {
		SeleniumDriver.getDriver().get(url);
		Thread.sleep(9000);
		
	}
	
	public void selectlanguage(String Language) throws InterruptedException {
		switch(Language)
		{
			case "English" :
				if(homepageincredibleslocators.Espanol.isDisplayed())
				{
					System.out.println("The Page already in English");
					
				}
				else
				{
					homepageincredibleslocators.English.click();
					Thread.sleep(9000);
					System.out.println("Now the Page is in English");
				}
			break;
			case "Spanish" :
				if(homepageincredibleslocators.Espanol.isDisplayed())
				{
					System.out.println("The Page is in English");
					homepageincredibleslocators.Espanol.click();
					Thread.sleep(9000);
					System.out.println("Now the Page is in Spanish");
				}
				else
				{
					homepageincredibleslocators.Espanol.click();
					System.out.println("The Page already in Spanish");
				}
			break;	
		}
		
	}
	
	public void bankingmenu() {

				homepageincredibleslocators.Banking.click();
				System.out.println("Banca Personal is clicked");
	}

	public void bankingpage(String Language) throws InterruptedException {
		switch (Language)
		{
		case "English" :
			if(homepageincredibleslocators.Statetitle.isDisplayed())
		{
			homepageincredibleslocators.Stateselect.click();
			homepageincredibleslocators.Statename.click();
			homepageincredibleslocators.Selectbutton.click();
			Thread.sleep(9000);
			homepageincredibleslocators.Breadcrumb.isDisplayed();
			System.out.println("Breadcrumb navigation is displayed");
			String url1 = SeleniumDriver.getDriver().getCurrentUrl();
				if(url1.contains("ID=banking-overview"))
				{
					System.out.println("Banking overview page url is verified");
					System.out.println("Banking Overview page is displayed");
				}
				else
				{
					System.out.print("Displayed is not an expected banking page");
				}
			
		}
		else 
		{
			homepageincredibleslocators.Breadcrumb.isDisplayed();
			System.out.println("Breadcrumb navigation is displayed");
			String url1 = SeleniumDriver.getDriver().getCurrentUrl();
			if(url1.contains("ID=banking-overview"))
			{
				System.out.println("Banking overview page is verified");
				System.out.println("Banking Overview page is displayed");
			}
			else
			{
				System.out.print("Displayed is not an expected banking page");
			}
		}
	
			break;
			case "Spanish" :
				if(homepageincredibleslocators.EsStatetitle.isDisplayed())
				{
					homepageincredibleslocators.Stateselect.click();
					homepageincredibleslocators.Statename.click();
					homepageincredibleslocators.EsSelectbutton.click();
					Thread.sleep(9000);
					homepageincredibleslocators.Breadcrumb.isDisplayed();
					System.out.println("Breadcrumb navigation is displayed");
					String url1 = SeleniumDriver.getDriver().getCurrentUrl();
						if(url1.contains("ID=banking-overview"))
						{
							System.out.println("Banking overview page url is verified");
							System.out.println("Spanish Banking Overview page is displayed");
						}
						else
						{
							System.out.print("Displayed is not an expected spanish banking page");
						}
					
				}
				else 
				{
					homepageincredibleslocators.Breadcrumb.isDisplayed();
					System.out.println("Breadcrumb navigation is displayed");
					String url1 = SeleniumDriver.getDriver().getCurrentUrl();
					if(url1.contains("ID=banking-overview"))
					{
						System.out.println("Banking overview page is verified");
						System.out.println("Spanish Banking Overview page is displayed");
					}
					else
					{
						System.out.print("Displayed is not an expected spanish banking page");
					}
				}
				break;
				}
	}		

	public void tab(String Tab) throws InterruptedException {
		switch (Tab) 
		{
			case "CD&BankingIRA" :
					homepageincredibleslocators.CDandIRAtab.click();
					System.out.print("CD & IRA tab is clicked");
					Thread.sleep(9000);
					String url2 = SeleniumDriver.getDriver().getCurrentUrl();
					if(url2.contains("ID=cd-ira-account-overview"))
					{
						System.out.println("CD & Banking IRAs page is verified");
						System.out.println("CD & Banking IRAs page is displayed");
					}
					else
					{
						System.out.print("Displayed is not an expected CD & Banking IRAs page");
					}
				
			break;	
			
			case "Saving" :
				try{
					homepageincredibleslocators.Savingtab.isDisplayed();	
					homepageincredibleslocators.Savingtab.click();
					System.out.print("Saving is clicked");
					Thread.sleep(4000);
					String url3 = SeleniumDriver.getDriver().getCurrentUrl();
					if(url3.contains("ID=savings-account-overview"))
					{
						System.out.println("Saving page is verified");
						System.out.println("Saving page is displayed");
					}
					else
					{
						System.out.print("Displayed is not an expected Saving page");
					}
					}
				
				catch(Exception e) {
					homepageincredibleslocators.EsSavingtab.isDisplayed();
					homepageincredibleslocators.Savingtab.click();
					System.out.print("Saving is clicked");
					Thread.sleep(9000);
					String url3 = SeleniumDriver.getDriver().getCurrentUrl();
					if(url3.contains("ID=savings-account-overview"))
					{
						System.out.println("Saving page is verified");
						System.out.println("Saving page is displayed");
					}
					else
					{
						System.out.print("Displayed is not an expected Saving page");
					}
					}
		
			break;
			
			case "Checking" :
				try{
					homepageincredibleslocators.Checkingtab.isDisplayed();
					homepageincredibleslocators.Checkingtab.click();
					System.out.print("Checking is clicked");
					Thread.sleep(9000);
					String url4 = SeleniumDriver.getDriver().getCurrentUrl();
					if(url4.contains("ID=checking-account-overview"))
					{
						System.out.println("Checking page is verified");
						System.out.println("Checking page is displayed");
					}
					else
					{
						System.out.print("Displayed is not an expected Checking page");
					}
					}
		
				catch (Exception e){
					homepageincredibleslocators.EsCheckingtab.isDisplayed();
					homepageincredibleslocators.EsCheckingtab.click();
					System.out.print("Checking is clicked");
					Thread.sleep(9000);
					String url4 = SeleniumDriver.getDriver().getCurrentUrl();
					if(url4.contains("ID=checking-account-overview"))
					{
						System.out.println("Checking page is verified");
						System.out.println("Checking page is displayed");
					}
					else
					{
						System.out.print("Displayed is not an expected Checking page");
					}
					}
			break;
					}
		}

	public void module(String Package) throws InterruptedException {
		switch (Package) 
		{
		case "IRA":
			homepageincredibleslocators.BankingIRAmodule.isDisplayed();
			System.out.println("Banking IRAs module is displayed");
			homepageincredibleslocators.BankingIRASeeDetails.click();
			Thread.sleep(9000);
			homepageincredibleslocators.BankingIRApage1.isDisplayed();
			homepageincredibleslocators.BankingIRApage2.isDisplayed();
			System.out.println("Banking IRAs module page is displayed");
			homepageincredibleslocators.Breadcrumb.isDisplayed();
			homepageincredibleslocators.breadcrumbhome.click();
			System.out.println("Breadcrumb navigation is verified");
			
		break;
		
		case "CD":
			homepageincredibleslocators.CDmodule.isDisplayed();
			System.out.println("CD module is displayed");
			homepageincredibleslocators.CDSeeDetails.click();
			Thread.sleep(9000);
			homepageincredibleslocators.CDpage1.isDisplayed();
			homepageincredibleslocators.CDpage2.isDisplayed();
			System.out.println("CD module page is displayed");
			homepageincredibleslocators.Breadcrumb.isDisplayed();
			homepageincredibleslocators.breadcrumbhome.click();
			System.out.println("Breadcrumb navigation is verified");
			
		break;
		
		case "EsCitiSavingsAccount":
			homepageincredibleslocators.EsCitisavingmodule.isDisplayed();
			System.out.println("Saving module is displayed");
			homepageincredibleslocators.EsCitiSavingSeeDetails.click();
			Thread.sleep(9000);
			homepageincredibleslocators.EsCitisavingpage1.isDisplayed();
			homepageincredibleslocators.EsCitisavingpage2.isDisplayed();
			System.out.println("Saving page is displayed in spanish");
			homepageincredibleslocators.Breadcrumb.isDisplayed();
			homepageincredibleslocators.Esbreadcrumbhome.click();
			System.out.println("Breadcrumb navigation is verified");
			
		break;
		
		case "EsCitiPriority":
			homepageincredibleslocators.EsCitiprioritymodule.isDisplayed();
			System.out.println("Citi Priority module is displayed");
			homepageincredibleslocators.EsCitiprioritySeeDetails.click();
			Thread.sleep(9000);
			homepageincredibleslocators.EsCitiprioritypage1.isDisplayed();
			homepageincredibleslocators.EsCitiprioritypage2.isDisplayed();
			System.out.println("Citi Priority page is displayed in spanish");
			homepageincredibleslocators.Breadcrumb.isDisplayed();
			homepageincredibleslocators.Esbreadcrumbhome.click();
			System.out.println("Breadcrumb navigation is verified");
			
		break;
		
		case "CitiGold":
			homepageincredibleslocators.Citigoldmodule.isDisplayed();
			System.out.println("Citi Gold module is displayed");
			homepageincredibleslocators.CitiGoldSeeDetails.click();
			Thread.sleep(9000);
			homepageincredibleslocators.Citigoldpage1.isDisplayed();
			homepageincredibleslocators.Citigoldpage2.isDisplayed();
			System.out.println("Citi Priority page is displayed in English");
			homepageincredibleslocators.Breadcrumb.isDisplayed();
			homepageincredibleslocators.breadcrumbhome.click();
			System.out.println("Breadcrumb navigation is verified");
			
		break;
		
		case "CitiBank":
			homepageincredibleslocators.Citibankmodule.isDisplayed();
			System.out.println("Citi Bank module is displayed");
			homepageincredibleslocators.CitibankSeeDetails.click();
			Thread.sleep(9000);
			homepageincredibleslocators.Citibankpage1.isDisplayed();
			homepageincredibleslocators.Citibankpage2.isDisplayed();
			System.out.println("Citi Bank page is displayed in English");
			homepageincredibleslocators.Breadcrumb.isDisplayed();
			homepageincredibleslocators.breadcrumbhome.click();
			System.out.println("Breadcrumb navigation is verified");
			
		break;
		
		case "AccessAccount":
			homepageincredibleslocators.AccessAccountmodule.isDisplayed();
			System.out.println("Access Account module is displayed");
			homepageincredibleslocators.AccessSeeDetails.click();
			Thread.sleep(9000);
			homepageincredibleslocators.Accessaccountpage1.isDisplayed();
			homepageincredibleslocators.Accessaccountpage2.isDisplayed();
			System.out.println("Access Account page is displayed in English");
			homepageincredibleslocators.Breadcrumb.isDisplayed();
			homepageincredibleslocators.breadcrumbhome.click();
			System.out.println("Breadcrumb navigation is verified");
			
		break;
		
		case "CitiPriority":
			homepageincredibleslocators.Citiprioritymodule.isDisplayed();
			System.out.println("Citi Priority module is displayed");
			homepageincredibleslocators.CitiprioritySeeDetails.click();
			Thread.sleep(9000);
			homepageincredibleslocators.Citiprioritypage1.isDisplayed();
			homepageincredibleslocators.Citiprioritypage2.isDisplayed();
			System.out.println("Citi Priority page is displayed in English");
			homepageincredibleslocators.Breadcrumb.isDisplayed();
			homepageincredibleslocators.breadcrumbhome.click();
			System.out.println("Breadcrumb navigation is verified");
			
		break;
		
		case "BasicBanking":
			homepageincredibleslocators.BasicBankingmodule.isDisplayed();
			System.out.println("Basic Banking module is displayed");
			homepageincredibleslocators.BasicBankingSeeDetails.click();
			Thread.sleep(9000);
			homepageincredibleslocators.Basicbankingpage1.isDisplayed();
			homepageincredibleslocators.Basicbankingpage2.isDisplayed();
			System.out.println("Basic Banking page is displayed in English");
			homepageincredibleslocators.Breadcrumb.isDisplayed();
			homepageincredibleslocators.breadcrumbhome.click();
			System.out.println("Breadcrumb navigation is verified");
			
		break;
		}
		}
	public void login(String userid, String password) {

        homepageincredibleslocators.useridmasked.click();
        homepageincredibleslocators.username.sendKeys(userid);
        homepageincredibleslocators.password.sendKeys(password);
        System.out.println("Userid and password are Entered");
        homepageincredibleslocators.signon.click();
        System.out.println("Sign on button is clicked");
        homepageincredibleslocators.accountoverview.isDisplayed();
        System.out.println("Account summary page is displayed");

		}
	public void Citilink() {
		homepageincredibleslocators.citilink.click();
		System.out.println("Got redirected to home page");
		}
	


}
