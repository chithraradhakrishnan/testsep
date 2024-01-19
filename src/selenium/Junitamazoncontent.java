package selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitamazoncontent {

ChromeDriver driver;
@Before
public void browseropen()
{
driver=new ChromeDriver();
driver.get("http://www.amazon.in");
}

@Test
public void test()
{
	String content=driver.getPageSource();
	if(content.contains("password"))
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
