package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;


public class Autoitsendkeys {
	WebDriver driver;
	@BeforeTest
	public void test()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
@BeforeMethod
public void urlloading()
{
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/upload");
	
}
@Test
public void test1() throws Exception
{
driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("D:/ldc22.pdf");
driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();

}
}
