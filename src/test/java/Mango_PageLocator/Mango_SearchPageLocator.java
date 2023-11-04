package Mango_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Mango_Utility.Mango_Base;

public class Mango_SearchPageLocator extends Mango_Base{

	public Mango_SearchPageLocator() {
		
		PageFactory.initElements(driver,this);	
			
			
		}
	
	@FindBy(xpath ="//h2[text()='Keyword']")
	public WebElement scrolldownUntill;
	
	@FindBy(xpath ="//label[@for='agn4']")
	public WebElement clCheckBox;
		
		
	
	
}
