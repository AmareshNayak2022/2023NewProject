package NHSBSA;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import NHSBSA.utilities.Utilities;
import PageObjects.CountryPage;
import PageObjects.StartPage;


public class TestClass extends TestBase {
	
	//inheritance

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		TestBase brow = new TestBase();
		brow.launchBrowerandApp();
		Utilities ul = new Utilities();
		ul.acceptcookies();
		Thread.sleep(2000);
		//Parameterised constructor
		StartPage sp = new StartPage(driver);
		sp.clickStartNow();
		CountryPage cp = new CountryPage(driver);
		cp.selectRadioEngland();
		Thread.sleep(3000);
		cp.clickNext();
		
		


		
		

		
		
		
		
		

	}

}
