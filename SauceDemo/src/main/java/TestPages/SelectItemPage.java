package TestPages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectRepository.SelectItemObjects;
import baseTest.BaseTest;

public class SelectItemPage extends BaseTest {

	public static void select3Item() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectItemObjects.select1stItem));
		driver.findElement(SelectItemObjects.select1stItem).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectItemObjects.select2ndItem));
		driver.findElement(SelectItemObjects.select2ndItem).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectItemObjects.select3rdItem));
		driver.findElement(SelectItemObjects.select3rdItem).click();
		
		//List<WebElement> list=driver.findElements(SelectItemObjects.select1stItem);
		
		/*
		 * for(int i =0;i<3;i++) { list.get(i).click(); }
		 */

	}
	
	public static int veriyselect3ItemInCart() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectItemObjects.noOfItemInCart));
		int NoOfIteminCart=Integer.parseInt(driver.findElement(SelectItemObjects.noOfItemInCart).getText());
		
		return NoOfIteminCart;
		
		
		
	}

}
