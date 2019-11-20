package Object_Repository;

import org.openqa.selenium.By;

public class Mynthra_Objects {
	public static final By Profile_icon			=By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[2]/div/div[1]");
	public static final By login_btn1			=By.xpath("//a[contains(text(),'log in')]");
	public static final By Emain_box			=By.xpath("//input[@name='email']");
	public static final By password_box			=By.xpath("//input[@name='password']");
	public static final By login_btn2			=By.xpath("//button[contains(text(),'Log in')]");
	public static final By Search_box			=By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[3]/input");
	public static final By Search_icon			=By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[3]/a");
	public static final By scroll_click_black	=By.xpath("//label[@class='common-customCheckbox']//span[@data-colorhex='black']");
	public static final By Sortby_dropdown		=By.xpath("//div[@class='sort-sortBy']");
	public static final By Sortby_option		=By.xpath("//*[@id='desktopSearchResults']/div[1]/section/div[1]/div[1]/div/div/div/ul/li[2]/label");
	public static final By addToBag				=By.xpath("//*[@id='mountRoot']/div/div/main/div[2]/div[2]/div[3]/div/div[1]");
	public static final By Size 				=By.xpath("//*[@id='sizeButtonsContainer']/div[2]/div[1]/div[1]/button/p"); 
	public static final By Bag_icon 			=By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[2]/a[2]/span[3]");
	public static final By Quantity				=By.xpath("//*[@id='cartItemsList']/div/div/div/div/div[2]/div/div[3]/div[2]/span[2]");
	public static final By Slct_Quantity		=By.id("3");
	public static final By remove 				=By.xpath("//*[@id='cartItemsList']/div/div/div/div/div[3]/div[1]");
	public static final By confrm_remove 		=By.xpath("//*[@id='cartItemsList']/div/div/div/div/div[4]/div/div[2]/div/div[2]/button");
	public static final By List_prices 			=By.xpath("//div[@class='product-price']/span/span[1]");
}