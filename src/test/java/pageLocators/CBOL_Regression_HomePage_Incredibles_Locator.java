package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CBOL_Regression_HomePage_Incredibles_Locator {

	@FindBy(xpath="(//a[@lang='es'])")
	public WebElement Espanol;
	
	@FindBy(xpath="(//a[contains(text(),'English')])")
	public WebElement English;

	@FindBy(id="banking")
	public WebElement Banking;
	
	@FindBy(xpath="(//ul[@class='breadcrumb'])")
	public WebElement Breadcrumb;
	
	@FindBy(xpath="(//h6[contains(text(),'Select Residential State')])")
	public WebElement Statetitle;
	
	@FindBy(xpath="(//select[@id='stateSelectorSelectId'])")
	public WebElement Stateselect;
	
	@FindBy(xpath="(//option[@value='FL'])")
	public WebElement Statename;
	
	@FindBy(xpath="(//button[contains(text(),'Select')])")
	public WebElement Selectbutton;
	
	@FindBy(xpath="(//h6[contains(text(),'Seleccionar Estado de Residencia')])")
	public WebElement EsStatetitle;
	
	@FindBy(xpath="(//button[contains(text(),'Seleccionar')])")
	public WebElement EsSelectbutton;
	
	@FindBy(xpath="(//h1[contains(text(),'Checking')])")
	public WebElement CheckingTitle;
	
	@FindBy(xpath="(//span[contains(text(),'Checking')])")
	public WebElement Checkingtab; 
    
    @FindBy(xpath="(//span[contains(text(),'Cuenta de Cheques')])")
	public WebElement EsCheckingtab;
  
	@FindBy(xpath="(//span[contains(text(),'CDs & Banking IRAs')])")
	public WebElement CDandIRAtab;
	
	@FindBy(xpath="(//span[contains(text(),'Savings')])")
	public WebElement Savingtab;
	
	@FindBy(xpath="(//span[contains(text(),'Ahorros')])")
	public WebElement EsSavingtab;

	@FindBy(xpath="(//a[contains(text(),'See Details')])[1]")
	public WebElement CitiGoldSeeDetails;
	
	@FindBy(xpath="(//a[contains(text(),'See Details')])[2]")
	public WebElement CitiprioritySeeDetails;
	
	@FindBy(xpath="(//a[contains(text(),'Ver Detalles')])[2]")
	public WebElement EsCitiprioritySeeDetails;
	
	@FindBy(xpath="(//a[contains(text(),'See Details')])[3]")
	public WebElement CitibankSeeDetails;
	
	@FindBy(xpath="(//a[contains(text(),'See Details')])[4]")
	public WebElement BasicBankingSeeDetails;
	
	@FindBy(xpath="(//a[contains(text(),'See Details')])[5]")
	public WebElement AccessSeeDetails;
	
	@FindBy(xpath="(//a[contains(text(),'See Details')])[6]")
	public WebElement CitiSavingSeeDetails;
	
	@FindBy(xpath="(//a[contains(text(),'Ver Detalles')])[6]")
	public WebElement EsCitiSavingSeeDetails;
	
	@FindBy(xpath="(//a[contains(text(),'See Details')])[7]")
	public WebElement CDSeeDetails;
	
	@FindBy(xpath="(//a[contains(text(),'See Details')])[8]")
	public WebElement BankingIRASeeDetails;
	
	@FindBy(xpath="(//p[contains(text(),'The Citibank Account Package')])")
	public WebElement Citibankmodule;
	
	@FindBy(xpath="(//p[contains(text(),'Citi Priority Package')])")
	public WebElement Citiprioritymodule;
	
	@FindBy(xpath="(//p[contains(text(),'Paquete Citi Priority')])")
	public WebElement EsCitiprioritymodule;
	
	@FindBy(xpath="((//p[contains(text(),'Citigold')])[1]")
	public WebElement Citigoldmodule;
	
	@FindBy(xpath="(//p[contains(text(),'Basic Banking Package')])")
	public WebElement BasicBankingmodule;
	
	@FindBy(xpath="(//p[contains(text(),'Access Account Package')])")
	public WebElement AccessAccountmodule;
	
	@FindBy(xpath="(//h3[contains(text(),'Saving Made Simple')])")
	public WebElement Citisavingmodule;
	
	@FindBy(xpath="(//h3[contains(text(),'Ahorrar es fácil')])")
	public WebElement EsCitisavingmodule;
	
	@FindBy(xpath="(//p[contains(text(),'Certificates of Deposit (CDs)')])")
	public WebElement CDmodule;
	
	@FindBy(xpath="(//p[contains(text(),'Banking IRAs')])")
	public WebElement BankingIRAmodule;
	
	@FindBy(xpath="(//h2[contains(text(),'Banking and Wealth Management')])")
	public WebElement Citigoldpage1;
	
	@FindBy(xpath="(//h2[contains(text(),'Citigold Details')])")
	public WebElement Citigoldpage2;
	
	@FindBy(xpath="(//h2[contains(text(),'Priority Banking with Dedicated Support')])")
	public WebElement Citiprioritypage1;  
	
	@FindBy(xpath="(//h2[contains(text(),'Servicios Bancarios Prioritarios con Apoyo Especializado')])")
	public WebElement EsCitiprioritypage1;
	
	@FindBy(xpath="(//h2[contains(text(),'Citi Priority Details')])")
	public WebElement Citiprioritypage2;
	
	@FindBy(xpath="(//h2[contains(text(),'Detalles de Citi Priority')])")
	public WebElement EsCitiprioritypage2;
	
	@FindBy(xpath="(//h2[contains(text(),'Full-Feature Relationship Checking')])")
	public WebElement Citibankpage1;
	
	@FindBy(xpath="(//h2[contains(text(),'The Citibank Account Details')])")
	public WebElement Citibankpage2;
	
	@FindBy(xpath="(//h2[contains(text(),'Simple Checking')])")
	public WebElement Basicbankingpage1;
	
	@FindBy(xpath="(//h2[contains(text(),'Basic Banking Account Details')])")
	public WebElement Basicbankingpage2;
	
	@FindBy(xpath="(//h2[contains(text(),'Affordable Access Banking')])")
	public WebElement Accessaccountpage1;
	
	@FindBy(xpath="(//h2[contains(text(),'Access Account Details')])")
	public WebElement Accessaccountpage2;
	
	@FindBy(xpath="(//h2[contains(text(),'Ahorrar es Fácil')])")
	public WebElement EsCitisavingpage1;
	
	@FindBy(xpath="(//h2[contains(text(),'Detalles de la Cuenta de Ahorros Citi')])")
	public WebElement EsCitisavingpage2;
	
	@FindBy(xpath="(//h1[contains(text(),'Certificates of Deposit')])")
	public WebElement CDpage1;
	
	@FindBy(xpath="(//h2[contains(text(),'Certificates of Deposit (CDs) Details')])")
	public WebElement CDpage2;
	
	@FindBy(xpath="(//h2[contains(text(),'Secure Savings For Your Future')])")
	public WebElement BankingIRApage1;
	
	@FindBy(xpath="(//h2[contains(text(),'How Banking IRAs Work')])")
	public WebElement BankingIRApage2;

	@FindBy(xpath="(//ul[@class='breadcrumb']//a[contains(text(),'Home')])")
	public WebElement breadcrumbhome;
	
	@FindBy(xpath="(//ul[@class='breadcrumb']//a[contains(text(),'Inicio')])")
	public WebElement Esbreadcrumbhome;
	
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

    @FindBy(xpath="(//a[contains(text(),'citi.com')])[1]")
    public WebElement citilink;
	
    
	
			 
	
}
