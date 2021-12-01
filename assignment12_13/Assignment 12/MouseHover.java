package assignment12_13;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	
	WebDriver driver;
	public MouseHover()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--disable-popup-block");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
	}
	
	//loading the URL
	public void loadURL()
	{
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	//Hover your mouse on “Kids" and Hover mouse on the populated menu “Watches” and the “Boys” and click on it

	public void hover() throws InterruptedException
	{
		Actions act = new Actions(driver);
		//Locating the Kids in menu bar.
		WebElement locateKids = driver.findElement(By.xpath("//a[@data-group='kids']"));
		act.moveToElement(locateKids).perform();
		//locating the watches in the sub-menu.
		WebElement locateWatches = driver.findElement(By.xpath("//a[text()='Watches'][@data-reactid='458']"));
		act.click(locateWatches).build().perform();
		//to select boys
		WebElement locateRadio = driver.findElement(By.xpath("//input[@value='boys,boys girls']"));
		act.click(locateRadio).perform();
		
		//to select on;y watches.
		driver.findElement(By.xpath("//body/div[@id='mountRoot']/div[1]/div[1]/main[1]/div[3]/div[1]/section[1]/div[1]/div[3]/div[2]")).click();
		WebElement locateW = driver.findElement(By.xpath("//li[@data-item='w']"));
		act.moveToElement(locateW).perform();
		driver.findElement(By.xpath("//body/div[@id='mountRoot']/div[1]/div[1]/main[1]/div[3]/div[1]/section[1]/div[1]/div[3]/div[3]/div[2]/ul[1]/li[201]/label[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='mountRoot']/div[1]/div[1]/main[1]/div[3]/div[1]/section[1]/div[1]/div[3]/div[3]/div[1]/span[1]")).click();
	}
	
	//counting the number of watches.
	public void countTable()
	{
		List<WebElement> watches = driver.findElements(By.xpath("//h4[@class='product-product']"));
		for(WebElement watch: watches)
		{
			System.out.println(watch.getText());
		}
	}
	
	//closing the page.
	public void closePage()
	{
		driver.close();
	}
}
