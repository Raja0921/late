package pageActions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pageLocators.MKTLinkvalLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class MKTLinkvalActions {
	MKTLinkvalLocators MKTlinkvalLocators = new MKTLinkvalLocators();
	

	
	public  MKTLinkvalActions()
	{
		this.MKTlinkvalLocators= new MKTLinkvalLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), MKTlinkvalLocators);
	}
	
	public void homepage(String url) throws InterruptedException {
		SeleniumDriver.getDriver().get(url);
		Thread.sleep(9000);
		
	}

	public void clicksearchcard() {
		MKTlinkvalLocators.Searchcardclick.click();
		
	}

	public void enterandselectcardname(String CardName) {
		MKTlinkvalLocators.Enterandselectcardname.click();
		MKTlinkvalLocators.Enterandselectcardname.sendKeys(CardName);
		MKTlinkvalLocators.Enterandselectcardname.sendKeys(Keys.RETURN);
		
		switch(CardName)
		{
		case "Simplicity":
			MKTlinkvalLocators.SimplicityPDPpage.isDisplayed();
			System.out.println("Simplicity PDPage is displayed");
			break;
			
		case "Double cash":
			
			MKTlinkvalLocators.DoublecashPDPpage.isDisplayed();
			System.out.println("Doublecash PDP page get displayed");
			break;
			
		case "Platinum":
			MKTlinkvalLocators.AAPlatinumPDPpage.isDisplayed();
			System.out.println("AAPlatinum PDP page get displayed");
			break;
			
		case "CitiBusiness":
			MKTlinkvalLocators.CitibusinessAAPlatinumPDPpage.isDisplayed();
			System.out.println("Citibusiness AAPlatinum PDP page get displayed");
			break;
			
		case "Executive":
			MKTlinkvalLocators.AAExecutivePDPpage.isDisplayed();
			System.out.println("AAExecutive PDP page get displayed");
			break;
 			
 		case "Costco Visa":
 			MKTlinkvalLocators.CostcovisaPDPpage.isDisplayed();
 			System.out.println("Costco Visa PDP page get displayed");
 			break;
 			
 		case "Costco Business":
			MKTlinkvalLocators.CostcobusinessPDPpage.isDisplayed();
			System.out.println("Costco Business PDP page get displayed");
			break;
			
		case "ATT Access":
			MKTlinkvalLocators.ATTaccessPDPpage.isDisplayed();
			System.out.println("ATT Access PDP page get displayed");
			break;
			
		case "Secured":
			MKTlinkvalLocators.SecuredPDPpage.isDisplayed();
			System.out.println("Secured PDP page get displayed");
			break;
			
		case "College":
			MKTlinkvalLocators.TYPcollegePDPpage.isDisplayed();
			System.out.println("TYPcollege PDP page get displayed");
			break;
			
		case "Preferred":
			MKTlinkvalLocators.TYpreferredPDPpage.isDisplayed();
			System.out.println("TYpreferred PDP page get displayed");
			break;
			
		case "Premier":
			MKTlinkvalLocators.TYpremierPDPpage.isDisplayed();
			System.out.println("TYpremier PDP page get displayed");
			break;
			
		case "Expedia":
			MKTlinkvalLocators.ExpediaPDPpage.isDisplayed();
			System.out.println("Expedia PDP page get displayed");
			break;
			
		case "Voyager":
			MKTlinkvalLocators.ExpediavoyagerPDPpage.isDisplayed();
			System.out.println("Expedia Voyager PDP page get displayed");
			break;
			

 		default:
 			System.out.println("Displayed Card Art is not expected");
		
		}

	}
	public void PDPpage() {
		
			
		System.out.println("Corresponding PDP Page for the card is Displayed");
		SeleniumHelper.takeScreenshot("PDP page");
				
	}

	public void applynowlinkvalidation(String CardName) throws InterruptedException {
		  
		 					      Thread.sleep(3000);
 								  Actions a = new Actions(SeleniumDriver.getDriver());
 								  a.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
 								  WebElement target = MKTlinkvalLocators.Applynowclick;
 								  a.moveToElement(target).sendKeys(Keys.CONTROL).click().build().perform();
 		
 						          System.out.println("New tab of apply now is displayed");
 								  Thread.sleep(5000);
 								  Set<String> handles = SeleniumDriver.getDriver().getWindowHandles();
 						          Iterator<String> it = handles.iterator();
 						          String parent = it.next();
 						          Thread.sleep(3000);
 						          System.out.println("Parent Window  "+ parent); 
 						          String child = it.next();
 						          System.out.println("Child Window  " + child);
 						          SeleniumDriver.getDriver().switchTo().window(child);
 						          Thread.sleep(3000);
 						         
 						        switch(CardName)
 						 		{
 						 		case "Simplicity":
 						 			MKTlinkvalLocators.ACQ_Simplicitycardart.isDisplayed();		
	 								System.out.println("ACQ page simplicity card Art get displayed ");
	 								System.out.println("ACQ  Page is displayed " + MKTlinkvalLocators.TellusaboutYourselfText.isDisplayed());
	 								System.out.println("Tell about yourself is displayed");
	 								SeleniumHelper.takeScreenshot("Simplicity ACQ page");
	 								SeleniumDriver.getDriver().switchTo().window(parent);
	 								System.out.println("switched to pdp page");
	 								break;
					 	
 						 		case "Double cash":
 									
 									MKTlinkvalLocators.ACQ_Doublecashcardart.isDisplayed();
 									System.out.println("ACQ page Doublecash card art get displayed");
 									System.out.println("ACQ  Page is displayed " + MKTlinkvalLocators.TellusaboutYourselfText.isDisplayed());
 	 								System.out.println("Tell about yourself is displayed");
 	 								SeleniumHelper.takeScreenshot("Double cash ACQ page");
 	 								SeleniumDriver.getDriver().switchTo().window(parent);
 	 								System.out.println("switched to pdp page");
 									break;
 									
 								case "Platinum":
 									MKTlinkvalLocators.ACQ_AAPlatinumcardart.isDisplayed();
 									System.out.println("ACQ page AAPlatinum card art get displayed");
 									System.out.println("ACQ  Page is displayed " + MKTlinkvalLocators.TellusaboutYourselfText.isDisplayed());
 	 								System.out.println("Tell about yourself is displayed");
 	 								SeleniumHelper.takeScreenshot("Platinum ACQ page");
 	 								SeleniumDriver.getDriver().switchTo().window(parent);
 	 								System.out.println("switched to pdp page");
 									break;
 									
 								case "CitiBusiness":
 									MKTlinkvalLocators.ACQ_CitibusinessAAPlatinumcardart.isDisplayed();
 									System.out.println("ACQ page Citibusiness AAPlatinum card art get displayed");
 									System.out.println("ACQ  Page is displayed " + MKTlinkvalLocators.TellusaboutYourselfText.isDisplayed());
 	 								System.out.println("Tell about yourself is displayed");
 	 								SeleniumHelper.takeScreenshot("Citibusiness ACQ page");
 	 								SeleniumDriver.getDriver().switchTo().window(parent);
 	 								System.out.println("switched to pdp page");
 									break;
 									
 								case "Executive":
 									MKTlinkvalLocators.ACQ_AAExecutivecardart.isDisplayed();
 									System.out.println("ACQ page AAExecutive card art get displayed");
 									System.out.println("ACQ  Page is displayed " + MKTlinkvalLocators.TellusaboutYourselfText.isDisplayed());
 	 								System.out.println("Tell about yourself is displayed");
 	 								SeleniumHelper.takeScreenshot("Executive ACQ page");
 	 								SeleniumDriver.getDriver().switchTo().window(parent);
 	 								System.out.println("switched to pdp page");
 									break;
 						 			
 						 		case "Costco Visa":
 						 			MKTlinkvalLocators.ACQ_Costcovisacardart.isDisplayed();
 						 			System.out.println("ACQ page Costco card Art get displayed");
 						 			System.out.println("ACQ  Page is displayed " + MKTlinkvalLocators.TellusaboutYourselfText.isDisplayed());
 	 								System.out.println("Tell about yourself is displayed");
 	 								SeleniumHelper.takeScreenshot("Costco visa ACQ page");
 	 								SeleniumDriver.getDriver().switchTo().window(parent);
 	 								System.out.println("switched to pdp page");
 						 			break;
 						 			
 						 		case "Costco Business":
 									MKTlinkvalLocators.ACQ_Costcobusinesscardart.isDisplayed();
 									System.out.println("ACQ page Costco Business card art get displayed");
 									System.out.println("ACQ  Page is displayed " + MKTlinkvalLocators.TellusaboutYourselfText.isDisplayed());
 	 								System.out.println("Tell about yourself is displayed");
 	 								SeleniumHelper.takeScreenshot("Costco Business ACQ page");
 	 								SeleniumDriver.getDriver().switchTo().window(parent);
 	 								System.out.println("switched to pdp page");
 									break;
 									
 								case "ATT Access":
 									MKTlinkvalLocators.ACQ_ATTaccesscardart.isDisplayed();
 									System.out.println("ACQ page ATT Access card art get displayed");
 									System.out.println("ACQ  Page is displayed " + MKTlinkvalLocators.TellusaboutYourselfText.isDisplayed());
 	 								System.out.println("Tell about yourself is displayed");
 	 								SeleniumHelper.takeScreenshot("ATT Access ACQ page");
 	 								SeleniumDriver.getDriver().switchTo().window(parent);
 	 								System.out.println("switched to pdp page");
 									break;
 									
 								case "Secured":
 									MKTlinkvalLocators.ACQ_Securedcardart.isDisplayed();
 									System.out.println("ACQ page Secured card art get displayed");
 									System.out.println("ACQ  Page is displayed " + MKTlinkvalLocators.TellusaboutYourselfText.isDisplayed());
 	 								System.out.println("Tell about yourself is displayed");
 	 								SeleniumHelper.takeScreenshot("Secured ACQ page");
 	 								SeleniumDriver.getDriver().switchTo().window(parent);
 	 								System.out.println("switched to pdp page");
 									break;
 									
 									
 								case "College":
 									MKTlinkvalLocators.ACQ_TYPcollegecardart.isDisplayed();
 									System.out.println("ACQ page TYPcollege card art get displayed");
 									System.out.println("ACQ  Page is displayed " + MKTlinkvalLocators.TellusaboutYourselfText.isDisplayed());
 	 								System.out.println("Tell about yourself is displayed");
 	 								SeleniumHelper.takeScreenshot("College ACQ page");
 	 								SeleniumDriver.getDriver().switchTo().window(parent);
 	 								System.out.println("switched to pdp page");
 									break;
 									
 								case "Preferred":
 									MKTlinkvalLocators.ACQ_TYpreferredcardart.isDisplayed();
 									System.out.println("ACQ page TYpreferred card art get displayed");
 									System.out.println("ACQ  Page is displayed " + MKTlinkvalLocators.TellusaboutYourselfText.isDisplayed());
 	 								System.out.println("Tell about yourself is displayed");
 	 								SeleniumHelper.takeScreenshot("Preferred ACQ page");
 	 								SeleniumDriver.getDriver().switchTo().window(parent);
 	 								System.out.println("switched to pdp page");
 									break;
 									
 								case "Premier":
 									MKTlinkvalLocators.ACQ_TYpremiercardart.isDisplayed();
 									System.out.println("ACQ page TYpremier card art get displayed");
 									System.out.println("ACQ  Page is displayed " + MKTlinkvalLocators.TellusaboutYourselfText.isDisplayed());
 	 								System.out.println("Tell about yourself is displayed");
 	 								SeleniumHelper.takeScreenshot("Premier ACQ page");
 	 								SeleniumDriver.getDriver().switchTo().window(parent);
 	 								System.out.println("switched to pdp page");
 									break;
 									
 								case "Expedia":
 									WebElement Expediainterdictionpage1 = MKTlinkvalLocators.Expediainterdictionpage;
									a.moveToElement(Expediainterdictionpage1).sendKeys(Keys.CONTROL).click().build().perform();
									System.out.println("Take me to expedia button is clicked");
	 							    String url = SeleniumDriver.getDriver().getCurrentUrl();
	 							    if(url.contains("www.expedia.com"))
	 							    {
	 	 							System.out.println("Expedia Voyager page get displayed");
	 	 							SeleniumHelper.takeScreenshot("Expedia page");
	 								}
	 								SeleniumDriver.getDriver().switchTo().window(parent);
	 								System.out.println("switched to pdp page");
	 								break;
 									
 								case "Voyager":
 									
 									Thread.sleep(3000);
 									WebElement Expediainterdictionpage2 = MKTlinkvalLocators.Expediainterdictionpage;
 									a.moveToElement(Expediainterdictionpage2).sendKeys(Keys.CONTROL).click().build().perform();
 									System.out.println("Take me to expedia button is clicked");
 							        String url2 = SeleniumDriver.getDriver().getCurrentUrl();
 									if(url2.contains("www.expedia.com"))
 									{
 	 								System.out.println("Expedia Voyager page get displayed");
 	 								SeleniumHelper.takeScreenshot("Voyager page");
 									}
 								    SeleniumDriver.getDriver().switchTo().window(parent);
 									System.out.println("switched to pdp page");
 									break;
 		
							 	default:
							 		System.out.println("Displayed Card art is not expected");
							 		SeleniumHelper.takeScreenshot("Invalid page");
			 						break;
 						 		}
 								
		
	}
	
	public void pricinginfolinkvalidation() throws InterruptedException {
				
		Thread.sleep(6000);
		if(MKTlinkvalLocators.Pricinginfolink.isDisplayed())
		{
		Thread.sleep(6000);
        WebElement element_pricinginfo = MKTlinkvalLocators.Pricinginfolink;
        JavascriptExecutor executor = (JavascriptExecutor)SeleniumDriver.getDriver();
        executor.executeScript("arguments[0].click();", element_pricinginfo);
        System.out.println("pricinginfolink is clicked");     
        Set<String> handles = SeleniumDriver.getDriver().getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parent = it.next();
        String child=it.next();
        String Grandchild=it.next();
        System.out.println("Child" + child);
        SeleniumDriver.getDriver().switchTo().window(Grandchild);
        Thread.sleep(3000);
        System.out.println("Citi Disclosure text is displayed " + MKTlinkvalLocators.Pricinginfopage.isDisplayed());
        System.out.println("pricinginfopage get displayed");
        SeleniumHelper.takeScreenshot("pricing info page");
        SeleniumDriver.getDriver().switchTo().window(parent);
		}
		else
		{
			Thread.sleep(6000);
			String parentwindow = SeleniumDriver.getDriver().getWindowHandle();
	        System.out.println("First Parent Window window handle  "+ parentwindow);
	        WebElement element_pricinginfo = MKTlinkvalLocators.Simplicitypricinginfolink;
	        JavascriptExecutor executor = (JavascriptExecutor)SeleniumDriver.getDriver();
	        executor.executeScript("arguments[0].click();", element_pricinginfo);
	        System.out.println("Pricinginfolink is clicked");     
	        Set<String> handles = SeleniumDriver.getDriver().getWindowHandles();
	        Iterator<String> it = handles.iterator();
	        String parent = it.next();
	        System.out.println("Second Parent Window window handle  "+ parent);
	        Thread.sleep(5000);
	        String child=it.next();
	        String Grandchild=it.next();
	        System.out.println("Child" + child);
	        SeleniumDriver.getDriver().switchTo().window(Grandchild);
	        Thread.sleep(3000);
	        System.out.println("Citi Disclosure text is displayed " + MKTlinkvalLocators.Pricinginfopage.isDisplayed());
	        System.out.println("pricing info page get displayed");
	        SeleniumHelper.takeScreenshot("pricing info page");
	        SeleniumDriver.getDriver().switchTo().window(parent);
		}
	}

	public void additionalinfolinkvalidation() throws InterruptedException {
		
		Thread.sleep(6000);
		if(MKTlinkvalLocators.Additionalinfolink.isDisplayed())
		{
		WebElement element_addinfo = MKTlinkvalLocators.Additionalinfolink;
        JavascriptExecutor executor = (JavascriptExecutor)SeleniumDriver.getDriver();
        executor.executeScript("arguments[0].click();", element_addinfo);
        System.out.println("Additional info link is clicked");
        Set<String> handles = SeleniumDriver.getDriver().getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parent = it.next();
        String child = it.next();
        String Grandchild=it.next();
        String GreatGrandchild=it.next();
        SeleniumDriver.getDriver().switchTo().window(GreatGrandchild);
        Thread.sleep(3000);
		MKTlinkvalLocators.Additionalinfopage.isDisplayed();
		System.out.println("Additional info page get displayed");
		SeleniumHelper.takeScreenshot("Additional info page");
		SeleniumDriver.getDriver().switchTo().window(parent);
		}
		else
		{
			Thread.sleep(6000);
			WebElement element_addinfo = MKTlinkvalLocators.Simplicityadditionalinfolink;
	        JavascriptExecutor executor = (JavascriptExecutor)SeleniumDriver.getDriver();
	        executor.executeScript("arguments[0].click();", element_addinfo);
	        System.out.println("Additional info link is clicked");
	        Set<String> handles = SeleniumDriver.getDriver().getWindowHandles();
	        Iterator<String> it = handles.iterator();
	        String parent = it.next();
	        String child = it.next();
	        String Grandchild=it.next();
	        String GreatGrandchild=it.next();
	        SeleniumDriver.getDriver().switchTo().window(GreatGrandchild);
	        Thread.sleep(3000);
			MKTlinkvalLocators.Additionalinfopage.isDisplayed();
			System.out.println("Additional info page get displayed");
			SeleniumHelper.takeScreenshot("Additional info page");
			SeleniumDriver.getDriver().switchTo().window(parent);
		}
	}
	
}