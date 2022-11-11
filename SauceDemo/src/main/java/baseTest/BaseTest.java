package baseTest;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import util.ExtentReportListener;

@Listeners(ExtentReportListener.class)
public class BaseTest extends ExtentReportListener{
	
	public static WebDriver driver;
	public static Properties prop;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void beforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/sandbox/chromedriver");

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Data.properties");
		prop = new Properties();
		prop.load(file);
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		
	}
	
	@AfterClass
	public static void afterClass() {
		driver.close();
	}

}
