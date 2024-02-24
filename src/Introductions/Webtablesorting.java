package Introductions;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Webtablesorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       System.setProperty("webdriver/chromedriver", "D:\\Rahul_Shetty_Workspace\\chromedriver_win32 (4).exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all web elements into list
		List <WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture all web elements into new [original]list
		List<String> originalList=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on original list of the step 3 (sorted list)
		List <String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		//compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		
		driver.quit();
		
		
	}

}
