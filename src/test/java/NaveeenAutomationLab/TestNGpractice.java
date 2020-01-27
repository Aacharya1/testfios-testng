package NaveeenAutomationLab;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGpractice {
	
//	Setup system property for Chrome
//	Lunch chrome browser
//	Login method
//	Enter URL
//	Google Title Test
//	Logout From app
//	Close Browser
//	DeleteAllCookies
	
	//Pre--conditions annotations----starting with @Before
	@BeforeSuite//1
	public void setUp(){
	System.out.println("@BeforeSuite----Setup system property for chrome");	
	}
	
	
	@BeforeTest
	
	public void lunchBrowser(){
		System.out.println("@BeforeTest----Lunch chrome browser");
			}
	
	@BeforeClass//2
	public void Login(){
		System.out.println("@BeforeClass----Login method");
		
	}

//@BeforeSuite----Setup system property for chrome
//@BeforeTest----Lunch chrome browser
//@BeforeClass----Login method
	
// @BeforeMethod------Enter URL
//@Test--1---Google Title Test
//@AfterMethod----Logout From app
	
// @BeforeMethod------Enter URL
//@Test----3----googleTestlogo
//@AfterMethod----Logout From app
	
// @BeforeMethod------Enter URL
//@Test-----2---searchTestCase
//@AfterMethod----Logout From app
	
//@AfterClass----Close Browser
//@AfterTest.....DeleteAllCookies
	
	// test case vane @Test matra ho,
	//Yo always mathi ko jastai gari pair banayar kam garcha pahile test--1 ani Test -2.......
	
	@BeforeMethod//4
	public void enterURL(){
		System.out.println(" @BeforeMethod------Enter URL");
		
	}
	
	
	// Test case starting with @Test
	@Test
	public void GoogleTitleTest(){
		System.out.println("@Test--1---Google Title Test");
		
	}
	@Test
	public void searchTestCase(){
		System.out.println("@Test-----2---searchTestCase");
	}
	
	@Test 
	
	public void googleTestlogo(){
		System.out.println("@Test----3----googleTestlogo");
	}
	// Post Condition --- starting with @After
	@AfterMethod
	public void logout(){
		System.out.println("@AfterMethod----Logout From app");
		
	} 
	
	@AfterClass//8
	public void closeBrowser(){
		System.out.println("@AfterClass----Close Browser");
	}
	
	@AfterTest
	public void deleteAllcookies(){
		System.out.println("@AfterTest.....DeleteAllCookies");
		
	}
	
	@AfterSuite
	public void generateTestReport(){
		System.out.println("@AfterSuite------generateTestReport");
	}
	
}
