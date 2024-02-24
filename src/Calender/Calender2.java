package Calender;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver/chromedriver", "D:\\Rahul_Shetty_Workspace\\chromedriver_win32 (4).exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.id("form-field-travel_comp_date")).click();

		List<WebElement> date = driver.findElements(By.xpath("//span[@class='flatpickr-day ']"));

		int count = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("flatpickr-day ")).get(i).getText();

			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("flatpickr-day ")).get(i).getText();
				break;
			}
		}

	}

}
