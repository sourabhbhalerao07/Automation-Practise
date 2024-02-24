package Dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import java.util.List;

public class AutoSuggest_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
       System.setProperty("webdriver/chromedriver", "D:\\Rahul_Shetty_Workspace\\chromedriver_win32 (4).exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);
       //xpath = //li[@class='ui-menu-item']/a   -  used parent to child concept
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		//We written WebElement because  because it is return type of option
		for(WebElement option :options)

		{

		if(option.getText().equalsIgnoreCase("India"))
		{
			option.click();

			break;
		}

		
	   }
		
		driver.quit();
	}
}
