package day3.browserOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartOperations {

	public static void main(String[] args) {
		
		        //Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//Open the amazon URL
				driver.get("https://www.flipkart.com/");
				
				//Maximize the browser window:
				driver.manage().window().maximize();
				             //......OR......
				//Set the browser window size
				//driver.manage().window().setSize(new Dimension(650, 850));
				  
				//Find elements
				//driver.findElement(By.cssSelector("div._37M3Pb>*:nth-child(3)")).click();
		                           //.....oR......  
				driver.findElement(By.xpath("//div[text()='Electronics']")).click();
				
				

	}

}
