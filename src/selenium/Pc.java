package selenium;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
public class Pc {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	}
@Test
public void Test()
{
driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
}
}
