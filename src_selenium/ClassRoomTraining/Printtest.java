package ClassRoomTraining;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Printtest {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("this is before suite");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("this is beforetest");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("this is before class");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("this is before method");
	}
	@Test(priority=1)
	public void test() {
		System.out.println("this is test1");
	}
	@Test(priority=2)
	public void test2() {
		System.out.println("this is test2");
	}
	@Test(priority=3)
	public void test3() {
		System.out.println("this is test3");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("this is aftermethod");
		}
	@AfterClass
	public void afterclass() {
		System.out.println("this is afterclass");
		}
	@AfterTest
	public void aftertest() {
		System.out.println("this is aftertest");
		}
	@AfterSuite
	public void aftersuite() {
		System.out.println("this is aftersuite");
	}
}

