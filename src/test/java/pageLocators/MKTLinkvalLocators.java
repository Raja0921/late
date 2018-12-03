package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MKTLinkvalLocators {

	
	@FindBy(xpath="(//span[@class='cA-DD-smallTriangle'])[2]")
	public WebElement Searchcardclick;
	
	@FindBy (xpath="(//input[@id='cA-DD-cardsSearchInput'])")
	public WebElement Enterandselectcardname;
	
	@FindBy(xpath="(//img[@src='/CRD/images/card_no_reflection/citi-simplicity-credit-card.jpg'])[1]")
	public WebElement SimplicityPDPpage;

	@FindBy(xpath="(//a[contains(text(),'Apply Now')])[1]")
	public WebElement Applynowclick;
	
	@FindBy(xpath="(//div[contains(@class,'ddCardImg large PID202')])")
	public WebElement ACQ_Simplicitycardart;
	
	@FindBy(xpath="//*[contains(text(),'Tell Us About Yourself')]")
	public WebElement TellusaboutYourselfText;
	
	@FindBy(xpath="(//a[@class='cA-DD-cards-details-small-link'])[2]")
	public WebElement Simplicitypricinginfolink;
	
	@FindBy (xpath="(//td[contains(text(),'CITI DISCLOSURES')])")
	public WebElement Pricinginfopage;
	
	@FindBy(xpath="(//a[contains(@href,'/credit-cards/additional-info/citi.action')])[2]")
	public WebElement Simplicityadditionalinfolink;
	
	@FindBy(xpath="(//img[@id='cA-DD-headerLogo'])")
	public WebElement Additionalinfopage;	
	
	@FindBy(xpath="(//img[@src='/CRD/images/card_no_reflection/citi-double-cash-credit-card.jpg'])[1]")
	public WebElement DoublecashPDPpage;
	
	@FindBy(xpath="(//div[contains(@class,'ddCardImg large PID142')])")
	public WebElement ACQ_Doublecashcardart;
	
	@FindBy(xpath="(//a[contains(@class,'cA-DD-cards-details-small-link')])[1]")
	public WebElement Pricinginfolink;
	
	@FindBy(xpath="(//a[contains(@href,'/credit-cards/additional-info/citi.action')])")
	public WebElement Additionalinfolink;
	
	@FindBy(xpath="(//img[@src='/CRD/images/card_no_reflection/citi-aadvantage-platinum-elite-credit-card.jpg'])[1]")
	public WebElement AAPlatinumPDPpage;
	
	@FindBy(xpath="(//div[contains(@class,'ddCardImg large PID056')])")
	public WebElement ACQ_AAPlatinumcardart;
	
	@FindBy(xpath="(//img[@src='/CRD/images/card_no_reflection/citibusiness-aadvantage-platinum-select-credit-card.jpg'])[1]")
	public WebElement CitibusinessAAPlatinumPDPpage;
	
	@FindBy(xpath="(//div[contains(@class,'ddCardImg large PID051')])")
	public WebElement ACQ_CitibusinessAAPlatinumcardart;
	
	@FindBy(xpath="(//img[@src='/CRD/images/card_no_reflection/citi-aadvantage-executive-credit-card.jpg'])[1]")
	public WebElement AAExecutivePDPpage;
	
	@FindBy(xpath="(//div[contains(@class,'ddCardImg large PID093')])")
	public WebElement ACQ_AAExecutivecardart;
	
	@FindBy(xpath="(/img[@src='/CRD/images/card_no_reflection/aadvantage-mile-up-credit-card.jpg'])[1]")
	public WebElement AAMileupPDPpage;
	
	@FindBy(xpath="(//div[contains(@class,'ddCardImg large PID410')])")
	public WebElement ACQ_AAMileupcardart;
	
	@FindBy(xpath="(//img[@src='/CRD/images/card_no_reflection/Citi-costco-anywhere-visa-credit-card.jpg'])[1]")
	public WebElement CostcovisaPDPpage;
	
	@FindBy(xpath="(//div[contains(@class,'ddCardImg large PID520')])")
	public WebElement ACQ_Costcovisacardart;
	
	@FindBy(xpath="(//img[@src='/CRD/images/card_no_reflection/Citi-costco-anywhere-visa-business-credit-card.jpg'])[1]")
	public WebElement CostcobusinessPDPpage;
	
	@FindBy(xpath="(//div[contains(@class,'ddCardImg large PID522')])")
	public WebElement ACQ_Costcobusinesscardart;
	
	@FindBy(xpath="(//img[@src='/CRD/images/card_no_reflection/citi-att-access-credit-card.jpg'])[1]")
	public WebElement ATTaccessPDPpage;
	
	@FindBy(xpath="(//div[contains(@class,'ddCardImg large PID457')])")
	public WebElement ACQ_ATTaccesscardart;
	
	@FindBy(xpath="(//img[@src='/CRD/images/card_no_reflection/citi-secured-credit-card.jpg'])[1]")
	public WebElement SecuredPDPpage;
	
	@FindBy(xpath="(//div[contains(@class,'ddCardImg large PID009')])")
	public WebElement ACQ_Securedcardart;
	
	@FindBy(xpath="(//img[@src='/CRD/images/card_no_reflection/citi-thankyou-preferred-credit-cards-for-college-students.jpg'])[1]")
	public WebElement TYPcollegePDPpage;
	
	@FindBy(xpath="(//div[contains(@class,'ddCardImg large PID083')])")
	public WebElement ACQ_TYPcollegecardart;

	@FindBy(xpath="(//img[@src='/CRD/images/card_no_reflection/citi-thankyou-credit-card-preferred-card.jpg'])[1]")
	public WebElement TYpreferredPDPpage;
	
	@FindBy(xpath="(//div[contains(@class,'ddCardImg large PID084')])")
	public WebElement ACQ_TYpreferredcardart;
	
	@FindBy(xpath="(//img[@src='/CRD/images/card_no_reflection/citi-thankyou-premier-credit-card.jpg'])[1]")
	public WebElement TYpremierPDPpage;
	
	@FindBy(xpath="(//div[contains(@class,'ddCardImg large PID089')])")
	public WebElement ACQ_TYpremiercardart;

	@FindBy(xpath="(//img[@src='/CRD/images/card_no_reflection/expedia-plus.jpg'])[1]")
	public WebElement ExpediaPDPpage;
	
	@FindBy(xpath="//a[@class='accept']")
	public WebElement Expediainterdictionpage;

	@FindBy(xpath="(//img[@src='/CRD/images/card_no_reflection/expedia-plus-voyager.jpg'])[1]")
	public WebElement ExpediavoyagerPDPpage;



}
 