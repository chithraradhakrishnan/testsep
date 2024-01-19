

package testngassignment;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class Window {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
	driver=new ChromeDriver();
	
	}
@BeforeMethod
public void urlloading()
{
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

@Test
public void test1()
  
{
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

String actualtitle=driver.getTitle();
System.out.println(actualtitle);
String exp="Amazon.in : mobile phones";
		

if(actualtitle.equals(exp))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
String parentWindow=driver.getWindowHandle();

driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();

Set<String>allWindowHandles=driver.getWindowHandles();
for(String handle:allWindowHandles)
{
	
	if(!handle.equalsIgnoreCase(parentWindow))
	{
		driver.switchTo().window(handle);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		
		

	
	}

}
	
}

}
