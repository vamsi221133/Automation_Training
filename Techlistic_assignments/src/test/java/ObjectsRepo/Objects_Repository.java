package ObjectsRepo;

import org.openqa.selenium.By;

public class Objects_Repository {
//	Assignment 2
	public static final By  JavaTutorial = By.xpath("//*[text()='Java Tutorial']");
	public static final String title1 = "Java Tutorials Series - Java For Selenium";
	
	public static final By  Home = By.xpath("(//ul[@class='tabs']//a[text()='Home'])[1]");
	public static final By  SeleniumTuto = By.xpath("//*[text()='Selenium Tutorial']");
	public static final String title2 = "Selenium Tutorial - Learn Selenium from Comprehensive Series of 40 Coding Tutorials";
	public static final By  Selenium_Blogs  = By.xpath("(//a[text()='Selenium'])[1]");
	public static final String title3 = "Selenium Tutorial - Learn Selenium from Comprehensive Series of 40 Coding Tutorials";
	public static final By  TestNG_Blog = By.xpath("(//a[text()='TestNG'])[1]");
	public static final String title4	 = "Selenium with TestNG Integration - Tutorial Series";

	//	Assignment 3	
	public static final By  Fname = By.xpath("//input[@name='firstname']");
	public static final By  Lname = By.xpath("//input[@name='lastname']");
	public static final By  gender = By.xpath("//input[@id='sex-0']");
	public static final By  Yexp = By.xpath("//input[@id='exp-5']");
	public static final By  date = By.xpath("//input[@id='datepicker']");
	public static final By  tester = By.xpath("//input[@id='profession-1']");
	public static final By  tool = By.xpath("//input[@id='tool-2']");
	public static final By  continents = By.xpath("//select[@id='continents']");
	public static final By  continents_option = By.xpath("//select[@id='continents']//option[1]");
	public static final By  MultiSelect = By.xpath("//select[@id='selenium_commands']//option[5]");
	public static final By  photo = By.xpath("//*[@id='photo']");
	public static final String Pic_Path= "C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg";
	public static final By  download = By.xpath("//a[text()='Click here to Download File']");//need to go back
	public static final By  submit = By.xpath("//button[@id='submit']");
//	public static final By  Lname = By.xpath("//input[@name='lastname']");
	

}
