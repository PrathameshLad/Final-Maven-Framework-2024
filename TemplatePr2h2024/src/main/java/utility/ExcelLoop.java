package utility;

import java.io.IOException;
import java.util.ArrayList;
import testBase.TestBase;

public class ExcelLoop extends TestBase { // getting cell value only
	public static ArrayList<String> testCaseNames = new ArrayList<String>(); // Calling array from the excelHandlin class.



	public void testCaseList() {
		Object excelValue = null; // for the excel cell value which is testcase name
		Object decision = null; // for the excel cell value which is either "Yes" OR "No"
		ExcelHandling getValue = new ExcelHandling();
        logger.info("ExcelHandling class Initialized");
//        int rowCount = ExcelHandling.rowCount;
        int length = testCaseNames.size();
		for (int i = 1; i<length;i++){
			
		logger.info("Excel Loop - Test Case list for block");
        try { // try/catch block to avoid if there is an error while handling excel
        	logger.info("Excel Loop - Test Case list try block");
        	decision = getValue.getCellValue(0, i, 6); // 6th column value check if "yes"
        	logger.info("decision get value 0 i 6");
			String decision2 = String.valueOf(decision); // Value of "Yes" or "No"
			
			if(decision2.equalsIgnoreCase("Yes")) { // If the value is yes then only the test case will be added for testing.
				logger.info("if yes");
				excelValue = getValue.getCellValue(0, i, 5); // 5th column value get of Test Case name
				String excelValue2 = String.valueOf(excelValue);

				testCaseNames.add(excelValue2); // Added value in the array of groups. This will be accessed in testngRunner class.
				logger.info("add excel value 2");
//				System.out.println(excelValue2); // to check if the value is correct
//				System.out.println("Testing value"); // to check if the value is correct
			
				}
			} catch (IOException e) { 
			break; // Break if there is no valid values coming or null values coming.
		}
        
        

		}
//		System.out.println(testCaseName);		// To check the array. This should include all the listed testcase names from the excel file which has "Yes" marked.
		
	}
	
}


