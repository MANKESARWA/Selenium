package assignment4_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Navigation nav = driver.navigate();
		nav.to("http://demo.automationtesting.in/Register.html");//to visit the web page.
		
		driver.manage().window().maximize();//Maximizing the window
		
		//Entering the First Name.
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mayank");
		//Entering the Last Name.
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kesarwani");
		//Entering the Address.
		driver.findElement(By.tagName("textarea")).sendKeys("Mohatsimganj Prayagraj.");
		//Entering the email id.
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mayank.kesarwani@capgemini.com");
		//Entering the phone number.
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7388920978");
		//Selecting the radio button list.
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		//Selecting the required check box.
		List<WebElement> allcheckBoxList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement e : allcheckBoxList)
		{
			if(!e.isSelected())
			{
				e.click();
			}
		}
		//Selecting from the drop down list selection for language.
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.linkText("English")).click();
		driver.findElement(By.linkText("Hindi")).click();
		
		//Selecting from the skill drop down.
		WebElement dropDownListSkill = driver.findElement(By.xpath("//select[@id='Skills']")); 
		Select dropDownSelectSkill = new Select(dropDownListSkill);
		dropDownSelectSkill.selectByValue("Java");
		
		//Select from the country drop down list.
		WebElement dropDownListCountry = driver.findElement(By.xpath("//select[@id='countries']"));
		Select dropDownSelectCountry = new Select(dropDownListCountry);
		dropDownSelectCountry.selectByIndex(0);
		
		//Selecting from the country drop down list by entering the name.
		WebElement selectcountry=driver.findElement(By.id("country"));
        Select sc=new Select(selectcountry);
        sc.selectByVisibleText("India");
		
		//Selecting year from the dropDown
		WebElement dropDownListYear = driver.findElement(By.xpath("//select[@placeholder='Year']"));
		Select selectYear = new Select(dropDownListYear);
		selectYear.selectByValue("1997");
		
		//Selecting Month from the dropDown
		WebElement dropDownListMonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select selectMonth = new Select(dropDownListMonth);
		selectMonth.selectByValue("June");
		
		//Selecting Day from the dropDown
		WebElement dropDownListDay = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select selectDay = new Select(dropDownListDay);
		selectDay.selectByValue("5");
		
		//Entering the password		
		driver.findElement(By.id("firstpassword")).sendKeys("12345");
		
		//Entering the confirmation password		
		driver.findElement(By.id("secondpassword")).sendKeys("12345");
		
		Thread.sleep(5000);// to check all the entries are filled.
		
		//Clicking on submit
		driver.findElement(By.id("submitbtn")).click();
		
		
		System.out.println("The Web UI fail because of the country dropdown is not define.");
		
	}

}
