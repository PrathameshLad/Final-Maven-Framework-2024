package testCases;

import org.testng.annotations.Test;

public class TestCases extends testBase.TestBase{

 
//========================================================================
	@Test 		(groups = "loginTest", priority = -1)
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
		logger.info("LoginTest Case running");
		takeScreenshot.save("Passed_passwordLogin");
		
		}
	
//=========================================================================
//------------Write Test Cases below this line only----------------------
	

	//========================================================================
		@Test 		(groups = "loginTest2", priority = 0)
		public void loginTest2() throws InterruptedException {
//			System.out.println("testclkjlkj");
			driver.get("https://practicetestautomation.com/practice-test-login/");
			loginAs.tester("student2", "Password123");
//			tester.login("chirag1kirad@gmail.com", "Chirag@123123");
//			driver.get("https://www.google.com");
//			login.TesterLogin("chirag1kirad@gmail.com", "Chirag@123123");
//			login.enterUsername("chirag1kirad@gmail.com");
//			login.enterPassword("Chirag@123123");
//			login.clickOnLogin();
			Thread.sleep(2000);
			logger.info("LoginTest Case running");
			takeScreenshot.save("Passed_passwordLogin");
			
			}
		
		
		//========================================================================
				@Test 		(groups = "loginTest3", priority = 2)
				public void loginTest3() throws InterruptedException {
//					System.out.println("testclkjlkj");
					driver.get("https://practicetestautomation.com/practice-test-login/");
					loginAs.tester("student3", "Password123");
//					tester.login("chirag1kirad@gmail.com", "Chirag@123123");
//					driver.get("https://www.google.com");
//					login.TesterLogin("chirag1kirad@gmail.com", "Chirag@123123");
//					login.enterUsername("chirag1kirad@gmail.com");
//					login.enterPassword("Chirag@123123");
//					login.clickOnLogin();
					Thread.sleep(2000);
					logger.info("LoginTest Case running");
					takeScreenshot.save("Passed_passwordLogin");
					
					}
		
		
		
		

	
	
	
	

}
