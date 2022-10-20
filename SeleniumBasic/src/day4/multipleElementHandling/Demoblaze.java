package day4.multipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SeleniumBasic\\Executable\\chromedriver.exe");
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		//List<WebElement> mobileNameList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		List<WebElement> mobileNameList=driver.findElements(By.xpath("//a[@class='hrefch']"));
		//List<WebElement> mobileNameList=driver.findElements(By.xpath("//a[text()='Sony xperia z5']"));
		
		//List<WebElement> mobilePriceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		List<WebElement> mobilePriceList=driver.findElements(By.xpath("//h5[text()='$360']"));
		
		//get mobile name list
		System.out.println("Mobile Name List is:" +  mobileNameList.size());
		//get mobile price list
		System.out.println("Mobile Name List is:" +  mobilePriceList.size());
		 
		for(int i=0; i<mobileNameList.size();i++) {
			System.out.println("Mobile name list is:" + mobileNameList.get(i).getText());
		}
		
		for(int i=0; i<mobilePriceList.size();i++) {
			System.out.println("Mobile price list is:" + mobilePriceList.get(i).getText());
		}
	}

}
