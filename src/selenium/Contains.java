package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
@Test
public void Test()
{
	driver.findElement(By.xpath("//*[contains(@id,'email')]")).sendKeys("abcd@gmail.com");
	driver.findElement(By.xpath("//*[contains(@name,'pass')]")).sendKeys("abc");
driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		
}
}




