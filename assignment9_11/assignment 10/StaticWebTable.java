package assignment8_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	WebDriver driver;

	public StaticWebTable() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	//loading the url.
	public void loadURL() {
		driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
	}

	//Print the table.
	public void printTable() {
		List<WebElement> allelements = driver.findElements(By.xpath("//table"));
		System.out.println(allelements.get(0).getText());
	}

	public void closePage() {
		driver.close();
	}

}
