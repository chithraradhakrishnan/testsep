package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklg {
	ChromeDriver driver;
	@Before
	public void broseropen()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	
@Test
public void Test()
	{
	driver.findElement(By.id("email")).sendKeys("chitraradhakrishnan63@gmail.com");	
	driver.findElement(By.id("pass")).sendKeys("Janavjay01");
	driver.findElement(By.name("login")).click();
	}

}
