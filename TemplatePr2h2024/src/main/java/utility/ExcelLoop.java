package utility;

import java.io.IOException;
import java.util.ArrayList;
import testBase.TestBase;

public class ExcelLoop extends TestBase { // getting cell value only
//	public int numberOfTestCases;
	 
	public static ArrayList<String> testCaseNames = new ArrayList<String>(); // Creating array from storing the testcases names

	
	public void testCaseList() throws IOException {
		Object excelValue = null; // for the excel cell value which is testcase name
		Object decision = null; // for the excel cell value which is either "Yes" OR "No"
		ExcelHandling excelHandling = new ExcelHandling();
        logger.info("ExcelHandling class Initialized");
//        Object decisionTest= excelHandling.getCellValue(0, 1, 6); // 5th column value get of Test Case name
//        Object excelValueTest = excelHandling.getCellValue(0, 1, 5); // 5th column value get of Test Case name
        logger.info("test");
        int rowCount = ExcelHandling.getRowCount(0);
        logger.info(rowCount+" from excel loop");
//        logger.info(decisionTest +"  --excel value-->"+excelValueTest);
        
		for (int i = 1; i<rowCount;i++){
			
		logger.info("Excel Loop - Test Case list for block");
        try { // try/catch block to avoid if there is an error while handling excel
        	logger.info("Excel Loop - Test Case list try block");
        	decision = excelHandling.getCellValue(0, i, 6); // 6th column value check if "yes"
        	logger.info("decision get value 0 i 6");
			String decision2 = String.valueOf(decision); // Value of "Yes" or "No"
			logger.info(decision2);
			if(decision2.equalsIgnoreCase("Yes")) { // If the value is yes then only the test case will be added for testing.
				logger.info("if yes");
				excelValue = excelHandling.getCellValue(0, i, 5); // 5th column value get of Test Case name
				String excelValue2 = String.valueOf(excelValue);

				testCaseNames.add(excelValue2); // Added value in the array of groups. This will be accessed in testngRunner class.
				
				logger.info(i+"  --Number of times value added into arraylist");
				logger.info("add excel value 2 "+excelValue2);
				System.out.println(excelValue2); // to check if the value is correct
//				System.out.println("Testing value"); // to check if the value is correct
			
				}
			} catch (IOException e) { 
//				numberOfTestCases = testCaseNames.size();
//				logger.info("numberOfTestCases: "+numberOfTestCases);
			break; // Break if there is no valid values coming or null values coming.
		}
        
        

		}
//		System.out.println(excelValue2);		// To check the array. This should include all the listed testcase names from the excel file which has "Yes" marked.
		
	}
	
}


