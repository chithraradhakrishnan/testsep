package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolute {
	ChromeDriver driver;
	@Before
	public void browseopen()
	{
	driver= new ChromeDriver();
	driver.get("http://www.facebook.com");
	}
@Test
public void Test()
{
	driver.findElement(By.id("email")).sendKeys();	
	driver.findElement(By.id("password")).sendKeys();
	driver.findElement(By.name("login")).click();
}

}
