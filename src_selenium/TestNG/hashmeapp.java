package TestNG;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hashmeapp {
	static WebDriver driver;
	public static void vamsi() {

	String ss = "aa";
	TreeMap<String, String> map = new TreeMap<String, String>();
	TreeSet<String> lis =  new TreeSet<String>();
	TreeSet<String> lis1 =  new TreeSet<String>();
	WebElement elem;
	List<WebElement> ele =driver.findElements(By.xpath("//div[@class='product-price']/span/span[1]"));
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
	}}
	public void vamsi2() {
		WebDriver driver = null;
		int maxi = 0;
		 WebElement maxprice = null ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.myntra.com/tshirts?sort=price_desc");
		HashMap ob = new HashMap();
		//System.out.println(ob);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='product-price']"));
		//ArrayList<String> str= new ArrayList<String>();
		Map mp= new TreeMap();
		System.out.println(ele.size());
		for(int i =1;i<ele.size();i++)
		{
			WebElement el = driver.findElement(By.xpath("(//div[@class='product-price'])["+i+"]"));
			ob.put(i, el.getText());
			String text=el.getText();
			String[] st = text.split(" ");
			String price = st[1];
			String[] p1=price.split("R");
			mp.put(i, p1[0]);
			//System.out.println( mp);
		  
		    //System.out.println("Maximum Element of Java ArrayList is : " +max);
		    
		   
	} 
		System.out.println(mp);
		maxi = (int) Collections.max(mp.keySet());
	System.out.println(maxi);
		driver.findElement(By.xpath("(//div[@class='product-price'])["+maxi+"]")).click();;
		// maxprice.click();
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.myntra.com/tshirts?sort=price_desc");
		vamsi();
}
}