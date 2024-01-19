package selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitfbcont {
	ChromeDriver driver;
	@Before
	public void browsopen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void test()
	{
		String content=driver.getPageSource();
		if(content.contains("login"))
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
