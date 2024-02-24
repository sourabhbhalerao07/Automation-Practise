package WindowHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multiplewindowopenandclickonlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver/chromedriver", "D:\\Rahul_Shetty_Workspace\\chromedriver_win32 (4).exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://www.ebay.com/");

		// Count of the Link in the Entire Page
		// System.out.println("Links in the Page");
		// System.out.println(driver.findElements(By.tagName("a")).size());
		// Count of links in the footer section of the page
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));    //when we try to create scope of webdriver do not use findelements s
		// System.out.println("Links in the footer section");
		// System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement col = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		// System.out.println("Links in the 2nd coloumn of the section");
		// System.out.println(col.findElements(By.tagName("a")).size());
		String Beforeclicking = null;
		String Afterclicking;
		for (int i = 0; i < col.findElements(By.tagName("a")).size(); i++) {

			if (col.findElements(By.tagName("a")).get(i).getText().contains("Site map")) {
				Beforeclicking = driver.getTitle();

				col.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		Afterclicking = driver.getTitle();
		if (Beforeclicking != Afterclicking) {
			if (driver.getPageSource().contains("sitemap"))

				System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}

}
