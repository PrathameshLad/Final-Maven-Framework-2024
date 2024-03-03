package testSuite;

import java.io.IOException;

import testBase.TestBase;
import utility.TestngRunner;

public class RunAutomationSuite extends TestBase {
	static TestngRunner testngRunner = new TestngRunner();
	public static String browser;

	public static void main(String[] args) throws IOException {
		try {
//			browser = "chrome"; 
			testngRunner.runSuite();
		} catch (InterruptedException e) {
			e.printStackTrace(); 
		}
	}

}
