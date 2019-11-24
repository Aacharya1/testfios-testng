package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class LoginTestNG {
public void loginintotechfios(){
		
		//setting chromedriver properties
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	WebDriver driver = new ChromeDriver(); // opening the chrome driver 
	
	// driver .get mean go to a specific URL.	
	driver.get("http://techfios.com/test/billing/?ng=login/");	
	//for identifying a certain element we are using findelement.
	//for typing in the element we are using sendkeys.
	
	driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	
	//use click to click on an element.
	driver.findElement(By.name("login")).click();

}
}
