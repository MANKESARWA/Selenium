package assignment8_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckEnableAndSelect {

	WebDriver driver;
	public CheckEnableAndSelect() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	//loading the page
	public void loadURL() {
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
	}
	//Checking the red button enable or not
	public void checkEnable()
	{
		WebElement redCheckBox = driver.findElement(By.xpath("//input[@value='red']"));
		if(!redCheckBox.isEnabled())
		{
			System.out.println("red is enabled");
			
		}
		else
		{
			System.out.println("Red is disabled");
		}
	}
	
	//Checking the red button selected or not
	public void checkSelect()
	{
		WebElement redCheckBox = driver.findElement(By.xpath("//input[@value='red']"));
		if(redCheckBox.isSelected())
		{
			System.out.println("red is selected");
		}
		else
		{
			System.out.println("Red is not selected");
		}
	}
	
	//Checking the opera button selected or not
	public void checkRadioButton()
	{
		WebElement operaRadioBtn = driver.findElement(By.xpath("//input[@value='Opera']"));
		if(operaRadioBtn.isSelected())
		{
			System.out.println("Opera is selected");
		}
		else
		{
			System.out.println("Opera is not selected");
		}
	}
	
	public void closePage()
	{
		driver.close();
	}
	
}
