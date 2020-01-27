package com.datadriven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.xlsreader;

public class DataDrivenTest {

	public static void main(String[] args) {
		xlsreader  reader = new xlsreader("/Users/Babita/TECHFIOS/techfios-testNG/src/test/java/com/testdata/Techfios.xlsx");
		 String firstname = reader.getCellData("Registration Data", "firstname ", 2);
		System.out.println(firstname);
		
		
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?registerEnterinfo");
//		
		
	}

}
