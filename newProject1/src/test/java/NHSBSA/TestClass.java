package NHSBSA;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import NHSBSA.utilities.Utilities;

public class TestClass extends TestBase {
	
	//inheritance

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		TestBase brow = new TestBase();
		brow.launchBrowerandApp();
		Utilities ul = new Utilities();
		ul.acceptcookies();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='next-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='radio-england']")).click();

		
		
		
		
		

	}

}
