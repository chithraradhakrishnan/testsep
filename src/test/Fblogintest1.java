package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pages.Fbloginpage1;


public class Fblogintest1 {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
@BeforeMethod
public void url()
{
	driver.get("https://www.facebook.com/");
}
@Test
public void login()
{
	 Fbloginpage1 ob=new  Fbloginpage1(driver);
	ob.click();
	
}
}



