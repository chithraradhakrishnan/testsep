package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchgooglevalue {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver =new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
@Test
public void test()
{
	driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	//driver.findElement(By.name("btnK")).click();
}
}
