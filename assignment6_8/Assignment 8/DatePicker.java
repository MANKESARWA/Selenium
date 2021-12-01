package assignment6_8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {
	

	WebDriver driver;

	public DatePicker() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	//loading the url.
	public void loadURL() {
		driver.get("https://www.path2usa.com/travel-companions");
	}
	//Filling the data in from and to.
	public void settingFromTo() {
		driver.findElement(By.id("travel_from"))
				.sendKeys("Alexandria International Airport (Louisiana) (AEX) Alexandria");
		driver.findElement(By.id("travel_to")).sendKeys("Aniak Airport (ANI) Aniak");
	}
	// picking the date using date picker mechanism.
	public void datePicker() {
		// select date of travel
				driver.findElement(By.xpath("//input[@id='travel_date']")).click();
				
				WebElement current = driver.findElement(By.xpath("//td[@class='active day']"));
				String d = current.getText(); //storing current date
					
				//dates from the calendar
				List<WebElement> dates=driver.findElements(By.className("day"));
				
				// to select date
				for(int i=0;i<dates.size();i++)
				{
					String text=dates.get(i).getText();
					if(text.equalsIgnoreCase(d))
					{
						String classname=dates.get(i).getAttribute("class");
						if(classname.equalsIgnoreCase("day")||classname.equalsIgnoreCase("active day"))
						{
							dates.get(i+7).click();
							break;
						}
					}
					
				}
		
		
		
	}
	
	//selecting the week for the drop down.
	public void setWeek() {
		WebElement weekDropDown =  driver.findElement(By.id("datebetween"));
		Select s = new Select(weekDropDown);
		s.selectByIndex(2);
	}
	
	//selecting the airline from the drop down.
	public void setAirline() {
		WebElement airlineDropDown =  driver.findElement(By.id("travel_airline"));
		Select s = new Select(airlineDropDown);
		s.selectByIndex(4);
		
	}
	
	//selecting the language from the drop down.
	public void setLanguage() {
		WebElement langDropDown =  driver.findElement(By.id("travel_language"));
		Select s = new Select(langDropDown);
		s.selectByValue("English");
	}
	
	
	public void clickButton()
	{
		driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]")).click();
	}
	
	public void closePage()
	{
		driver.close();
	}

}
