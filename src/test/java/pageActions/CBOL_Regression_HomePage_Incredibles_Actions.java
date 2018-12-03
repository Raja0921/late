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
				if(homepageincredibleslocators.English.isDisplayed())
				{
					System.out.println("The Page already in Spanish");
					
				}
				else
				{
					homepageincredibleslocators.Espanol.click();
					Thread.sleep(9000);
					System.out.println("Now the Page is in Spanish");
				}
			break;	
		}
		
	}
	
	public void bankingmenu() {
		if(homepageincredibleslocators.EnBanking.isDisplayed()) 
		{
				homepageincredibleslocators.EnBanking.click();
				System.out.println("Banking menu is clicked");
		}
		else {
				homepageincredibleslocators.EsBanking.click();
				System.out.println("Banca Personal is clicked");
			
		}	
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
	}

	}



}
