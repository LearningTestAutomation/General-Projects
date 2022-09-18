package ObjectRepository;

import org.openqa.selenium.By;

public class PlanObjects {
	
	public static By premiumPlanAmount=By.xpath("//div[contains(@class,'Premium')]//span[@class='amount']");
	
	public static By basicPlanAmount=By.xpath("//div[contains(@class,'Classic')]//span[@class='amount']");

	public static By litePlanAmount=By.xpath("//div[contains(@class,'Light')]//span[@class='amount']");

	public static By clickEnglish=By.xpath("//span[@class='hide-mobile']");

}
