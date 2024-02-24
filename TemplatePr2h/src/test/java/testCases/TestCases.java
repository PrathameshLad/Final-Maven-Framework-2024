package testCases;

import org.testng.annotations.Test;

public class TestCases extends testBase.TestBase{


//========================================================================
	@Test 		
	public void loginTest() throws InterruptedException {
//		System.out.println("testclkjlkj");
		driver.get("https://practicetestautomation.com/practice-test-login/");
		loginAs.tester("student", "Password123");
//		tester.login("chirag1kirad@gmail.com", "Chirag@123123");
//		driver.get("https://www.google.com");
//		login.TesterLogin("chirag1kirad@gmail.com", "Chirag@123123");
//		login.enterUsername("chirag1kirad@gmail.com");
//		login.enterPassword("Chirag@123123");
//		login.clickOnLogin();
		Thread.sleep(2000);
		logger.info("running");
		takeScreenshot.save("Passed_passwordLogin");
		
		}
	
//=========================================================================
//------------Write Test Cases below this line only----------------------
	

		
		
		
		
		

	
	
	
	

}
