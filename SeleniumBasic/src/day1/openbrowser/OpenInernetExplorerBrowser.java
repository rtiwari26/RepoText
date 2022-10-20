package day1.openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenInernetExplorerBrowser {

	public static void main(String[] args) {

		//Step1: using System.setProperty(key,value) set to path for Geckodriver.exe
		System.setProperty("webdriver.IE.driver","E:\\Acceleration\\Workspace\\SeleniumBasic\\Executable\\IEDriverServer.exe");
		//Step2: Create an instance of Geckodriver class
				WebDriver idriver = new InternetExplorerDriver();

	}

}
