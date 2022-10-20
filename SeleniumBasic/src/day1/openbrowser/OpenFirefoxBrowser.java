package day1.openbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		
		//Step1: using System.setProperty(key,value) set to path for Geckodriver.exe
		System.setProperty("webdriver.gecko.driver","E:\\Acceleration\\Workspace\\SeleniumBasic\\Executable\\geckodriver.exe");
		//Step2: Create an instance of Geckodriver class
				FirefoxDriver fdriver = new FirefoxDriver();
	}

}
