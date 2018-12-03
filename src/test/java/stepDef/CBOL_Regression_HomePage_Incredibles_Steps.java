package stepDef;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageActions.CBOL_Regression_HomePage_Incredibles_Actions;

public class CBOL_Regression_HomePage_Incredibles_Steps {
	
	final Log log = LogFactory.getLog(CBOL_Regression_HomePage_Incredibles_Steps.class.getName());
	CBOL_Regression_HomePage_Incredibles_Actions homepageincrediblesactions = new CBOL_Regression_HomePage_Incredibles_Actions();
	
	@Given("^I launch \"([^\"]*)\"$")
	public void i_select_English(String url) throws Throwable {
		homepageincrediblesactions.openurl(url);	    
	}
	
	@When("^I select \"([^\"]*)\"$")
	public void i_select_(String Language) throws Throwable {
		homepageincrediblesactions.selectlanguage(Language);
	}

	@And("^I click Banking menu$")
	public void i_click_Banking_menu() throws Throwable {
		homepageincrediblesactions.bankingmenu();
	}

	@And("^I get Banking overview page \"([^\"]*)\"$")
	public void i_get_Banking_overview_page(String Language) throws Throwable {
		homepageincrediblesactions.bankingpage(Language);
	}

	@And("^I validate \"([^\"]*)\" link$")
	public void i_validate_link(String Tab) throws Throwable {
		homepageincrediblesactions.tab(Tab);
	}

	@Then("^I validate \"([^\"]*)\" module$")
	public void i_validate_module(String Package) throws Throwable {
		homepageincrediblesactions.module(Package);
	}

}
