package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vtiger {

	public static void main(String[] args) {
		//Step1: Open Chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Step2: Enter the app URL
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		//Step3: Enter username as admin
		/**locate username field from UI*/
	    WebElement userNameInputField = driver.findElement(By.id("username"));
	    /** after identifying the WebElement we can perform following operation in it
		 * 	type input---->  sendKeys("")
		 *  click     ---->  click()
		 *  delete existing ----> clear()
		 **/
	    
	    //Clear username from the textfield
	    userNameInputField.clear();
	    
	    //Renter username into the textfield as admin
	    userNameInputField.sendKeys("admin");
	    
	    //Step4: Enter password as manager
	    /** Identify password field*/
	    WebElement passWordInputField  = driver.findElement(By.name("password")); 
	    
	    //Clear username from the textfield:
	    passWordInputField.clear();
	    
	    //Renter password into the textfield:
	    passWordInputField.sendKeys("Test@123");
        
        //Step5: click on login button
        /** Identify login button & click on it*/
        driver.findElement(By.className("button")).click(); 
        
        //Validation will be failed,to avoid this we will use explicit wait(conditional wait)
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("button")));
		//wait.until(ExpectedConditions.titleIs("vtiger"));   
        
        //Step6: validate home page
        String expectedTitle="vtiger";
        String actualTitle = driver.getTitle();
        System.out.println("Expected Title is:" +expectedTitle);
        System.out.println("Actual Title is:" +actualTitle);
        
        if (actualTitle.equals(expectedTitle)) {
        	System.out.println("Login validation is passed");
        } else {
        	System.out.println("Login validation is passed");
        }
        
        //identify logout link and lick on it
        driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();  
        driver.close();
        

	}

}
