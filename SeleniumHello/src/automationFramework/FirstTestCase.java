package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public FirstTestCase() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\Program Files\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Firefox Developer Edition\\firefox.exe");
		
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// Launch the Online Store Website
		driver.get("http://www.google.com");

		// Print a Log In message to the screen
		System.out.println("Successfully opened the website www.Store.Demoqa.com");
		
		  
		System.out.println("1 Page title is: " + driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("kronos");
		driver.findElement(By.name("btnK")).click();
		

//		WebElement elementSearch = driver.findElement(By.name("btnK")).click();
//		WebElement element = driver.findElement(By.id("kw"));

		// Wait for 5 Sec
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Close the driver
//		driver.quit();
		
		
		
		///////////////////////////////////
		
		
	}

}
