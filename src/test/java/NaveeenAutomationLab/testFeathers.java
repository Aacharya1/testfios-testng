package NaveeenAutomationLab;

import org.testng.annotations.Test;

public class testFeathers {
	
	@Test
	public void LoginPageTest(){
		System.out.println("LoginPageTest"); 
		//int i= 9/0;
	}
	
	
	@Test(dependsOnMethods="LoginPageTest")
	public void HomepageTest(){
	System.out.println("HomepageTest");	
	}
	
	
	@Test(dependsOnMethods="LoginPageTest")
	public void SearchPageTest(){
		System.out.println("SearchPageTest");
		
	}
	
	@Test(dependsOnMethods="LoginPageTest")
	public void RegPageTest(){
		System.out.println("RegisterPageTest");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
