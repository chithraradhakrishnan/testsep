package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
ChromeDriver driver;
@Before
public void browseopen()
{
	driver= new ChromeDriver();
driver.get("https://www.ebay.com/");
}
@Test
public void Test()
{
	driver.manage().window().maximize();
	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	String exp= "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
	if(actualtitle.equals(exp))
			{
		System.out.println("Test on title: Pass");
			}
	else
	{
		System.out.println("Test on title:Fail");
	}
	
	driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'Art')]")).click();
	
	String content=driver.getPageSource();
	if(content.contains("Shop by Category"))
	{
	System.out.println("The art page contains 'Shop by Category' title");	
	}
	else
	{
		System.out.println("The art page does not contains 'Shop by Category' title");
	}
	driver.findElement(By.xpath("//a[contains(text(),'Art Drawings')]")).click();
driver.findElement(By.xpath("//header/div[@id='gh-top']/ul[@id='gh-eb']/li[@id='gh-minicart-hover']/div[1]/a[1]/*[1]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Start shopping')]")).click();

driver.findElement(By.xpath("//select[@id='gh-cat']")).sendKeys("books",Keys.ENTER);
	
	

}
}
