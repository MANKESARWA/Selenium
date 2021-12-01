package assignment8_11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	
	WebDriver driver;

	public DynamicWebTable() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	//Loading the url.
	public void loadURL() {
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//Getting all the needed rows from the table.
	public void searchElement() throws InterruptedException
	{
		List<WebElement> allCompaniesName = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> allCompaniesGroup = driver.findElements(By.xpath("//tr/td[2]"));
		List<WebElement> allCompaniesPrevClose = driver.findElements(By.xpath("//tr/td[3]"));
		List<WebElement> allCompaniesCurrPrice = driver.findElements(By.xpath("//tr/td[4]"));
		
		boolean checkCompanyInTable = true; // check that the element is present or not.
		
		//traversing through the row to find the element.
		for(WebElement e :allCompaniesName)
		{
			if(e.getText().equalsIgnoreCase("Bata India"))
			{
				checkCompanyInTable = false;
				String group = allCompaniesGroup.get(allCompaniesName.indexOf(e)).getText();
				String prevClose = allCompaniesPrevClose.get(allCompaniesName.indexOf(e)).getText();
				String CurrPrice = allCompaniesCurrPrice.get(allCompaniesName.indexOf(e)).getText();
				//Displaying into console.
				System.out.println("Bata India is group "+group+" company. Previous year closing was : "+prevClose+" Current year price is "+CurrPrice);
				
			}

		}
		//Refreshing the page to find the required element.
		if(checkCompanyInTable)
		{
			driver.navigate().refresh();
			searchElement();
		}
	}
	
	public void closePage()
	{
		driver.close();
	}
}
