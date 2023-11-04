package Mango_PageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Mango_PageLocator.Mango_CreateAccountPageLocator;
import Mango_Utility.Mango_Base;
import Mango_Utility.Mango_TestData;
import Mango_Utility.Mango_Utiliti;

public class Mango_CreateAccountPageAction extends Mango_Base {
	
	Mango_CreateAccountPageLocator mango_CreateAccountPageLocator = new Mango_CreateAccountPageLocator();

	
	public void clickselectcontinue() throws InterruptedException{
		Thread.sleep(3000);
		mango_CreateAccountPageLocator.clSC.click();	
			
	}
	public void enterinvalidemailpasswordzipcodeandphone() throws Exception {
		Thread.sleep(2000);
		mango_CreateAccountPageLocator.eEm.sendKeys(Mango_TestData.manIVemail);
		Thread.sleep(2000);
		
		mango_CreateAccountPageLocator.ePW.sendKeys(Mango_TestData.manIVpw);
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(0,300)");
		
		mango_CreateAccountPageLocator.eZC.sendKeys(Mango_TestData.manIVzc);
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		mango_CreateAccountPageLocator.eP.sendKeys(Mango_TestData.manIVpn);
		Thread.sleep(2000);
		 Mango_Utiliti.takeMyScreenshot(driver, "createAccount page");
		
	}
	public void clickcreateanaccountagain() throws Exception {
		Thread.sleep(2000);
		mango_CreateAccountPageLocator.clCA.click();
		
	}
	public void  Verifyusercannotcreateaccount() throws Exception {
	boolean fk = mango_CreateAccountPageLocator.eM.isDisplayed();	
	Assert.assertTrue(fk);
	
	Thread.sleep(2000);
	}
}
