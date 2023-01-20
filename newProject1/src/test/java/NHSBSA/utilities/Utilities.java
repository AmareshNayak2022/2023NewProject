package NHSBSA.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import NHSBSA.TestBase;

public class Utilities extends TestBase {
	//WebDriver driver;
	public void acceptcookies() {

		driver.findElement(By.xpath("//button[@id='nhsuk-cookie-banner__link_accept_analytics']")).click();
			
	
		
		
	}
// implicit wait
//explicit wait 
//handlingpopups 
//windowhandle 
}
