package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		//Chromeoptions options=new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//driver=new ChromeDriver(options);
		driver=new ChromeDriver();
		
	}
@BeforeMethod
public void url()
{
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}
}
