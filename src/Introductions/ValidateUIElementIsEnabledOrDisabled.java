package Introductions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidateUIElementIsEnabledOrDisabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver/chromedriver", "D:\\Rahul_Shetty_Workspace\\chromedriver_win32 (4).exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("enabled");
		}
		
		else
		{
			Assert.assertFalse(false);
		}
		
		driver.quit();

	}

}
