package assignment1_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Navigation nav = driver.navigate();
		nav.to("https://www.bing.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<allLinks.size();i++)
		{
			WebElement ele= allLinks.get(i);               
            String url=ele.getAttribute("href");                
            if(url!=null)
            {
            	System.out.println(url);
            }
		}
		
		driver.close();
	}

}
