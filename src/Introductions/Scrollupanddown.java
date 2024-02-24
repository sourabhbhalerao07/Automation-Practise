package Introductions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Scrollupanddown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver/chromedriver", "D:\\Rahul_Shetty_Workspace\\chromedriver_win32 (4).exe");

		WebDriver driver = new ChromeDriver();

		 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector('.tableFixHead').ScrollTop=5000");
		
		Thread.sleep(3000);
		
		List<WebElement> value = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0;
		
		
		//doing addition of amount and validating at the end
		for(int i =0; i<value.size(); i++)
		{
			//converting string into integer
			sum = sum + Integer.parseInt(value.get(i).getText());
			
			System.out.println(sum);
		}
		
		driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		
		int total = Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, total);
		
		
		
		
	}

}
