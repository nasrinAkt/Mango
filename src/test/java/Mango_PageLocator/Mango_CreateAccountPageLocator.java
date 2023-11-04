package Mango_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Mango_Utility.Mango_Base;

public class Mango_CreateAccountPageLocator extends Mango_Base {

	public Mango_CreateAccountPageLocator() {
		
		PageFactory.initElements(driver,this);	
			
			
		}
		
		@FindBy(xpath ="(//span[text()='Select & Continue'])[1]")
		public WebElement clSC ;
		
		@FindBy(id ="email")
		public WebElement eEm ;
		
		@FindBy(id ="password-input-field")
		public WebElement ePW ;
		
		@FindBy(id ="zipCode")
		public WebElement eZC;
		@FindBy(id ="phone")
		public WebElement eP ;
		
		@FindBy(xpath ="//span[text()='Create an Account']")
		public WebElement clCA ;
		@FindBy(xpath ="//span[text()='Please provide your email address, formatted as you@domain.com.']")
		public WebElement eM ;
		
		
		
	
	
	
}
