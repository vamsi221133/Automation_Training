package TestNG;

	import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class MultipleBrowserTestNG {
		@BeforeTest
		@Parameters({"browser"})
		public void beforeTest(String Chrome)
		{
			MultipleBrowsers.getInstance().setBrowser(Chrome);
		}
		@Test
		@Parameters({"browsers"})
		public void test() throws MalformedURLException
		{
			System.out.println("At Test//");
			Parallels ob = new Parallels();
			ob.launchbrowser();
		}

	}



