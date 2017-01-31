package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
    static WebDriver driver;


	public static WebDriver initialsetup(){
		/*System.setProperty("webdriver.gecko.driver",".\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();*/
		  
		  System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  return driver;
	}

}
