package assignment6_8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	WebDriver driver;
	public HandlingAlert() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	//Opening the url.
	public void loadURL()
	{
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	}
	
	public void alertWithOk()throws InterruptedException{
		driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
		Alert alertOk =  driver.switchTo().alert();//going to alert box.
		System.out.println(alertOk.getText());//going print the alert message on the console
		Thread.sleep(1000);//to see the alert.
		alertOk.accept();
	}
	
	public void alertWithCancel() 
	{
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		Alert alertCancel = driver.switchTo().alert();
		System.out.println(alertCancel.getText());
		alertCancel.dismiss();
	}
	
	public void alertWithText()
	{
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		Alert alertText = driver.switchTo().alert();
		alertText.sendKeys("Mayank");
		System.out.println(alertText.getText());
		alertText.accept();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}

}
