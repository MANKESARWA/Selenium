package assignment1_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Navigation nav = driver.navigate();
		
		nav.to("https://www.bing.com/");//Go to web page.
		
		driver.manage().window().maximize();//Maximizing the browser window.
		driver.findElement(By.id("images")).click();//Clicking on the Image Link.
		
		//Counting the number of image in the image page
		System.out.println("Total number of image on the image page :"+driver.findElements(By.tagName("img")).size());
		
		driver.quit();//Closing the page.
	}

}
