package Calender;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//program to select particular date which we want to select

		System.setProperty("webdriver/chromedriver", "D:\\Rahul_Shetty_Workspace\\chromedriver_win32 (4).exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://www.path2usa.com/travel-companions");
		
		Thread.sleep(5000);
		
		//April 23
		//driver.findElement(By.xpath("//label[@class='elementor-field-label'][contains(text(),'Date of travel')]")).click();
        //driver.findElement(By.cssSelector(".//*[@id='form-field-travel_comp_date']")).click();
		//driver.findElement(By.id("form-field-travel_comp_date")).click();
		//driver.findElement(By.xpath("//input[@name='form_fields[travel_comp_date]']")).click();
		driver.findElement(By.xpath("//label[@class='elementor-field-label'][contains(text(),'Date of travel')]")).click();
		


		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}


		List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("day")).size();

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		driver.findElements(By.className("day")).get(i).click();
		break;
		}
	}
	}
}
