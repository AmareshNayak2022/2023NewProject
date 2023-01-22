package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NHSBSA.TestBase;

public class CountryPage extends TestBase{
	
	@FindBy(xpath="//input[@id='radio-england']")
	WebElement radioEnland;
	@FindBy(xpath="//input[@id='radio-scotland']")
	WebElement radioScotland;
	@FindBy(xpath="//input[@id='radio-wales']")
	WebElement radioWales;
	@FindBy(xpath="//input[@id='radio-nire']")
	WebElement radioNorthernIreland;
	@FindBy(xpath="//input[@id='next-button']")
	WebElement clickNext;
	
	public CountryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		//PageFactory is the class and initelements is teh method is used to 
		//initilze the webelement s
		
	}
	
	public void selectRadioEngland() {
		radioEnland.click();
		
		
	}
	public void selectRadioScotland() {
		radioScotland.click();
		
		
	}
	public void selectRadioWales() {
		radioWales.click();
		
		
	}
	public void selectRadioNorthernIreland() {
		radioNorthernIreland.click();
		
		
	}
	public void clickNext() {
		clickNext.click();
		
		
	}

}
