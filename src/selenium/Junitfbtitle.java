package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitfbtitle {
	
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test()
	{
		String actualtitle =driver.getTitle();
		System.out.println(actualtitle);
		String exp="Facebook – log in or sign up";
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



