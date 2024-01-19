package selenium; 
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazonassignment {
	ChromeDriver driver;
	@Before
	public void browseropen()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon");
				
	}
@Test
public void Test()
{
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).sendKeys("mobiles");
	driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
	driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).click();
	//driver.findElement(By.xpath(//*[@id="continue"])).click();
	//driver.findElement(By.xpath("")).click();
	//driver.navigate().back();
	//driver.navigate().back();
	//driver.navigate().back();
}
}
