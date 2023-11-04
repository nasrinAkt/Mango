package Mango_PageAction;

import org.openqa.selenium.interactions.Actions;

import Mango_PageLocator.Mango_HomePageLocator;
import Mango_Utility.Mango_Base;

public class Mango_HomePageAction extends Mango_Base{
	Mango_HomePageLocator mango_HomePageLocator = new Mango_HomePageLocator();
	
	public void clickmyaccountman() throws Exception {
		Thread.sleep(2000);
		mango_HomePageLocator.clMyAcc.click();
		
		
	}
	
	public void clickcreateanaccountman() throws Exception {
		Thread.sleep(2000);
		mango_HomePageLocator.clCA.click();
			
	}
	public void mousehoveronDiyprojectsandideas() throws Exception {
		Actions ac = new Actions(driver);
		ac.moveToElement(mango_HomePageLocator.mouseOnProjects).build().perform();
		Thread.sleep(2000);
	}
	public void clickonBedroom() {
		
		mango_HomePageLocator.clBedroom.click();
		
	}
}
