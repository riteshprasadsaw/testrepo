package testCases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import reportUtility.BaseExample;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class builder extends BaseExample{
    //wd=driver;
    
    @BeforeMethod
    public void setUp() throws Exception {
       // wd = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void builder() {
    	driver.get("https://www.google.co.in/search?q=selenium+builder&ie=utf-8&oe=utf-8&client=firefox-b-ab&gfe_rd=cr&ei=gOiNWMDeFseL8Qewr7zIAg");
    	driver.findElement(By.id("lst-ib")).click();
    	driver.findElement(By.cssSelector("div.sbqs_c")).click();
    	driver.findElement(By.linkText("Selenium Builder - The next evolution")).click();
    }
    
    @AfterMethod
    public void tearDown() {
    	//driver.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
