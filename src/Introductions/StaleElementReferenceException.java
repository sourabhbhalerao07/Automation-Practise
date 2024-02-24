package Introductions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver/chromedriver", "D:\\Rahul_Shetty_Workspace\\chromedriver_win32 (4).exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameBox = driver.findElement(By.name("name"));
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.linkText("Home")).click();
		//By commenting below line getting staleelementreferencrexception
		//WebElement nameBox1 = driver.findElement(By.name("name"));
		nameBox.sendKeys("hello");

	}

}
