package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CBOL_Regression_Payments_MakeAPaymentFromExternal_Locator {

	
	@FindBy(id="usernameMasked")
	public WebElement useridmasked; 

    @FindBy(id="username")
    public WebElement username;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id="signInBtn")
    public WebElement signon;

    @FindBy(id="topNavAccounts")
    public WebElement accountoverview;
}
