package day3.browserOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonOperations {

	public static void main(String[] args) {

		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open the amazon URL
		driver.get("https://www.amazon.in/");
		
		//Maximize the browser window:
		driver.manage().window().maximize();
		             //......OR......
		//Set the browser window size
		//driver.manage().window().setSize(new Dimension(650, 850));
		
		//Get the page title and print it:
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title is:" +actualTitle);
		//Validation for page title:
		String expectedTitle = "Amazon.in";
		System.out.println("Actual Title is:" +expectedTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Valid Page");
		} else {
			System.out.println("Valid Page");
		}
		
		//click on Amazon Pay link
		//driver.findElement(By.cssSelector("div#nav-xshop-container>div>*:nth-child(12)")).click();

		//driver.findElement(By.cssSelector("div#nav-main>div>div>div>*:nth-child(3)")).click();
		  
		  driver.findElement(By.className("icp-nav-language")).click();
		  
	}
	//div#nav-tools>a>*:nth-child(2)
}
