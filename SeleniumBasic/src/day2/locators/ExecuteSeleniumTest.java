package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExecuteSeleniumTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demosite.executeautomation.com/");
		
		WebElement userNameInputField = driver.findElement(By.name("UserName"));
		
	    userNameInputField.sendKeys("execution");
	
		WebElement passWordInputField = driver.findElement(By.name("Password"));
		
		passWordInputField.sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		// Syntax: htmltag[attributename='attributevalue'] //or
				  // htmltag[PN='PV']
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
	    //wait.until(ExpectedConditions.elementToBeClickable(By.name("cssmenu")));
		
		String expectedTitle="Execute Automation";
        String actualTitle = driver.getTitle();
        System.out.println("Expected Title is:" +expectedTitle);
        System.out.println("Actual Title is:" +actualTitle);
        
        driver.findElement(By.name("cssmenu")).click();
        
        
	}	
}
	
