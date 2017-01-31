package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Home_Page {
	

		final WebDriver driver;

		@FindBy(how = How.XPATH, using = "//*[@id='maincontent']/div[6]/table/tbody/tr/td[2]/a")
		public WebElement lnk_MyAccount;

		
	// This is a constructor, as every page need a base driver to find web elements

		public Home_Page(WebDriver driver)

		{

			this.driver = driver;

			}

	
}
