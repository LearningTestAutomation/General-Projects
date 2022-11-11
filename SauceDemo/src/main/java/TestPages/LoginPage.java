package TestPages;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectRepository.LoginObjects;
import baseTest.BaseTest;

public class LoginPage extends BaseTest{

	public static String login() {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginObjects.username));
		driver.findElement(LoginObjects.username).sendKeys(prop.getProperty("Username"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginObjects.password));
		driver.findElement(LoginObjects.password).sendKeys(prop.getProperty("Password"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginObjects.login));
		driver.findElement(LoginObjects.login).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginObjects.verifyHeader));
		String headerText =driver.findElement(LoginObjects.verifyHeader).getText();
		
		return headerText;
		
	}

}
