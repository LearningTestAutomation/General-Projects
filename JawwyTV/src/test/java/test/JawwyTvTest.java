package test;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import TestPages.PlanPage;
import baseTest.BaseTest;

public class JawwyTvTest extends BaseTest{
	
	@Test
	public static void verifyPremiumPlan(){
		
		test.log(LogStatus.INFO, "Starting verify Premium Plan");
		String PremiumAmount=PlanPage.verifyPremiumplan();
		test.log(LogStatus.PASS, "Verified Premium Amount as"  +PremiumAmount);
		test.log(LogStatus.PASS, "Test Passed");
		
	}
	
	@Test
	public static void verifyBasicPlan(){
		
		test.log(LogStatus.INFO, "Starting verify Basic Plan");
		String basicAmount=PlanPage.verifyBasicplan();
		test.log(LogStatus.PASS, "Verified Basic Amount as"  +basicAmount);
		test.log(LogStatus.PASS, "Test Passed");
		
	}
	
	@Test
	public static void verifylitePlan(){
		
		test.log(LogStatus.INFO, "Starting verify Basic Plan");
		String liteAmount=PlanPage.verifyLiteplan();
		test.log(LogStatus.PASS, "Verified Basic Amount as"  +liteAmount);
		test.log(LogStatus.PASS, "Test Passed");
		
	}


}


