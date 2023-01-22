package NHSBSA;

import java.io.IOException;

import org.testng.annotations.Test;

import NHSBSA.utilities.Utilities;
import PageObjects.StartPage;

public class TestCase1_Start extends TestBase {
@Test
	public static void startTest() throws IOException, InterruptedException {
		TestBase brow = new TestBase();
		brow.launchBrowerandApp();
		Utilities ul = new Utilities();
		ul.acceptcookies();
		Thread.sleep(2000);
		//Parameterised constructor
		StartPage sp = new StartPage(driver);
		sp.clickStartNow();
		
		//Verify if startNow button is clikable

	}

}
