package vamsi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trainls{
	static String costomer = null;
	public static void main(String args[]) throws IOException, InterruptedException {
		int v=0;
		
		WebDriver driver = null ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Documents\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		
		//poi
		FileInputStream fis = new FileInputStream("C:\\Users\\training\\Documents\\selenium\\XLFiles\\usernames.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowc = ws.getLastRowNum();
		System.out.println("total number of rows are : "+rowc);
		
		int colmn = ws.getRow(0).getLastCellNum();
		System.out.println("total number of columns are"+colmn);
		//String [][] str;
		String [][] data= new String[6][];
		for (int i = 1 ; i < rowc + 1 ; i++)
		{
			for (int j = 0 ; j<colmn-1 ; j++)
			{
				
				XSSFCell username = ws.getRow(i).getCell(j);
				System.out.println("username is "+username.toString());
				String id = username.toString();
				//String[][]  arrayid = null;
				//arrayid[i][j] = id; 
				System.out.println("i "+i+"\t j is :"+j);
				
				data[i][j]=id;
				System.out.println(data[i][j]);
				//driver.findElement(By.id("LoginForm_username")).sendKeys(id);;
				
//			for (int k = 1 ; k < colmn ; k++) 
//			{
//				XSSFCell password = ws.getRow(i).getCell(k);
//				String pw = password.toString();
//				System.out.println("password is "+pw);
//				driver.findElement(By.id("LoginForm_password")).sendKeys(pw);
//			}
//			
//			for ( v = 1 ; v < colmn ; v++) 
//			{
//				XSSFCell password = ws.getRow(i).getCell(v);
//				 costomer = password.toString();
//				System.out.println("password is "+costomer);
//				//*[contains(text(),'Orion')]
//				TimeCardCoading STC = new TimeCardCoading();
//				driver.findElement(By.name("yt0")).click();
//				Thread.sleep(2000);
//				STC.timecard(driver);
//				STC.logout(driver);
//			}
		}
		}
			
	}
}
