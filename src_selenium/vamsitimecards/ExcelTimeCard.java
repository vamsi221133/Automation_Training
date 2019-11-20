package vamsitimecards;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExcelTimeCard {
	
	static String value;
	static XSSFCell username,Activity,Activity1,Project,customer,Work,mon,tue,wed,thu,fri,sat,sun,mon1,tue1,wed1,thu1,fri1,sat1,sun1;
	static WebDriver driver;
	static XSSFCell pw;
	static void init() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
	}
	static void dataXL() throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\training\\Documents\\selenium\\XLFiles\\usernames.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowc = ws.getLastRowNum();
		System.out.println("total number of rows are : "+rowc);
		
		int colmn = ws.getRow(0).getLastCellNum();
		System.out.println("total number of columns are : "+colmn);
		for(int i=1;i<rowc+1;i++) {
			for(int j=0;j<colmn;j++) {
				
				XSSFCell name = ws.getRow(0).getCell(j);
				value = name.getStringCellValue();
			if(value.contentEquals("user_name")) {
				username = ws.getRow(i).getCell(j);
				System.out.println(username);
			}
			else if(value.contentEquals("password")) {
				pw = ws.getRow(i).getCell(j) ;
				System.out.println(pw);
			}
			else if(value.contentEquals("customer")) {
				customer = ws.getRow(i).getCell(j) ;
				System.out.println(customer);
			}
			else if(value.contentEquals("Project")) {
				Project = ws.getRow(i).getCell(j) ;
				System.out.println(Project);
			}
			else if(value.contentEquals("Activity")) {
				Activity = ws.getRow(i).getCell(j) ;
				System.out.println(Activity);
			}
			else if(value.contentEquals("Work Location")) {
				Work = ws.getRow(i).getCell(j) ;
				System.out.println(Work);
			}
			else if(value.contentEquals("Mon")) {
				mon = ws.getRow(i).getCell(j) ;
				System.out.println(mon);
			}
			else if(value.contentEquals("Tue")) {
				tue = ws.getRow(i).getCell(j) ;
				System.out.println(tue);
			}
			else if(value.contentEquals("Wed")) {
				wed = ws.getRow(i).getCell(j) ;
				System.out.println(wed);
			}
			else if(value.contentEquals("Thu")) {
				thu = ws.getRow(i).getCell(j) ;
				System.out.println(thu);
			}
			else if(value.contentEquals("Fri")) {
				fri = ws.getRow(i).getCell(j) ;
				System.out.println(fri);
			}
			else if(value.contentEquals("Sat")) {
				sat = ws.getRow(i).getCell(j) ;
				System.out.println(sat);
			}
			else if(value.contentEquals("Sun")) {
				sun = ws.getRow(i).getCell(j) ;
				System.out.println(sun);
			}
			else if(value.contentEquals("Mon1")) {
				mon1 = ws.getRow(i).getCell(j) ;
				System.out.println(mon1);
			}
			else if(value.contentEquals("Tue1")) {
				tue1 = ws.getRow(i).getCell(j) ;
				System.out.println(tue1);
			}
			else if(value.contentEquals("Wed1")) {
				wed1 = ws.getRow(i).getCell(j) ;
				System.out.println(wed1);
			}
			else if(value.contentEquals("Thu1")) {
				thu1 = ws.getRow(i).getCell(j) ;
				System.out.println(thu1);
			}
			else if(value.contentEquals("Fri1")) {
				fri1 = ws.getRow(i).getCell(j) ;
				System.out.println(fri1);
			}
			else if(value.contentEquals("Sat1")) {
				sat1 = ws.getRow(i).getCell(j) ;
				System.out.println(sat1);
			}
			else if(value.contentEquals("Sun1")) {
				sun1 = ws.getRow(i).getCell(j) ;
				System.out.println(sun1);
			}
			else if(value.contentEquals("Activity1")) {
				Activity1 = ws.getRow(i).getCell(j) ;
				System.out.println(Activity1);
			}
			}
			
		}
	}
	static void login() {
		WebElement id = driver.findElement(By.id("LoginForm_username"));
		String str=username.getStringCellValue();
		id.sendKeys(str);
		WebElement	pas = driver.findElement(By.id("LoginForm_password"));
		String pasw = pw.getStringCellValue();
		pas.sendKeys(pasw);
		driver.findElement(By.name("yt0")).click();
	}
 	public static  void timecard() throws InterruptedException {
 			int vamsip = 8;
 			int vamsio=0;
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele =   driver.findElement(By.xpath("//a[contains(text(),'Timecard')]//img"));
		act.moveToElement(ele);
		Thread.sleep(2000);
		WebElement mytimecard  =   driver.findElement(By.xpath("//a[@href='/index.php/Timesheetitems/create']"));
		act.moveToElement(mytimecard);
		Thread.sleep(2000);
		act.click().build().perform();
		driver.findElement(By.xpath("//select[@onchange='textchange()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@onchange='textchange()']//option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='TimesheetItems[client_id]']")).click();
		Thread.sleep(2000);
		String str = "'"+customer.getStringCellValue()+"'";
		driver.findElement(By.xpath("//option[contains(text(),"+str+")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='TimesheetItems[project_id]']")).click();
		Thread.sleep(2000);
		String proj = "'"+Project.getStringCellValue()+"'";
		driver.findElement(By.xpath("//option[contains(text(),"+proj+")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='TimesheetItems[activity_id]']")).click();
		Thread.sleep(2000);
		String activity = "'"+Activity.getStringCellValue()+"'";
		driver.findElement(By.xpath("//option[contains(text(),"+activity+")]")).click();
		
		driver.findElement(By.xpath("//select[@name='TimesheetItems[project_location]']")).click();
		String work ="'"+Work.getStringCellValue()+"'";
		driver.findElement(By.xpath("//option[contains(text(),"+work+")]")).click();
		Thread.sleep(2000);
		int m= (int) mon.getNumericCellValue();
		int t=(int) tue.getNumericCellValue();
		int w=(int) wed.getNumericCellValue();
		int th=(int) thu.getNumericCellValue();
		int f=(int) fri.getNumericCellValue();
		int s=(int) sat.getNumericCellValue();
		int su=(int) sun.getNumericCellValue();
		int n =6;
		//if(mon.getNumericCellValue()==8) {
		driver.findElement(By.id("TimesheetItems_duration")).sendKeys(""+m+"");;
		
		driver.findElement(By.xpath("//input[@id='TimesheetItems_duration2']")).sendKeys(""+t+"");
		
		driver.findElement(By.xpath("//input[@id='TimesheetItems_duration3']")).sendKeys(""+w+"");
		
		driver.findElement(By.xpath("//input[@id='TimesheetItems_duration4']")).sendKeys(""+th+"");
		
		driver.findElement(By.xpath("//input[@id='TimesheetItems_duration5']")).sendKeys(""+f+"");
	
		driver.findElement(By.xpath("//input[@id='TimesheetItems_duration6']")).sendKeys(""+s+"");
		
		driver.findElement(By.xpath("//input[@id='TimesheetItems_duration7']")).sendKeys(""+su+"");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(2000);
		
		
		////for leave
		driver.findElement(By.xpath("//select[@onchange='textchange()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@onchange='textchange()']//option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='TimesheetItems[client_id]']")).click();
		Thread.sleep(2000);
		String str1 = "'"+customer.getStringCellValue()+"'";
		driver.findElement(By.xpath("//option[contains(text(),"+str1+")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='TimesheetItems[project_id]']")).click();
		Thread.sleep(2000);
		String proj1 = "'"+Project.getStringCellValue()+"'";
		driver.findElement(By.xpath("//option[contains(text(),"+proj1+")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='TimesheetItems[activity_id]']")).click();
		Thread.sleep(2000);
		String activity1 = "'"+Activity1.getStringCellValue()+"'";
		driver.findElement(By.xpath("//option[contains(text(),"+activity1+")]")).click();
		
		driver.findElement(By.xpath("//select[@name='TimesheetItems[project_location]']")).click();
		String work1 ="'"+Work.getStringCellValue()+"'";
		driver.findElement(By.xpath("//option[contains(text(),"+work1+")]")).click();
		int m1= (int) mon.getNumericCellValue();
		int t1=(int) tue.getNumericCellValue();
		int w1=(int) wed.getNumericCellValue();
		int th1=(int) thu.getNumericCellValue();
		int f1=(int) fri.getNumericCellValue();
		int s1=(int) sat.getNumericCellValue();
		int su1=(int) sun.getNumericCellValue();
		
driver.findElement(By.id("TimesheetItems_duration")).sendKeys(""+m1+"");;
		
		driver.findElement(By.xpath("//input[@id='TimesheetItems_duration2']")).sendKeys(""+t1+"");
		driver.findElement(By.xpath("//input[@id='TimesheetItems_duration3']")).sendKeys(""+w1+"");
		driver.findElement(By.xpath("//input[@id='TimesheetItems_duration4']")).sendKeys(""+th1+"");
		driver.findElement(By.xpath("//input[@id='TimesheetItems_duration5']")).sendKeys(""+f1+"");
		driver.findElement(By.xpath("//input[@id='TimesheetItems_duration6']")).sendKeys(""+s1+"");
		driver.findElement(By.xpath("//input[@id='TimesheetItems_duration7']")).sendKeys(""+su1+"");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element	= driver.findElement(By.xpath("//input[@value='Save']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",element);
		element.click();
		Thread.sleep(2000);
		
		WebElement element1	= driver.findElement(By.xpath("//input[@id='submitweekly']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",element1);
		//element1.click();
		Thread.sleep(2000);
		System.out.println("time cards submited successfully");
		return;
		 } 
		
	public static void main(String[] args) throws IOException, InterruptedException {
		dataXL();
		init();
		login();
		timecard();
		

}
}
