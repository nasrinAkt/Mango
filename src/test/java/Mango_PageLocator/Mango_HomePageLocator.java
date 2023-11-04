package Mango_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Mango_Utility.Mango_Base;

public class Mango_HomePageLocator extends Mango_Base {

	public Mango_HomePageLocator() {
		
	PageFactory.initElements(driver,this);	
		
		
	}
	
	@FindBy(id ="headerMyAccountTitle")
	public WebElement clMyAcc;
	
	@FindBy(xpath="//span[text()='Create an Account']")
	public WebElement clCA;
	
	@FindBy(linkText ="DIY Projects & Ideas")
	public WebElement mouseOnProjects;
	
	@FindBy(xpath ="//*[@id=\"diyFlyout\"]/section/div/div/div[1]/div/ul/li[4]/a")
	public WebElement clBedroom;
}
