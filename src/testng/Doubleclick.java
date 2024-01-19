package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Doubleclick {
	WebDriver driver;
	@BeforeTest
	public void test()
	{
		driver=new ChromeDriver();
	}
@BeforeMethod
public void openurl()
{
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();

}
@Test
public void guru() throws InterruptedException
{
	Thread.sleep(10000);
	WebElement rc=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
WebElement rcedt=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
WebElement dble=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));

	Actions act=new Actions(driver);

act.contextClick(rc).perform();	
rcedt.click();
Alert a=driver.switchTo().alert();
System.out.println(a.getText());
a.accept();

act.doubleClick(dble).perform();
Alert b=driver.switchTo().alert();
System.out.println(b.getText());
b.accept();

}
}
