package pageActions;

import org.openqa.selenium.support.PageFactory;

import pageLocators.CBOL_Regression_MRC_Dashboard_Validation_Locator;
import utils.SeleniumDriver;

public class CBOL_Regression_MRC_Dashboard_Validation_Action {
	
	CBOL_Regression_MRC_Dashboard_Validation_Locator cbol_Regression_MRC_Dashboard_Validation_Locator = new CBOL_Regression_MRC_Dashboard_Validation_Locator();

public CBOL_Regression_MRC_Dashboard_Validation_Action() 
{
	this.cbol_Regression_MRC_Dashboard_Validation_Locator = new CBOL_Regression_MRC_Dashboard_Validation_Locator();
	PageFactory.initElements(SeleniumDriver.getDriver(),cbol_Regression_MRC_Dashboard_Validation_Locator);
}

	public void openurl(String url) throws InterruptedException {
		SeleniumDriver.getDriver().get(url);
		Thread.sleep(9000);
		
	}

	public void login(String userid, String password) {
		cbol_Regression_MRC_Dashboard_Validation_Locator.useridmasked.click();
		cbol_Regression_MRC_Dashboard_Validation_Locator.username.sendKeys(userid);
		cbol_Regression_MRC_Dashboard_Validation_Locator.password.sendKeys(password);
        System.out.println("Userid and password are Entered");
        cbol_Regression_MRC_Dashboard_Validation_Locator.signon.click();
        System.out.println("Sign on button is clicked");
        
		
	}

	public void dashboard() {
		cbol_Regression_MRC_Dashboard_Validation_Locator.accountoverview.isDisplayed();
        System.out.println("Account summary page is displayed");
		
	}

	public void statementsanddocuments() {
		cbol_Regression_MRC_Dashboard_Validation_Locator.servicelink.click();
		cbol_Regression_MRC_Dashboard_Validation_Locator.statementsanddocumentslink.click();
		System.out.println("Statements and documents link is clicked");
		
	}

	public void accountsnapshot() {
		cbol_Regression_MRC_Dashboard_Validation_Locator.viewaccountsnapshotlink.click();
		System.out.println("View Account Snapshot Link is Clicked");
		cbol_Regression_MRC_Dashboard_Validation_Locator.accountsnapshot.isDisplayed();
		System.out.println("Account Snapshot header is displayed");
		cbol_Regression_MRC_Dashboard_Validation_Locator.CitiSummary.isDisplayed();
		System.out.println("Citi Summary header is displayed");
		cbol_Regression_MRC_Dashboard_Validation_Locator.FuturePayments.isDisplayed();
		System.out.println("Future Payments header is displayed");
		cbol_Regression_MRC_Dashboard_Validation_Locator.TodaysBankingActivity.isDisplayed();
		System.out.println("Todays Banking Activity header  is displayed");
		cbol_Regression_MRC_Dashboard_Validation_Locator.Printlink.isDisplayed();
		System.out.println("Print A Copy link is displayed");
		
	}

	public void signoff() {
		cbol_Regression_MRC_Dashboard_Validation_Locator.SignOff.click();
		
	}



}
