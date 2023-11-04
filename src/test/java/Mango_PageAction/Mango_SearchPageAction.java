package Mango_PageAction;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import Mango_PageLocator.Mango_SearchPageLocator;
import Mango_Utility.Mango_Base;
import Mango_Utility.Mango_Utiliti;


public class Mango_SearchPageAction extends Mango_Base{

	Mango_SearchPageLocator mango_SearchPageLocator = new Mango_SearchPageLocator();
	
	
	public void scrolldownandcheckusercanclickonbedroomcheckbox() throws Exception {
	
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		Thread.sleep(2000);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(mango_SearchPageLocator.clCheckBox).click().build().perform();
		Thread.sleep(3000);
		Mango_Utiliti.takeMyScreenshot(driver, "click bedroom checkbox");
		//mango_SearchPageLocator.clCheckBox.click();
		Thread.sleep(3000);
	
	}
	
}
