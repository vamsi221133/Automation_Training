package BDD_programs;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BDD_Sample {
	@Test(groups = {"Maveric","Systems"})
	public void method1() {
		System.out.println("this method contains maveric and systems");
	}
	@Test(groups = {"Systems","ltd"})
	public void method2() {
		System.out.println("thos method contains systems and ltd");
	}
	@Test(groups = {"chennai","ltd"})
	public void method3() {
		System.out.println("thos method contains chennai and ltd");
	}
	@BeforeTest(alwaysRun = true)
	public void beforetst() {
		System.out.println("Before test");
	}
	@AfterTest
	public void Aftertst() {
		System.out.println("After test");
	}
	

}
