package assignment12_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckClick {

	WebDriver driver;

	public CheckClick() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	// loading the URL
	public void loadURL() {
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void differentClick()
	{
		Actions act = new Actions(driver);
		
		//Double Click.
		WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(doubleClick).perform();
		
		//Right Click.
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightClick).build().perform();;
		
		//dynamic Click
		WebElement dynamicClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		act.click(dynamicClick).perform();
	}
	
	public void takeOutput()
	{
		WebElement doubleClickPrint = driver.findElement(By.id("doubleClickMessage"));
		System.out.println(doubleClickPrint.getText());
		WebElement rightClickPrint = driver.findElement(By.id("rightClickMessage"));
		System.out.println(rightClickPrint.getText());
		WebElement dynamicClickPrint = driver.findElement(By.id("dynamicClickMessage"));
		System.out.println(dynamicClickPrint.getText());
	}
	
	public void closePage()
	{
		driver.close();
	}

}
