package StepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import BuissnessMethods.BaseSetUpDriver_Mynthra;
import Object_Repository.Mynthra_Objects;

import Utilities.CommonMethods;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Mynthra_StpDef extends Mynthra_Objects{
	//Actions act = new Actions(BaseSetUpDriver.getDriver());

	@Before
	public static void additional_classes() {
		System.out.println("initiated");
		BaseSetUpDriver_Mynthra.browsertrigger();
		//BaseSetUpDriver.getDriver().manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	@Given("^: launching a Mynthra website$")
	public void launching_a_Mynthra_website() throws Throwable {
		System.out.println("browser is launching");
}

	@Then("^: login to the website by passing \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_to_the_website_by_passing_and(String arg1, String arg2) throws Throwable {
	Actions act = new Actions(BaseSetUpDriver_Mynthra.getDriver());
	WebElement ele = CommonMethods.norm_method(Mynthra_Objects.Profile_icon);
	act.moveToElement(ele);
	WebElement ele1 = CommonMethods.norm_method(Mynthra_Objects.login_btn1);
	act.moveToElement(ele1).click().build().perform();
	CommonMethods.sendKeysMethod(Mynthra_Objects.Emain_box, arg1);
	CommonMethods.sendKeysMethod(Mynthra_Objects.password_box, arg2);
	CommonMethods.clickMethod(Mynthra_Objects.login_btn2);

}

@Then("^: Searching for a product$")
public void searching_for_a_product() throws Throwable {
	String b=CommonMethods.readFillo();
	CommonMethods.sendFillo(Mynthra_Objects.Search_box,b);
	CommonMethods.clickMethod(Mynthra_Objects.Search_icon);
}

@Then("^: sorting by Popularity$")
public void sorting_by_Popularity() throws Throwable {
	Actions act = new Actions(BaseSetUpDriver_Mynthra.getDriver());
	act.moveToElement(CommonMethods.norm_method(Mynthra_Objects.Sortby_dropdown));
	Thread.sleep(2000);
	act.moveToElement(CommonMethods.norm_method(Mynthra_Objects.Sortby_option)).click().build().perform();
	
}

@Then("^: click on the product by a larger price\\(Scroll up and down\\)$")
public void click_on_the_product_by_a_larger_price_Scroll_up_and_down() throws Throwable {

   Thread.sleep(2000);
   String ss = "aa";
	TreeMap<String, String> map = new TreeMap<String, String>();
	TreeSet<String> lis =  new TreeSet<String>();
	TreeSet<String> lis1 =  new TreeSet<String>();
	WebElement elem;
	List<WebElement> ele =BaseSetUpDriver_Mynthra.getDriver().findElements(Mynthra_Objects.List_prices);
	int size = ele.size();
	for(int i=0;i<size;i++)
	{
	elem = ele.get(i);
	String text = elem.getText();
	map.put(ss+i, text);

	}
	System.out.println(map);
	for(Map.Entry<String, String> data : map.entrySet())
	{
	String data1 = data.getKey();
	String data2 = data.getValue();
	lis.add(data2);
	}
	System.out.println(lis);
	String out = Collections.max(lis);
	System.out.println(out);
	String  da = lis.toString();
	String[] split = da.split("Rs.");
	String[] split1 = split[1].split(",");
	String splittt = split1[0];
	lis1.add(splittt);
	String max = Collections.max(lis1);
	String min = Collections.min(lis1);
	System.out.println(max);
	System.out.println(min);
	for(int i=0;i<size;i++)
	{
	elem = ele.get(i);
	String text = elem.getText();
	   if(text.contains(max))
	   {
	    elem.click();
	   }
	}
}

@Then("^: Switching to the window of the clicked product$")
public void switching_to_the_window_of_the_clicked_product() throws Throwable {
	ArrayList<String> tabs2 = new ArrayList<String> (BaseSetUpDriver_Mynthra.getDriver().getWindowHandles());
	BaseSetUpDriver_Mynthra.getDriver().switchTo().window(tabs2.get(1));
	
	Thread.sleep(15000);
}

@Then("^: Select the size of the product$")
public void select_the_size_of_the_product() throws Throwable {
    
	CommonMethods.clickMethod(Mynthra_Objects.Size);
	
   
}

@Then("^: clicking add to bag$")
public void clicking_add_to_bag() throws Throwable {
	CommonMethods.clickMethod(Mynthra_Objects.addToBag);
	Thread.sleep(1500);
	CommonMethods.clickMethod(Mynthra_Objects.Bag_icon);
	Thread.sleep(1500);
	
	
}

@Then("^: taking screenshot after clicking bag icon$")
public void taking_screenshot_after_clicking_bag_icon() throws Throwable {
	
	TakesScreenshot scr = (TakesScreenshot) BaseSetUpDriver_Mynthra.getDriver();
	File src = scr.getScreenshotAs(OutputType.FILE);
	File dstn = new File("C:\\Users\\training\\Desktop\\mythra.png");
	FileHandler.copy(src, dstn);	
	CommonMethods.clickMethod(Mynthra_Objects.Quantity);
	Thread.sleep(1500);
	
	CommonMethods.clickMethod(Mynthra_Objects.Slct_Quantity);

}

@Then("^: click on the quantity of the product  and take screenshot$")
public void click_on_the_quantity_of_the_product_and_take_screenshot() throws Throwable {
	Thread.sleep(1500);
	TakesScreenshot scr = (TakesScreenshot) BaseSetUpDriver_Mynthra.getDriver();
	File src = scr.getScreenshotAs(OutputType.FILE);
	File dstn = new File("C:\\Users\\training\\Desktop\\mythra1.png");
	FileHandler.copy(src, dstn);	
	
	CommonMethods.clickMethod(Mynthra_Objects.remove);
	Thread.sleep(1500);
	CommonMethods.clickMethod(Mynthra_Objects.confrm_remove);
	
}


}
