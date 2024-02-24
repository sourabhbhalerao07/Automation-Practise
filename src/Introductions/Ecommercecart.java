package Introductions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.Arrays;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Ecommercecart {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver/chromedriver", "D:\\Rahul_Shetty_Workspace\\chromedriver_win32 (4).exe");

		WebDriver driver = new ChromeDriver();

		//We want to click add to cart of below particular vegetables
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };       //declared array

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		driver.manage().window().maximize();

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

			//Brocolli - 1 Kg

			//Brocolli,    1 kg

			String[] name = products.get(i).getText().split("-");
			//name[0] = Brocolli
			//name[1] = - 1kg
			String formattedName = name[0].trim();

			//format it to get actual vegetable name

			//convert array into array list for easy search

			//  check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);     ////convert array into array list for easy search

			if (itemsNeededList.contains(formattedName))

			{

				j++;

				//click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}

}
