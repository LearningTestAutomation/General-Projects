package baseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import ObjectRepository.PlanObjects;
import util.ExtentReportListener;

@Listeners(ExtentReportListener.class)
public class BaseTest extends ExtentReportListener{
	
	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/sandbox/chromedriver");

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Data.properties");
		prop = new Properties();
		prop.load(file);
		driver = new ChromeDriver();
		driver.get("https://subscribe.stctv.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.findElement(PlanObjects.clickEnglish);
		
	}
	
	@AfterClass
	public static void afterClass() {
		driver.close();
	}

}
