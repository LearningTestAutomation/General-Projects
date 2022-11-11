package test;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import TestPages.LoginPage;
import TestPages.SelectItemPage;
import baseTest.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test(priority = 0)
	public void Login() {
		
		test.log(LogStatus.INFO, "Start verify Login Functionality");
		String headerText=LoginPage.login();
		test.log(LogStatus.PASS, "Verified Login Functionality and Checked Header Text as "  +headerText);
		test.log(LogStatus.PASS, "Test Passed");
	}
	
	@Test(priority = 1)
	public void select3Items() {
		test.log(LogStatus.INFO, "Start verify Selection Of Item Functionality");
		SelectItemPage.select3Item();
		test.log(LogStatus.PASS, "Selected 3 Items");
		test.log(LogStatus.PASS, "Test Passed");
	}
	
	@Test(priority = 2)
	public void verifyselect3Items() {
		test.log(LogStatus.INFO, "Start verify Selection Of Item Functionality");
		int noOfItemInCart=SelectItemPage.veriyselect3ItemInCart();
		test.log(LogStatus.PASS, "Verified the count of Selection in cart "+noOfItemInCart);
		test.log(LogStatus.PASS, "Test Passed");
	}

}
