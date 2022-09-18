package TestPages;


import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import ObjectRepository.PlanObjects;
import baseTest.BaseTest;

public class PlanPage extends BaseTest {
	

	public static String verifyPremiumplan() {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(PlanObjects.premiumPlanAmount));

		String premiumplsnAmount = driver.findElement(PlanObjects.premiumPlanAmount).getText();

		Assert.assertEquals(premiumplsnAmount, "16.3");

		return premiumplsnAmount;

	}

	public static String verifyBasicplan() {
		String basicAmount = driver.findElement(PlanObjects.basicPlanAmount).getText();

		Assert.assertEquals(basicAmount, "10.9");

		return basicAmount;

	}

	public static String verifyLiteplan() {
		String liteAmount = driver.findElement(PlanObjects.litePlanAmount).getText();

		Assert.assertEquals(liteAmount, "5.4");

		return liteAmount;
	}

}
