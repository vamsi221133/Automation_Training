import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Fillo_connect_renu {
	static WebDriver driver = null;
	static String username = null,password = null;
	static void method() throws FilloException {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection("C:\\Users\\training\\Documents\\selenium\\XLFiles\\Book1.xlsx");
		String strQuary = "Select * from Sheet1";
		Recordset rc = connection.executeQuery(strQuary);
		while(rc.next()) {
			init();
			System.out.println(rc.getField("username"));
			username = rc.getField("username");
			System.out.println(rc.getField("password"));
			password =rc.getField("password");
			code();
		}
	}
	static void init() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
	}
	static void code() {
		driver.findElement(By.id("LoginForm_username")).sendKeys(""+username+"");
		driver.findElement(By.id("LoginForm_password")).sendKeys(""+password+"");
	}
	public static void main(String[] args) throws FilloException {
		method();

	}

}