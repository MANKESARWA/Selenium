package assignment1_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Navigation nav = driver.navigate();
		nav.to("https://www.bing.com/");
		driver.manage().window().maximize();// Maximizing window.
		driver.findElement(By.id("sb_form_q")).sendKeys("Capgemini India");
		driver.findElement(By.id("sb_form_q")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"elc_eid_YN4070x500759147\"]/div/div/div[2]/span[2]/div")).getText());;
		driver.close();
	}

}
