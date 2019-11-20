package Utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import BuissnessMethods.BaseSetUpDriver_Flipkart;

import StepDefinition_Flipkart.Flipkart_StpDef;


public class CommonMethods_Flipkart extends Flipkart_StpDef {
	public static WebElement norm_method(By by) {
		WebElement ele = BaseSetUpDriver_Flipkart.getDriver().findElement(by);
		return ele;
	}
	public static void clickMethod(By by)
	{
		WebElement we=BaseSetUpDriver_Flipkart.getDriver().findElement(by);
		we.click();
	}
	public static void sendKeysMethod(By byy,String args) throws IOException
	{
		Properties p=new Properties();
		BufferedReader rr=new BufferedReader(new FileReader("C:\\Users\\training\\Desktop\\BDDCucumberFrameWork\\PropertyList\\Flipkart.properties"));
		p.load(rr);
		WebElement we=BaseSetUpDriver_Flipkart.getDriver().findElement(byy);
		we.sendKeys(p.getProperty(args));
	}
	public static void sendFillo(By byy,String argss)
	{
		WebElement we=BaseSetUpDriver_Flipkart.getDriver().findElement(byy);
		we.sendKeys(argss);
	}
	public static String readFillo() throws FilloException
	{
		String data = null;
		Fillo fll = new Fillo();
		Connection conn = fll.getConnection("src/main/resources/TestData/TestData.xlsx");
		String stquery = "Select * from Sheet1 where Scenario='search1'";
		Recordset rs = conn.executeQuery(stquery);
		
		
		System.out.println(rs.getFieldNames());
		while(rs.next())
		{
			System.out.println(rs.getField("Values"));
			 data=rs.getField("Values");
		
		}
		
		 
		conn.close();
		return data;
	}

}

