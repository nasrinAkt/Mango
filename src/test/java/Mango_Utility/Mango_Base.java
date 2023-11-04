package Mango_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class Mango_Base {

	public static WebDriver driver;
	public static Properties manPro;
	
	public Mango_Base() {
	try {
		FileInputStream ManFle = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//Mango_Config//Mango_Config.Properties"));	
		manPro = new Properties();
		manPro.load(ManFle);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Please,look the code");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}
	
	public void ManBrowser() {
		
		String ManAllBrowser = manPro.getProperty("ManBrowser1");
		
		if(ManAllBrowser.equalsIgnoreCase("Chrome")) {
		System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+("//Mango_ChromeDriver//chromedriver.exe"));
	    ChromeOptions sis = new ChromeOptions();
		sis.addArguments("--remote-allow-origins=*"); 
	    driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Mango_Utiliti.pageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Mango_Utiliti.implicitlyWait));
		driver.manage().window().maximize();	
				
			
			
		}
		else if(ManAllBrowser.equalsIgnoreCase("Edge")) {
		System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+("//Mango_EdgeDriver//msedgedriver.exe"));
		EdgeOptions sis1 = new EdgeOptions();
	    sis1.addArguments("--remote-allow-origins=*"); 
		driver = new EdgeDriver();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Mango_Utiliti.pageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Mango_Utiliti.implicitlyWait));
		driver.manage().window().maximize();	
						
			
			
		}
		
		
	}
	public static void ManLaunchURL(String URL) {
		driver.get(manPro.getProperty("ManURL"));
		
		
		
	}
	
		
	}
	
	
	
	
	

