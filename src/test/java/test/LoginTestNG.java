package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTestNG {
	@Test
	public void InvalidUserShouldNotBeAbleToLogin() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
        driver.get("http://techfios.com/test/billing/?ng=login/");
		
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		By ALERT_MESSAGE_LOCATOR = By.xpath("//div[@class='alert alert-danger fade in']");
		
		//waitForElement(driver,10, ALERT_MESSAGE_LOCATOR);
		//Element library
		
		
		
		//driver.close();
		//driver.quit();
		
//	public void waitForElement(WebDriver driver, int timeInSeconds, By locator) {
//			WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//		}	
}
}
