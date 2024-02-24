package WindowHandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver/chromedriver", "D:\\Rahul_Shetty_Workspace\\chromedriver_win32 (4).exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

       driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
       
       driver.findElement(By.xpath("//a[@class=\"blinkingText\"]")).click();
       
       Set<String> windows =driver.getWindowHandles();     //[parentid,childid,subchildid]
       
       Iterator<String>it = windows.iterator();
       
       String parentid =  it.next();     //[parentid]
       
       String childid = it.next();       //[childid]
       
       driver.switchTo().window(childid);
       
       System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
       
       String emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
       
       driver.switchTo().window(parentid);
       
       driver.findElement(By.id("username")).sendKeys(emailid);
       
       driver.quit();
 }

}
