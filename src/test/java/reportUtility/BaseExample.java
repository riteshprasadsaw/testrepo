package reportUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseExample {
    protected ExtentReports extent;
    protected ExtentTest test;
    protected WebDriver driver;
    final String filePath = "Extent.html";

    
    
    @BeforeSuite
    public void beforeSuite() {
        extent = ExtentManager.getReporter(filePath);
        
    }
    
    @BeforeClass
    public void browserSetup(){
    	System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();	
    }
    
    @AfterMethod
    protected void afterMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(LogStatus.FAIL, result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
        } else {
            test.log(LogStatus.PASS, "Test passed");
        }
        
        extent.endTest(test);        
        extent.flush();
    }
    
    @AfterClass
    public void browserTeardown(){
    	driver.close();
    }
    
    @AfterSuite
    protected void afterSuite() {
        extent.close();
        
    }
}
