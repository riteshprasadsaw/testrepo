package testCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import excelHandler.ExcelUtils;
import genericUtilities.ConfigReader;
import genericUtilities.TestBase;
import objectRepository.Home_Page;
import reportUtility.BaseExample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTestTestNG extends BaseExample{

	//WebDriver driver;  
	ConfigReader config;
	
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	 
	  //driver=TestBase.initialsetup();
	  config=new ConfigReader();
	  String sUserName = ExcelUtils.getCellData(1, 1);
	  String sPassword = ExcelUtils.getCellData(1, 2);
	  System.out.println("Username"+sUserName);
	  System.out.println("Username"+sPassword);
	  Home_Page HomePage = PageFactory.initElements(driver, Home_Page.class);
	  System.out.println("URL"+config.GetApplicationURL());
	  driver.get(config.GetApplicationURL());
	  HomePage.lnk_MyAccount.click();
  }
  
  @Test
  public void testReport() {
	  
	  
	  test = extent.startTest("Open MavenRepository");
      test.log(LogStatus.PASS, "Pass");
      Assert.assertEquals(test.getRunStatus(), LogStatus.PASS);
  }
  
  @AfterMethod
  public void afterClass() {
	 // driver.quit();
  }

}
