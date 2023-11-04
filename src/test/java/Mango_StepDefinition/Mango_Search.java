package Mango_StepDefinition;

import Mango_PageAction.Mango_HomePageAction;
import Mango_PageAction.Mango_SearchPageAction;
import Mango_Utility.Mango_Base;
import cucumber.api.java.en.Then;

public class Mango_Search extends Mango_Base{
	Mango_HomePageAction mango_HomePageAction = new Mango_HomePageAction();
	Mango_SearchPageAction mango_SearchPageAction = new Mango_SearchPageAction();
	
	@Then("^mouse hover on Diy projects and ideas$")
	public void mouse_hover_on_Diy_projects_and_ideas() throws Throwable {
		mango_HomePageAction.mousehoveronDiyprojectsandideas();  
	}

	@Then("^click on Bedroom$")
	public void click_on_Bedroom() throws Throwable {
		mango_HomePageAction.clickonBedroom(); 
	}

	@Then("^scroll down and check user can click on bedroom checkbox$")
	public void scroll_down_and_check_user_can_click_on_bedroom_checkbox() throws Throwable {
		mango_SearchPageAction.scrolldownandcheckusercanclickonbedroomcheckbox(); 
	}


}
