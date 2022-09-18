package util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportListener implements ITestListener{
	
	protected static ExtentReports reports;
	protected static ExtentTest test;

	public static String resultPath;

	private static String getResultPath() {

		resultPath = "testReport"+System.currentTimeMillis();

		return resultPath;

	}

	String reportLocation = System.getProperty("user.dir") + "/test-output/reports/" + getResultPath() + ".html";

	public void onTestStart(ITestResult result) {

		test = reports.startTest(result.getMethod().getMethodName());
		test.log(LogStatus.INFO, result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		test.log(LogStatus.PASS, "Test is passed");

	}

	public void onTestFailure(ITestResult result) {
		test.log(LogStatus.FAIL, "Test is Failed");

	}

	public void onTestSkipped(ITestResult result) {
		test.log(LogStatus.SKIP, "Test is Skipped");

	}

	public void onStart(ITestContext context) {

		reports = new ExtentReports(reportLocation);

	}

	public void onFinish(ITestContext context) {
		reports.endTest(test);
		reports.flush();

	}

}
