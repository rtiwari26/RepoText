package day1.openbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
	
		//Step1: using System.setProperty(key,value) set to path for ChromeDriver.exe
		System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
		//Step2: Create an instance of ChromeDriver class
		ChromeDriver cdriver = new ChromeDriver();
	}

}
