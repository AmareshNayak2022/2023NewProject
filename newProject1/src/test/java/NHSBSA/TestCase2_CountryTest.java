package NHSBSA;

import java.io.IOException;

import org.testng.annotations.Test;

import NHSBSA.utilities.Utilities;
import PageObjects.CountryPage;
import PageObjects.StartPage;

public class TestCase2_CountryTest extends TestBase {
@Test(priority = 1)
	public static void englandRadioTest() throws IOException, InterruptedException {
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
		
		//Verify if user is able to Click Enland Radio Button

	}
@Test(priority = 2)
public static void englandScotlandTest() throws IOException, InterruptedException {
	TestBase brow = new TestBase();
	brow.launchBrowerandApp();
	Utilities ul = new Utilities();
	ul.acceptcookies();
	Thread.sleep(2000);
	//Parameterised constructor
	StartPage sp = new StartPage(driver);
	sp.clickStartNow();
	CountryPage cp = new CountryPage(driver);
	cp.selectRadioScotland();;
	Thread.sleep(3000);
	cp.clickNext();
	
	//Verify if user is able to Click Scotland Radio Button

}

}
