package stepDef;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageActions.CBOL_Regression_MRC_Dashboard_Validation_Action;

public class CBOL_Regression_MRC_Dashboard_Validation_Step {
	
	final Log log = LogFactory.getLog(CBOL_Regression_MRC_Dashboard_Validation_Step.class.getName());
	CBOL_Regression_MRC_Dashboard_Validation_Action cbol_Regression_MRC_Dashboard_Validation_Action = new CBOL_Regression_MRC_Dashboard_Validation_Action();
	
	@Given("^I launch \"([^\"]*)\"$")
	public void i_select_English(String url) throws Throwable {
	cbol_Regression_MRC_Dashboard_Validation_Action.openurl(url);	    
	}
	
	@When("^I login using valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_login_using_valid_and(String userid, String password)  {
	cbol_Regression_MRC_Dashboard_Validation_Action.login(userid, password);
	}
	
	@And("^I see dashboard$")
	public void i_see_dashboard() throws Throwable {
	cbol_Regression_MRC_Dashboard_Validation_Action.dashboard();
	}

	@And("^I click on Statements and Documents under services link$")
	public void i_click_on_Statements_and_Documents_under_services_link() throws Throwable {
	cbol_Regression_MRC_Dashboard_Validation_Action.statementsanddocuments();
	}

	@And("^I select Account Snapshot link to verify the page$")
	public void i_select_Account_Snapshot_link_to_verify_the_page() throws Throwable {
		cbol_Regression_MRC_Dashboard_Validation_Action.accountsnapshot();
	}

	@Then("^I sign Off$")
	public void i_sign_Off() throws Throwable {
		cbol_Regression_MRC_Dashboard_Validation_Action.signoff();
	}
	
	

}
