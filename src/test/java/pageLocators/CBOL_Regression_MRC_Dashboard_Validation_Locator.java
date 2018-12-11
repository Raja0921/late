package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CBOL_Regression_MRC_Dashboard_Validation_Locator {
	
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
    
    @FindBy(xpath="(//a[contains(text(),'Services')])")
    public WebElement servicelink;
    
    @FindBy(xpath="(//a[contains(text(),'Statements & Documents')])")
    public WebElement statementsanddocumentslink;
    
    @FindBy(xpath="(//a[contains(text(),'View Account Snapshot')])")
    public WebElement viewaccountsnapshotlink;
    
    @FindBy(xpath="(//h1[contains(text(),'Account Snapshot')])")
    public WebElement accountsnapshot;
    
    @FindBy(xpath="(//h3[contains(text(),'Citi Summary')])")
    public WebElement CitiSummary;
    
    @FindBy(xpath="(//h3[contains(text(),'Future Payments')])")
    public WebElement FuturePayments;
    
    @FindBy(xpath="(//h3[contains(text(),'Recent Payments')])")
    public WebElement RecentPayments;
    
    @FindBy(xpath="(//caption[contains(text(),'Future Transfers')]")
    public WebElement FutureTransfers;
  
    @FindBy(xpath="(//caption[contains(text(),'Today's Banking Activity')]")
    public WebElement TodaysBankingActivity;
    
    @FindBy(id="cmlink_PrintRecord")
    public WebElement Printlink; 
    
    @FindBy(xpath="((//a[contains(text(),'Sign Off')])[4]")
    public WebElement SignOff;
    
  
    
}
