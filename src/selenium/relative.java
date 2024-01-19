package selenium;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative {
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
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chitraradhakrishnan63@gmail.com");	
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Janavjay01");
	driver.findElement(By.xpath("//button[@name='login']")).click();
}

}
