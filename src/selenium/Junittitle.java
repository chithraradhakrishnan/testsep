package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junittitle {
	
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
	driver=new ChromeDriver();
	driver.get("http://www.google.com");
	}
	
	@Test
	public void test()
	{
		String actualtitle =driver.getTitle();
		System.out.println(actualtitle);
		String exp="Google";
		if(actualtitle.equals(exp))
		{
			
			System.out.println("pass");
				}
			else
			{
			System.out.println("fail");
			}
	}

	@After
	public void browserclose()
	{
		driver.quit();
	}


}



