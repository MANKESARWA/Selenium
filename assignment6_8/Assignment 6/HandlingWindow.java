package assignment6_8;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {
	
	WebDriver driver;
	
	public HandlingWindow() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();	
	}
	// Open the main URL/page
	public void loadURL()
	{
		driver.get("https://www.shoppersstop.com/");
		driver.manage().window().maximize();
	}
	
	
	//Opening all the windows by click the links in new tab one by one
	public void openDiffWindow()
	{
		WebElement women = driver.findElement(By.xpath("//a[@title='WOMEN']"));
		women.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		WebElement kids = driver.findElement(By.xpath("//a[@title='KIDS']"));
		kids.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		WebElement beauty = driver.findElement(By.xpath("//a[@title='BEAUTY']"));
		beauty.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		WebElement men = driver.findElement(By.xpath("//a[@title='MEN']"));
		men.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		WebElement homeStop = driver.findElement(By.xpath("//a[@title='HOMESTOP']"));
		homeStop.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	}
	
	//Function for switching the window.
	public void switchToAllTab() throws InterruptedException
	{
		ArrayList<String> allWindows = new ArrayList<String>(driver.getWindowHandles());
		//Switching to different opened windows
		for(int i =0; i<allWindows.size();i++)
		{
			driver.switchTo().window(allWindows.get(i));
			Thread.sleep(2000);
			System.out.println(driver.getTitle());//get the title one by one
			driver.close();//closing the windows whose title printed on the console.
		}
	}
	
	
	//Closing the browser.
	public void quitWindow()
	{
		driver.quit();
	}
	
}
