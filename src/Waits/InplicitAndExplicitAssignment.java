package Waits;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InplicitAndExplicitAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver/chromedriver", "D:\\Rahul_Shetty_Workspace\\chromedriver_win32 (4).exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("(//label[@class='customradio'])[2]")).click();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
		
		driver.findElement(By.xpath("//select[@class='form-control']")).click();
		
		driver.findElement(By.xpath("//select[@class='form-control']/option[2]")).click();
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
		
		List <WebElement> products =  driver.findElements(By.cssSelector(".card-footer .btn-info"));
		
		for(int i=0;i<products.size();i++)
		{
			products.get(i).click();
		}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
		driver.quit();
		
}

}
