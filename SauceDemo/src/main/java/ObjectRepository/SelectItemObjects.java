package ObjectRepository;

import org.openqa.selenium.By;

import baseTest.BaseTest;

public class SelectItemObjects extends BaseTest{

	public static By select1stItem=By.xpath("//div[text()='"+prop.getProperty("firstItemName")+"']/ancestor::div[@class='inventory_item_description']//div[@class='pricebar']//button");
	public static By select2ndItem=By.xpath("//div[text()='"+prop.getProperty("SecondItemName")+"']/ancestor::div[@class='inventory_item_description']//div[@class='pricebar']//button");;
	public static By select3rdItem=By.xpath("//div[text()='"+prop.getProperty("thirdItemName")+"']/ancestor::div[@class='inventory_item_description']//div[@class='pricebar']//button");
	public static By noOfItemInCart=By.xpath("//*[@id='shopping_cart_container']//span");
}
