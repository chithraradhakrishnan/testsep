package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativeamazon {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
				
	}
@Test
public void Test() 
		throws InterruptedException
{ 
	Thread.sleep(6000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[4]/div[2]/span[2]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Sign in to your account')]")).click();
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abcde@gmail.com");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[2]")).click();
	driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-main']/div[1]/a[1]/i[1]")).click();
}
}
