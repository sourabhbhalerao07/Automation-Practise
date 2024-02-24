package AutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program to authenticate window as like we are doing in rmg project after entering google it ask rmgp username & pwd

System.setProperty("webdriver/chromedriver", "D:\\Rahul_Shetty_Workspace\\chromedriver_win32 (4).exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//https://the-internet.herokuapp.com/
		//id-admin  pwd-admin
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		
	}

}
