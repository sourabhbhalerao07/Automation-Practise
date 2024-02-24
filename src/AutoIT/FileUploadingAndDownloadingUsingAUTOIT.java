package AutoIT;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUploadingAndDownloadingUsingAUTOIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		//Program to upload pdf to convert jpg format and download that files into project folder and delete
		
		String downloadPath=System.getProperty("user.dir");

		System.setProperty("webdriver/chromedriver", "D:\\Rahul_Shetty_Workspace\\chromedriver_win32 (4).exe");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);

		//Getting error in below 2 lines
		//ChromeOptions options=new ChromeOptions(options);

		//options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.xpath("//span[@class='text-base']")).click();
		Thread.sleep(3000);

		//Below method is to call that exe file which we created
		Runtime.getRuntime().exec("D:\\AutoIT Document\\FileUpload.exe");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));

		driver.findElement(By.cssSelector("button[class*='medium']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));

		driver.findElement(By.linkText("Download Now")).click();

		Thread.sleep(5000);

		File f=new File(downloadPath+"/converted.zip");

		if(f.exists())

		{

		Assert.assertTrue(f.exists());

		if(f.delete())

		System.out.println("file deleted");

		}

		}


	}


