// Class to create a Testng.xml file with java. This will be called in "RunAutomationSuite" class for execution.

package utility;

//import org.apache.log4j.Logger;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import testBase.TestBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TestngRunner extends TestBase{
	static ExcelLoop excelLoop;
	static ExtentReporterNG extentReporter = new	ExtentReporterNG();
	static ListenersEx listeners = new ListenersEx();
//	static Logger logger;
	
	
    
	public void runSuite() throws InterruptedException, IOException {
		TestBase tb = new TestBase();  // Initialize testbase class to run logger. As logger is not initialized while running this class.
		tb.start();
		logger.info("Running TestCases Through Excel");
        TestNG testng = new TestNG();
        logger.info("Testng Initialized");
        
        testng.addListener(extentReporter); // Listeners added
        testng.addListener(listeners);
        logger.info("Listeners Added");
        

        
        XmlSuite suite = new XmlSuite(); // Create xml suite
        suite.setName("Excel Based Suite"); 
        logger.info("XmlSuite Created (Excel Based Suite)");
        
        XmlTest test = new XmlTest(suite);
        test.setName("Excel Based Regression Testing");

        
        XmlClass testClass = new XmlClass("testCases.TestCases"); 
        test.setXmlClasses(Arrays.asList(testClass));
        logger.info("TestClasses Initialized");

        ExcelLoop excelLoop = new ExcelLoop();
        excelLoop.testCaseList();
        ExcelLoop excelLoop2 = new ExcelLoop();
		ArrayList<String> arrayList = excelLoop2.testCaseNames;
		
        logger.info("Number of Test Cases: "+arrayList.size());
        
        // if Number of testCases are 0 then add catch condtion - pending
        for(int i=0;i<arrayList.size();i++) {
        	logger.info("In the for loop");
        	try {
        		logger.info("In the try block");
        String groupName = ExcelLoop.testCaseNames.get(i);
        logger.info("get Name from excel........");
        logger.info("testCase currently taken: "+groupName);
//        test.addIncludedGroup(groupName);
        test.addParameter("testCaseName", "loginTest");
        test.addParameter("testCaseName", "loginTest2");
        test.addParameter("testCaseName", "loginTest3");
        	}catch(Exception e) {
        		e.printStackTrace();
        		logger.info("Failed to get group name");
        	}
        }
//        test.addIncludedGroup("Regression");
        
        suite.setTests(Arrays.asList(test));

        
        testng.setXmlSuites(Arrays.asList(suite));
        testng.setOutputDirectory("test-Output-Programmatic"); 
        logger.info("Test output file created");

        
        testng.run();
        logger.info("TestngXml Executed Successfully. Check for any Console errors");
    }
}
