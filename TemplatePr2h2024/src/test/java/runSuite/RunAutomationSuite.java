package runSuite;

import java.io.FileWriter;
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
		
		
		String htmlContent = "<html><head><title>This is first HTML file created by Java</title></head><body>";
        htmlContent += "<h1>New HTML baby</h1>";
        htmlContent += "</body></html>";

        try (FileWriter writer = new FileWriter("src\\test\\java\\testData\\Test Screenshots\\htmltest.html")) {
            writer.write(htmlContent);
            System.out.println("HTML report generated successfully at: " + "src\\test\\java\\testData\\Test Screenshots\\htmltest.html");
        } catch (IOException e) {
            System.err.println("Error writing HTML report to file: " + e.getMessage());
        }
		
	}

}
