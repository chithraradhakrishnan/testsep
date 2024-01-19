package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {
	ChromeDriver driver;
	@Before
	public void broseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
@Test
public void Test()
	{
	driver.findElement(By.id("user-name")).sendKeys("standard_user");	
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.name("login-button")).click();
	}

}
