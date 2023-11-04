package Mango_StepDefinition;

import Mango_PageAction.Mango_CreateAccountPageAction;
import Mango_PageAction.Mango_HomePageAction;
import Mango_Utility.Mango_Base;
import Mango_Utility.Mango_Utiliti;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Mango_CreateAccount extends Mango_Base {
	Mango_HomePageAction mango_HomePageAction = new Mango_HomePageAction();
	Mango_CreateAccountPageAction mango_CreateAccountPageAction = new Mango_CreateAccountPageAction();
	
	@Given("^open <\"([^\"]*)\"> man$")
	public void open_man(String URL) throws Throwable {
		ManLaunchURL(URL);
		Mango_Utiliti.takeMyScreenshot(driver, "homepage");
	}

	@Then("^click my account man$")
	public void click_my_account_man() throws Throwable {
		mango_HomePageAction.clickmyaccountman();  
	}

	@Then("^click create an account man$")
	public void click_create_an_account_man() throws Throwable {
		mango_HomePageAction.clickcreateanaccountman();  
	}

	@Then("^click select & continue$")
	public void click_select_continue() throws Throwable {
		mango_CreateAccountPageAction.clickselectcontinue();  
	}

	@Then("^enter invalid email password zipcode and phone$")
	public void enter_invalid_email_password_zipcode_and_phone() throws Throwable {
		mango_CreateAccountPageAction.enterinvalidemailpasswordzipcodeandphone();
	}

	@Then("^click create an account again$")
	public void click_create_an_account_again() throws Throwable {
		mango_CreateAccountPageAction.clickcreateanaccountagain();   
	}

	@Then("^Verify user can not create account$")
	public void verify_user_can_not_create_account() throws Throwable {
		mango_CreateAccountPageAction.Verifyusercannotcreateaccount();  
	}


	
	
	
	
}
