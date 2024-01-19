package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandlepgn {
	WebDriver driver;
	@BeforeTest
	public void test()
	{
		driver=new ChromeDriver();
	}
@BeforeMethod
public void urlloading()
{
driver.get("http://demo.guru99.com/popup.php");	
}
@Test
public void test1()
{
	String parentWindow=driver.getWindowHandle();
	System.out.println("parent window Title" +driver.getTitle());
	driver.findElement(By.xpath("/html/body/p/a")).click();
	//Set <String> allWindowHandles=driver.getWindowHandles();
	Set<String>allWindowHandles=driver.getWindowHandles();
	for(String handle:allWindowHandles)
	{
		System.out.println(handle);
		if(!handle.equalsIgnoreCase(parentWindow))
		{
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abcd");
			
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
			driver.close();
		}
	driver.switchTo().window(parentWindow);
	}
	
	//WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
	WebDriver driver1=driver.switchTo().newWindow(WindowType.WINDOW);
	driver1.get("http://www.google.com");
	
}
}
