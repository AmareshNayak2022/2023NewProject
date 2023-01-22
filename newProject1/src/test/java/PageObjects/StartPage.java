package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NHSBSA.TestBase;

  

public class StartPage extends TestBase {
		
	@FindBy(xpath="//input[@id='next-button']")
	WebElement startNowbutton;
	
	public StartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		//PageFactory is the class and initelements is teh method is used to 
		//initilze the webelement s
		
	}
	
		
	public void clickStartNow()
	{
		startNowbutton.click();
	} 

}
