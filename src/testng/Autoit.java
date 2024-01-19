package testng;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class Autoit {
	WebDriver driver;
	@BeforeTest
	public void test()
	{
		driver=new ChromeDriver();
		
	}
@BeforeMethod

public void urlloading()

{
	driver.manage().window().maximize();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
}
@SuppressWarnings("deprecation")
@Test
public void test1() throws Exception
{
driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
Runtime.getRuntime().exec("D:\\autiit12.exe");
}


}
