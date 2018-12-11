package pageActions;

import org.openqa.selenium.support.PageFactory;
import pageLocators.CBOL_Regression_Payments_MakeAPaymentFromExternal_Locator;
import utils.SeleniumDriver;

public class CBOL_Regression_Payments_MakeAPaymentFromExternal_Action {
	CBOL_Regression_Payments_MakeAPaymentFromExternal_Locator MakeAPaymentFromExternalLocatorObj = new CBOL_Regression_Payments_MakeAPaymentFromExternal_Locator();
	
public CBOL_Regression_Payments_MakeAPaymentFromExternal_Action() 
	{
		this.MakeAPaymentFromExternalLocatorObj = new CBOL_Regression_Payments_MakeAPaymentFromExternal_Locator();
		PageFactory.initElements(SeleniumDriver.getDriver(),MakeAPaymentFromExternalLocatorObj);
	}

		public void openurl(String url) throws InterruptedException {
			SeleniumDriver.getDriver().get(url);
			Thread.sleep(9000);
			
		}

		public void login(String userid, String password) {
			MakeAPaymentFromExternalLocatorObj.useridmasked.click();
			MakeAPaymentFromExternalLocatorObj.username.sendKeys(userid);
			MakeAPaymentFromExternalLocatorObj.password.sendKeys(password);
	        System.out.println("Userid and password are Entered");
	        MakeAPaymentFromExternalLocatorObj.signon.click();
	        System.out.println("Sign on button is clicked");
	        
			
		}

		public void dashboard() {
			MakeAPaymentFromExternalLocatorObj.accountoverview.isDisplayed();
	        System.out.println("Account summary page is displayed");
			
		}

}
