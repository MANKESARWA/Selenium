package assignment4_5;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");// to visit the web page.

		driver.manage().window().maximize();// Maximizing the window
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Apple");

		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@role='listbox']/li")));
		
		System.out.println("After Explicit wait ");
		driver.close();
	}
}
