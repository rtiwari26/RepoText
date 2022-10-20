package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) {
		//Step1: Open Chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Step2: Enter the app URL
		driver.get("https://demo.actitime.com/");
		
		//Step3: Enter username as admin
		/**locate username field from UI*/
	    WebElement userNameInputField = driver.findElement(By.id("username"));
	    /** after identifying the WebElement we can perform following operation in it
		 * 	type input---->  sendKeys("")
		 *  click     ---->  click()
		 *  delete existing ----> clear()
		 **/
	    userNameInputField.sendKeys("admin");
	     
	    //Step4: Enter password as manager
	    /** Identify password field*/
	    WebElement password  = driver.findElement(By.name("pwd"));  
	    /**type password as manager*/
        password.sendKeys("manager");
        
        //Step5: click on login button
        /** Identify login button & click on it*/
        driver.findElement(By.id("loginButton")).click();
        
        //Step6: validate home page
        String expectedTitle="actiTIME -  Enter Time-Track";
        String actualTitle = driver.getTitle();
        System.out.println("Expected Title is:" +expectedTitle);
        System.out.println("Actual Title is:" +actualTitle);
        
        if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login validation is passed");
        } else {
        	System.out.println("Login validation is failed");
        }
        
       // driver.close();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

	private static Object actualTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
